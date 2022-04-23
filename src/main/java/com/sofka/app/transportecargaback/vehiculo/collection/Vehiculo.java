package com.sofka.app.transportecargaback.vehiculo.collection;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Document(collection = "vehiculos")
public class Vehiculo {

    @Id
    public String placa;

    @NonNull
    public String marca;

    @NonNull
    public Integer modelo;

    @NonNull
    public Integer capacidad;

    @NonNull
    public String tipo;

    //private Conductor conductor;
}
