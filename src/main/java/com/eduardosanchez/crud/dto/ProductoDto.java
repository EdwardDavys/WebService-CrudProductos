package com.eduardosanchez.crud.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductoDto {

    @NotBlank
    private String nombre;
    @Min()
    private float precio;

    public ProductoDto() {
    }

    public ProductoDto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
