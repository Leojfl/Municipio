package com.example.myapplication.iu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.myapplication.MapsActivity;
import com.example.myapplication.R;
import com.example.myapplication.database.SqlLite;
import com.example.myapplication.database.entitys.Municipio;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CreateFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class CreateFragment extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener mListener;

    Button form_search, form_cancel, form_accept;
    TextView title, textViewID, textViewSignificado, textViewCabecera, textViewName, textViewSuperficie, textViewAltirud;
    Spinner spinnerClima;
    View view;
    SqlLite sqlite;
    ArrayAdapter<CharSequence> adapter;
    SupportMapFragment mapFragment;

    String id = "";
    String name = "";
    String significado = "";
    String cabecera = "";
    String superficie = "";
    String altitud = "";
    String clima = "";
    CheckBox form_inundacion;
    CheckBox form_deslave;
    CheckBox form_zona_sísmica;
    CheckBox form_incendio_forestal;
    CheckBox form_zona_volcanica;
    CheckBox form_derrumbes;


    Municipio newMunicipio = null;

    public CreateFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_create, container, false);
        form_search = view.findViewById(R.id.form_search);
        form_search.setVisibility(View.INVISIBLE);
        view.findViewById(R.id.form_id2).setVisibility(View.INVISIBLE);
        view.findViewById(R.id.textView5).setVisibility(View.INVISIBLE);
        form_cancel = view.findViewById(R.id.form_cancel);
        form_accept = view.findViewById(R.id.form_accept);
        form_cancel.setOnClickListener(this);
        form_accept.setOnClickListener(this);

        /* association      */
        textViewID = view.findViewById(R.id.form_igecem);
        textViewSignificado = view.findViewById(R.id.form_significado);
        spinnerClima = view.findViewById(R.id.form_clima);
        textViewCabecera = view.findViewById(R.id.form_cabecera);
        textViewName = view.findViewById(R.id.form_name);
        textViewAltirud = view.findViewById(R.id.form_altitud);
        textViewSuperficie = view.findViewById(R.id.form_superficie);

        form_inundacion = view.findViewById(R.id.form_inundacion);
        form_deslave = view.findViewById(R.id.form_deslave);
        form_zona_sísmica = view.findViewById(R.id.form_zona_sísmica);
        form_incendio_forestal = view.findViewById(R.id.form_incendio_forestal);
        form_zona_volcanica = view.findViewById(R.id.form_zona_volcanica);
        form_derrumbes = view.findViewById(R.id.form_derrumbes);





        /*                   */


        spinnerClima = view.findViewById(R.id.form_clima);

        sqlite = new SqlLite(this.view.getContext());


        adapter = ArrayAdapter.createFromResource(this.view.getContext(),
            R.array.opcions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerClima.setAdapter(adapter);


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    //action button
    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.form_accept:
                if (validationTextView(textViewID) && validationTextView(textViewName) &&
                    validationTextView(textViewSignificado) && validationTextView(textViewAltirud) &&
                    validationTextView(textViewCabecera) && validationTextView(textViewSuperficie)
                ) {

                    id = textViewID.getText().toString();
                    name = textViewName.getText().toString();
                    significado = textViewSignificado.getText().toString();
                    clima = spinnerClima.getSelectedItem().toString();
                    cabecera = textViewCabecera.getText().toString();
                    altitud = textViewAltirud.getText().toString();
                    superficie = textViewSuperficie.getText().toString();

                    Intent intent = new Intent(view.getContext(), MapsActivity.class);
                    intent.putExtra("id", id);
                    intent.putExtra("name", name);
                    intent.putExtra("significado", significado);
                    intent.putExtra("clima", clima);
                    intent.putExtra("cabecera", cabecera);
                    intent.putExtra("altitud", altitud);
                    intent.putExtra("superficie", superficie);

                    intent.putExtra("inundacion", form_inundacion.isChecked());
                    intent.putExtra("deslave", form_deslave.isChecked());
                    intent.putExtra("zona_sísmica", form_zona_sísmica.isChecked());
                    intent.putExtra("incendio_forestal", form_incendio_forestal.isChecked());
                    intent.putExtra("zona_volcanica", form_zona_volcanica.isChecked());
                    intent.putExtra("derrumbes", form_derrumbes.isChecked());

                    startActivity(intent, null);
                } else {
                    Toast.makeText(this.view.getContext(), "Faltan datos", Toast.LENGTH_SHORT).show();
                }


                break;
            case R.id.form_cancel:
                Toast.makeText(view.getContext(), "Cancelar", Toast.LENGTH_SHORT).show();
                break;
        }
    }


    public boolean validation(String date) {

        if (date.trim().length() > 0) {
            return true;
        }
        return false;
    }

    public boolean validationTextView(TextView textView) {
        boolean flag = true;

        if (!validation(textView.getText().toString())) {
            textView.setError("Faltan datos");
            flag = false;
        }

        return flag;
    }
}
