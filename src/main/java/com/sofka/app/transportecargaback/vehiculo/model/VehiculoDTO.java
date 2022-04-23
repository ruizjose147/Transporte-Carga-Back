package com.sofka.app.transportecargaback.vehiculo.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Data
public class VehiculoDTO {

    public String placa;
    public String marca;
    public Integer modelo;
    public Integer capacidad;
    public String tipo;
}
