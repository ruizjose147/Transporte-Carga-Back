package com.sofka.app.transportecargaback.vehiculo.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class VehiculoDTO {

    public String placa;
    public String marca;
    public Integer modelo;
    public Integer capacidad;
    public String tipo;
}
