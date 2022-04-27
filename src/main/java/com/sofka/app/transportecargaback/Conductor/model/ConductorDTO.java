package com.sofka.app.transportecargaback.Conductor.model;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
public class ConductorDTO {
    @NotNull
    private Integer id;

    @NotEmpty(message = "Campo no puede estar vacio")
    @Size(min = 4, max = 30)
    private String nombre;

    @NotNull
    @Min(18)
    private Integer edad;

    @Pattern(regexp = "^\\d{10}$")
    private String celular;

    @NotEmpty(message = "Campo no puede estar vacio")
    private String correo;
}
