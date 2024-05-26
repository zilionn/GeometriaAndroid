package com.zilion.geometriaandroid.controller;

import com.zilion.geometriaandroid.model.Circulo;

public class CirculoController implements IGeometriaController<Circulo> {

    @Override
    public float calcularArea(Circulo circulo) {
        return (float) (Math.PI * Math.pow(circulo.getRaio(), 2));
    }

    @Override
    public float calcularPerimetro(Circulo circulo) {
        return (float) (2 * Math.PI * circulo.getRaio());
    }
}
