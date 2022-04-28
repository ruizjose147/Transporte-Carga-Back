package com.sofka.app.transportecargaback.vehiculo.collection;


import com.sofka.app.transportecargaback.Conductor.collection.Conductor;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.mongodb.lang.NonNull;

import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Document(collection = "vehiculos")
public class Vehiculo {

    @Id
    @NotBlank(message = "La placa no puede estar vacia")
    @Size(min = 6, max = 6)
    private String placa;

    @NotBlank(message = "La marca no puede estar vacia")
    @Size(min = 4, max = 16)
    private String marca;

    @NotNull
    @Min(2000)
    @Max(2023)
    private Integer anio;

    @NotNull
    @Min(1)
    @Max(99999)
    private Integer capacidad;

    @NotBlank(message = "La tipo no puede estar vacia")
    @Size(min = 3, max = 7)
    private String tipo;

    @NonNull
    private Conductor conductor;


}
