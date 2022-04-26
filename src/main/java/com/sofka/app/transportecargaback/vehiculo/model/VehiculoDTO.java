package com.sofka.app.transportecargaback.vehiculo.model;

import com.sofka.app.transportecargaback.Conductor.*;
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
    private Integer año;
    private Integer capacidad;
    private String tipo;
    private Conductor conductor;
}
