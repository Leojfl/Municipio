package com.example.myapplication.iu;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.database.SqlLite;
import com.example.myapplication.database.entitys.Municipio;
import com.example.myapplication.database.entitys.Riesgo;

import java.util.ArrayList;
import java.util.List;


/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class AnimalsFragment extends Fragment implements CompoundButton.OnCheckedChangeListener {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;


    CheckBox form_inundacion;
    CheckBox form_deslave;
    CheckBox form_zona_sísmica;
    CheckBox form_incendio_forestal;
    CheckBox form_zona_volcanica;
    CheckBox form_derrumbes;
    AutoCompleteTextView form_text;
    ArrayAdapter adapter;
String []cc={"aaaa","a","a"};

    int type = 1;


    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public AnimalsFragment(int type) {

        this.type = type;
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static AnimalsFragment newInstance(int columnCount) {
        AnimalsFragment fragment = new AnimalsFragment(1);
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = null;
        switch (this.type) {
            case 1:

                view = inflater.inflate(R.layout.fragment_animals_list, container, false);
                form_text = view.findViewById(R.id.form_name);

                break;
            case 2:
                view = inflater.inflate(R.layout.fragment_animals_list_id, container, false);
                form_text = view.findViewById(R.id.form_name);
                break;
            case 3:
                view = inflater.inflate(R.layout.fragment_animals_zona, container, false);

                form_inundacion = view.findViewById(R.id.form_inundacion);
                form_deslave = view.findViewById(R.id.form_deslave);
                form_zona_sísmica = view.findViewById(R.id.form_zona_sísmica);
                form_incendio_forestal = view.findViewById(R.id.form_incendio_forestal);
                form_zona_volcanica = view.findViewById(R.id.form_zona_volcanica);
                form_derrumbes = view.findViewById(R.id.form_derrumbes);


                form_inundacion.setOnCheckedChangeListener(this);
                    form_deslave.setOnCheckedChangeListener(this);
                form_zona_sísmica.setOnCheckedChangeListener(this);
                    form_incendio_forestal.setOnCheckedChangeListener(this);
                form_zona_volcanica.setOnCheckedChangeListener(this);
                    form_derrumbes.setOnCheckedChangeListener(this);

                break;

        }


        // Set the adapter
        RecyclerView viewRe = view.findViewById(R.id.list);


        if (viewRe instanceof RecyclerView) {
            Context context = viewRe.getContext();
            RecyclerView recyclerView = viewRe;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }

            SqlLite sqlite = new SqlLite(view.getContext());
            sqlite.opeen();
            Cursor cursor = sqlite.getRegistro(Municipio.table1);
            List<Municipio> listMunicipios = Municipio.municipios(cursor);
            String[] names = new String[listMunicipios.size()];

            for (int x = 0; x < listMunicipios.size(); x++) {
                Municipio municipio = listMunicipios.get(x);
                Cursor cursorRiesgo = sqlite.getRegistros(Riesgo.table, "WHERE FK_ID_MUNICIPIOS=" + municipio.getID());
                List<Riesgo> riesgos = Riesgo.riesgos(cursorRiesgo);
                municipio.setRiesgos(riesgos);
                if (type == 1) {
                    names[x]=(municipio.getNOMBRE().trim());
                }
                if (type == 2) {
                    names[x]=(municipio.getID().trim());
                }
            }



            if (type != 3) {
                adapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, names);
                form_text.setAdapter(adapter);
                form_text.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                        Cursor cursor= sqlite.getRegistros(Municipio.table1," WHERE NOMBRE  LIKE \"%"+form_text.getText().toString().trim()+"%\"");
                        if(type==2){
                            cursor= sqlite.getRegistros(Municipio.table1," WHERE ID  LIKE \"%"+form_text.getText().toString().trim()+"%\"");
                        }
                        List<Municipio> listMunicipios = Municipio.municipios(cursor);
                        for (int x = 0; x < listMunicipios.size(); x++) {
                            Municipio municipio = listMunicipios.get(x);
                            Cursor cursorRiesgo = sqlite.getRegistros(Riesgo.table, "WHERE FK_ID_MUNICIPIOS=" + municipio.getID());
                            List<Riesgo> riesgos = Riesgo.riesgos(cursorRiesgo);
                            municipio.setRiesgos(riesgos);
                        }
                        recyclerView.setAdapter(new MyanimalsRecyclerViewAdapter(listMunicipios));
                    }
                });
            }
            recyclerView.setAdapter(new MyanimalsRecyclerViewAdapter(listMunicipios));


        }
        return view;
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public void filter(AdapterView<?> var1, View var2, int var3, long var4){


        Toast.makeText(this.getContext(), form_text.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void filterCheck(){


        if(form_inundacion.isChecked()){


        }

        if(form_deslave.isChecked()){


        }

        if(form_zona_sísmica.isChecked()){


        }

        if(form_incendio_forestal.isChecked()){


        }
        if(form_zona_volcanica.isChecked()){


        }
        if(form_derrumbes.isChecked()){


        }




    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name

        void onListFragmentInteraction(Municipio item);
    }



}
