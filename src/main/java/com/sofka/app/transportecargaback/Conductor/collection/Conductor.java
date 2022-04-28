package com.sofka.app.transportecargaback.Conductor.collection;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@Document(collection = "conductores")
public class Conductor {

    @Id
    private Integer id;

    private String nombre;

    private Integer edad;

    private String celular;

    private String correo;
}
