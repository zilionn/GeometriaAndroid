package com.zilion.geometriaandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.zilion.geometriaandroid.controller.RetanguloController;
import com.zilion.geometriaandroid.model.Retangulo;

public class FragmentRetangulo extends Fragment {

    private EditText edtBase, edtAltura;
    private TextView txtResultado;
    private RetanguloController controller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_retangulo, container, false);

        edtBase = view.findViewById(R.id.edtBase);
        edtAltura = view.findViewById(R.id.edtAltura);
        txtResultado = view.findViewById(R.id.txtResultado);
        controller = new RetanguloController();

        Button btnCalcularArea = view.findViewById(R.id.btnCalcularArea);
        btnCalcularArea.setOnClickListener(v -> {
            float base = Float.parseFloat(edtBase.getText().toString());
            float altura = Float.parseFloat(edtAltura.getText().toString());
            Retangulo retangulo = new Retangulo();
            retangulo.setBase(base);
            retangulo.setAltura(altura);
            float area = controller.calcularArea(retangulo);
            txtResultado.setText("Área: " + area);
            limparCampos();
        });

        Button btnCalcularPerimetro = view.findViewById(R.id.btnCalcularPerimetro);
        btnCalcularPerimetro.setOnClickListener(v -> {
            float base = Float.parseFloat(edtBase.getText().toString());
            float altura = Float.parseFloat(edtAltura.getText().toString());
            Retangulo retangulo = new Retangulo();
            retangulo.setBase(base);
            retangulo.setAltura(altura);
            float perimetro = controller.calcularPerimetro(retangulo);
            txtResultado.setText("Perímetro: " + perimetro);
            limparCampos();
        });

        return view;
    }

    private void limparCampos() {
        edtBase.setText("");
        edtAltura.setText("");
    }
}
