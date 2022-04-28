package com.sofka.app.transportecargaback.Conductor.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ConductorDTO {
    private Integer id;
    private String nombre;
    private Integer edad;
    private String celular;
    private String correo;


}
