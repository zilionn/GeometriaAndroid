package com.zilion.geometriaandroid.controller;

public interface IGeometriaController<T> {
    float calcularArea(T figura);
    float calcularPerimetro(T figura);
}
