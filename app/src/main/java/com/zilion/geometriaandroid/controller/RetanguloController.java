package com.zilion.geometriaandroid.controller;

import com.zilion.geometriaandroid.model.Retangulo;

public class RetanguloController implements IGeometriaController<Retangulo> {

    @Override
    public float calcularArea(Retangulo retangulo) {
        return retangulo.getBase() * retangulo.getAltura();
    }

    @Override
    public float calcularPerimetro(Retangulo retangulo) {
        return 2 * (retangulo.getBase() + retangulo.getAltura());
    }
}
