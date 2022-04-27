package com.sofka.app.transportecargaback.vehiculo.collection;


import com.sofka.app.transportecargaback.Conductor.collection.Conductor;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Pattern;

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
    private Integer anio;

    @NonNull
    private Integer capacidad;

    @NonNull
    private String tipo;
    @NonNull
    private Conductor conductor;
}
