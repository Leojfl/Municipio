package com.example.myapplication.iu;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.myapplication.MapsActivity;
import com.example.myapplication.R;
import com.example.myapplication.database.SqlLite;
import com.example.myapplication.database.entitys.Municipio;
import com.example.myapplication.database.entitys.Riesgo;
import com.google.android.gms.maps.SupportMapFragment;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link UpdateFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link UpdateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UpdateFragment extends Fragment {


    Button form_search, form_cancel, form_accept;
    TextView title, textViewIDIGC, textViewSignificado, textViewCabecera, textViewName, textViewSuperficie, textViewAltirud, textViewId;
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
    String latitud = "";
    String longitud = "";
    String igecem = "";
    Municipio municipio;

    CheckBox form_inundacion;
    CheckBox form_deslave;
    CheckBox form_zona_sísmica;
    CheckBox form_incendio_forestal;
    CheckBox form_zona_volcanica;
    CheckBox form_derrumbes;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public UpdateFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UpdateFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UpdateFragment newInstance(String param1, String param2) {
        UpdateFragment fragment = new UpdateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_update, container, false);
        form_search = view.findViewById(R.id.form_search);
        title = view.findViewById(R.id.form_title);
        title.setText("Modificar");

        /* association      */
        textViewId = view.findViewById(R.id.form_id2);
        textViewIDIGC = view.findViewById(R.id.form_igecem);
        textViewSignificado = view.findViewById(R.id.form_significado);
        spinnerClima = view.findViewById(R.id.form_clima);
        textViewCabecera = view.findViewById(R.id.form_cabecera);
        textViewName = view.findViewById(R.id.form_name);
        textViewAltirud = view.findViewById(R.id.form_altitud);
        textViewSuperficie = view.findViewById(R.id.form_superficie);
        form_cancel = view.findViewById(R.id.form_cancel);
        form_accept = view.findViewById(R.id.form_accept);
        form_search = view.findViewById(R.id.form_search);
        /*                   */
        form_inundacion = view.findViewById(R.id.form_inundacion);
        form_deslave = view.findViewById(R.id.form_deslave);
        form_zona_sísmica = view.findViewById(R.id.form_zona_sísmica);
        form_incendio_forestal = view.findViewById(R.id.form_incendio_forestal);
        form_zona_volcanica = view.findViewById(R.id.form_zona_volcanica);
        form_derrumbes = view.findViewById(R.id.form_derrumbes);


        form_cancel.setOnClickListener(v -> cancel());
        form_accept.setOnClickListener(v -> accept());
        form_search.setOnClickListener(v -> search());


        adapter = ArrayAdapter.createFromResource(this.view.getContext(),
            R.array.opcions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerClima.setAdapter(adapter);

        sqlite = new SqlLite(view.getContext());


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


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.form_accept:

                if (municipio != null) {

//                    Toast.makeText(view.getContext(), "actualizar Aceptar", Toast.LENGTH_SHORT).show();
//                    RadioButton sexButton = this.view.findViewById((RadioGroupSex).getCheckedRadioButtonId());
//                    String id = textViewIDIGC.getText().toString();
//                    String entryDate = textVientryDate.getText().toString();
//                    String classification = spinnerClassification.getSelectedItem().toString();
//                    String habitat = textViewHabitat.getText().toString();
//                    String sex = sexButton.getText().toString();
//                    String species = spinnerSpecies.getSelectedItem().toString();
//                    String name = textViewName.getText().toString();
////                    Municipio newMunicipio = new Municipio(id, classification, species, name, sex, entryDate, habitat, "food");
//
//////                    String modification = sqlite.upDate(id, classification, species, name, sex, entryDate, habitat, "food");
////                    if (modification.equals("Modificado")) {
////                        Toast.makeText(getContext(), "Registro guardado", Toast.LENGTH_SHORT).show();
////
////                        municipio = null;
////                    } else {
////                        Toast.makeText(getContext(), "No :c", Toast.LENGTH_SHORT).show();
////                    }
                } else {
                    Toast.makeText(getContext(), "Municipio no seleccionado", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.form_search:

                break;
        }
    }

    public int position(String date, Spinner spinner) {
        int position = -1;

        int end = spinner.getCount();
        for (int x = 0; x < spinner.getCount(); x++) {

            if (spinner.getItemAtPosition(x).toString().equals(date)) {
                return x;
            }
        }
        return position;
    }

    public void search() {
        Toast.makeText(view.getContext(), "Buscando", Toast.LENGTH_SHORT).show();
        sqlite.opeen();
        String search = textViewId.getText().toString();
        Cursor cursor = sqlite.getCant(search, Municipio.table1);


        if (cursor != null) {
            cursor.moveToFirst();
            if (cursor.getCount() > 0) {
                municipio = Municipio.converteMunicipio(cursor);
            } else {
                municipio = null;
            }
        }

        if (municipio != null) {
            textViewIDIGC.setText(municipio.getIGECEM());
            textViewName.setText(municipio.getNOMBRE());
            textViewSignificado.setText(municipio.getSIGNIFICADO());
            textViewCabecera.setText(municipio.getCABECERA());
            textViewAltirud.setText(municipio.getALTITUD());
            textViewSuperficie.setText(municipio.getSUPERFICIE());
            int position = position(municipio.getCLIMA(), spinnerClima);
            spinnerClima.setSelection(position);

            Cursor cursorRiesgo = sqlite.getRegistros(Riesgo.table, "WHERE FK_ID_MUNICIPIOS=" + municipio.getID());
            List<Riesgo> riesgos = Riesgo.riesgos(cursorRiesgo);
            municipio.setRiesgos(riesgos);
            for (int x = 0; x < municipio.getRiesgos().size(); x++) {
                setCheckBox(form_inundacion, municipio.getRiesgos().get(x).getNOMBRE());
                setCheckBox(form_deslave, municipio.getRiesgos().get(x).getNOMBRE());
                setCheckBox(form_zona_sísmica, municipio.getRiesgos().get(x).getNOMBRE());
                setCheckBox(form_incendio_forestal, municipio.getRiesgos().get(x).getNOMBRE());
                setCheckBox(form_zona_volcanica, municipio.getRiesgos().get(x).getNOMBRE());
                setCheckBox(form_derrumbes, municipio.getRiesgos().get(x).getNOMBRE());
            }
            Toast.makeText(view.getContext(), "Encontrado", Toast.LENGTH_SHORT).show();
        } else {
            Municipio animal = null;
            Toast.makeText(view.getContext(), "No se encontro", Toast.LENGTH_SHORT).show();
        }


    }

    public void accept() {


        id = textViewId.getText().toString();
        name = textViewName.getText().toString();
        significado = textViewSignificado.getText().toString();
        clima = spinnerClima.getSelectedItem().toString();
        cabecera = textViewCabecera.getText().toString();
        altitud = textViewAltirud.getText().toString();
        superficie = textViewSuperficie.getText().toString();
        igecem = textViewIDIGC.getText().toString();
        latitud = municipio.getLATITUD();
        longitud = municipio.getLONGITUD();

        Intent intent = new Intent(view.getContext(), MapsActivity.class);
        intent.putExtra("id", id);
        intent.putExtra("igecem", igecem);
        intent.putExtra("name", name);
        intent.putExtra("significado", significado);
        intent.putExtra("clima", clima);
        intent.putExtra("cabecera", cabecera);
        intent.putExtra("altitud", altitud);
        intent.putExtra("superficie", superficie);
        intent.putExtra("latitud", latitud);
        intent.putExtra("longitud", longitud);

        intent.putExtra("inundacion", form_inundacion.isChecked());
        intent.putExtra("deslave", form_deslave.isChecked());
        intent.putExtra("zona_sísmica", form_zona_sísmica.isChecked());
        intent.putExtra("incendio_forestal", form_incendio_forestal.isChecked());
        intent.putExtra("zona_volcanica", form_zona_volcanica.isChecked());
        intent.putExtra("derrumbes", form_derrumbes.isChecked());


        startActivity(intent, null);

    }


    public void cancel() {
        Toast.makeText(view.getContext(), "actualizar Cancelar", Toast.LENGTH_SHORT).show();
    }

    public void setCheckBox(CheckBox ch, String value) {
        if (ch.getText().toString().equals(value)) {
            ch.setChecked(true);
        }
    }
}
