package com.sofka.app.transportecargaback.vehiculo.model;

import com.sofka.app.transportecargaback.Conductor.collection.Conductor;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class VehiculoDTO {

    @NotBlank(message = "La placa no puede estar vacia")
    @Size(min = 6, max = 6)
    @Pattern(regexp = "[A-Z]{3}[0-9]{3}")
    private String placa;

    @NotBlank(message = "La marca no puede estar vacia")
    @Size(min = 3, max = 25)
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

    private Conductor conductor;
}
