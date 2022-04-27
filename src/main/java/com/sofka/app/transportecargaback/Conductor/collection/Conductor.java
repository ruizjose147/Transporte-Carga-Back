package com.sofka.app.transportecargaback.Conductor.collection;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@Document(collection = "conductores")
public class Conductor {

    @Id
    //@NonNull
    @NotNull
    private Integer id;

    //@NonNull
    @NotEmpty(message = "Campo no puede estar vacio")
    @Size(min = 4, max = 30)
    private String nombre;

    //@NonNull
    @NotNull
    @Min(18)
    private Integer edad;

    //@NonNull
    @NotEmpty(message = "Campo no puede estar vacio")
    @Size(min = 10, max = 10)
    @Pattern(regexp = "([0-9]){10}")
    private String celular;

    //@NonNull
    @NotEmpty(message = "Campo no puede estar vacio")
    @Email
    private String correo;
}
