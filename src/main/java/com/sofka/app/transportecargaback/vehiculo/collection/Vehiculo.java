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
    @NonNull
    private String placa;

    @NonNull
    private String marca;

    @NonNull
    private Integer modelo;

    @NonNull
    private Integer capacidad;

    @NonNull
    private String tipo;

    //private Conductor conductor;
}
