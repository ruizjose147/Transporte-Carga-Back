package com.sofka.app.transportecargaback.vehiculo.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Data
public class VehiculoDTO {

    private String placa;
    private String marca;
    private Integer modelo;
    private Integer capacidad;
    private String tipo;
}
