package com.example.myapplication.iu;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.MapsActivity;
import com.example.myapplication.R;
import com.example.myapplication.database.entitys.Municipio;
import com.example.myapplication.database.entitys.Riesgo;

import java.util.List;


public class MyanimalsRecyclerViewAdapter extends RecyclerView.Adapter<MyanimalsRecyclerViewAdapter.ViewHolder> {

    private final List<Municipio> mValues;

    public MyanimalsRecyclerViewAdapter(List<Municipio> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.fragment_animals, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        holder.mItem = mValues.get(position);
        holder.mNameView.setText(holder.mItem.getNOMBRE());
        holder.mIdView.setText(holder.mItem.getID());
        holder.mContentView.setText(holder.mItem.datos() + "\n");

        List<Riesgo> riesgos = holder.mItem.getRiesgos();

        String riesgosString = "Riesgos \n";
        for (int x = 0; x < riesgos.size(); x++) {
            Riesgo riesgo = riesgos.get(x);
            riesgosString += " " + riesgo.getNOMBRE() + "\n";
        }
        holder.mContentView.setText(holder.mContentView.getText() + riesgosString);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), holder.mItem.getID(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), MapsActivity.class);
                intent.putExtra("latitud",holder.mItem.getLATITUD());
                intent.putExtra("longitud",holder.mItem.getLONGITUD());
                intent.putExtra("stringRiesgos",holder.mItem.riesgos());
                intent.putExtra("stringDatos",holder.mItem.datos());
                intent.putExtra("name",holder.mItem.getNOMBRE());

                v.getContext().startActivity(intent, null);


            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mNameView;
        public final TextView mContentView;
        public Municipio mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mNameView = (TextView) view.findViewById(R.id.item_name);
            mIdView = (TextView) view.findViewById(R.id.item_id);
            mContentView = (TextView) view.findViewById(R.id.item_content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
