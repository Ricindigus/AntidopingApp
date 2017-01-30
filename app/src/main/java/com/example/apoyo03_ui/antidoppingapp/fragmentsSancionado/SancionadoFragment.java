package com.example.apoyo03_ui.antidoppingapp.fragmentsSancionado;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.apoyo03_ui.antidoppingapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SancionadoFragment extends Fragment {

    private int[] textos = {R.string.texto_sancionado_1, R.string.texto_sancionado_2, R.string.texto_sancionado_3
            , R.string.texto_sancionado_4, R.string.texto_sancionado_5, R.string.texto_sancionado_6
            , R.string.texto_sancionado_7, R.string.texto_sancionado_8, R.string.texto_sancionado_9
            , R.string.texto_sancionado_10};
    private int[] imagenes = {R.drawable.muestra_orina, R.drawable.control_doping, R.drawable.alteracion_doping
            , R.drawable.sustancia_prohibida, R.drawable.administracion_doping, R.drawable.falta_doping
            , R.drawable.uso_sustancia_prohibida, R.drawable.trafico_sustancia_prohibida, R.drawable.conspiracion_dopaje
            , R.drawable.asociacion_prohibida};
    private int numFragment;

    @SuppressLint("ValidFragment")
    public SancionadoFragment(int numberFragment) {
        super();
        this.numFragment = numberFragment;
        // Required empty public constructor
    }

    public SancionadoFragment() {
        // Required empty public constructor
    }

    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.texto_fragment_sancionado);
        textView.setText(getString(textos[numFragment]));
        ImageView imageView = (ImageView)rootView.findViewById(R.id.imagen_fragment_sancionado);
        imageView.setBackground(ContextCompat.getDrawable(getContext(), imagenes[numFragment]));
        return rootView;
    }

}
