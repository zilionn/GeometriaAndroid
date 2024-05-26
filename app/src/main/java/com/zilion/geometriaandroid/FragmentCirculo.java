package com.zilion.geometriaandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.zilion.geometriaandroid.controller.CirculoController;
import com.zilion.geometriaandroid.model.Circulo;

public class FragmentCirculo extends Fragment {

    private EditText edtRaio;
    private TextView txtResultado;
    private CirculoController controller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_circulo, container, false);

        edtRaio = view.findViewById(R.id.edtRaio);
        txtResultado = view.findViewById(R.id.txtResultado);
        controller = new CirculoController();

        Button btnCalcularArea = view.findViewById(R.id.btnCalcularArea);
        btnCalcularArea.setOnClickListener(v -> {
            float raio = Float.parseFloat(edtRaio.getText().toString());
            Circulo circulo = new Circulo();
            circulo.setRaio(raio);
            float area = controller.calcularArea(circulo);
            txtResultado.setText("Área: " + area);
            limparCampos();
        });

        Button btnCalcularPerimetro = view.findViewById(R.id.btnCalcularPerimetro);
        btnCalcularPerimetro.setOnClickListener(v -> {
            float raio = Float.parseFloat(edtRaio.getText().toString());
            Circulo circulo = new Circulo();
            circulo.setRaio(raio);
            float perimetro = controller.calcularPerimetro(circulo);
            txtResultado.setText("Perímetro: " + perimetro);
            limparCampos();
        });

        return view;
    }

    private void limparCampos() {
        edtRaio.setText("");
    }
}
