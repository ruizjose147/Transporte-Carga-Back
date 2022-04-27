package com.sofka.app.transportecargaback.Conductor.collection;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@Document(collection = "conductores")
public class Conductor {

    @Id
    @NonNull
    private Integer id;
    @NonNull
    private String nombre;
    @NonNull
    private Integer edad;
    @NonNull
    private String celular;
    @NonNull
    private String correo;
}
