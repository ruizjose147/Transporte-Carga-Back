package com.sofka.app.transportecargaback.vehiculo.util;

import com.sofka.app.transportecargaback.Conductor.collection.Conductor;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.regex.Pattern;

public class Validations {

    public static Boolean ValidarTipo(String tipo){
        String tipoMayuscula = tipo.toUpperCase();
        return tipoMayuscula.contains("VAN") || tipoMayuscula.contains("PICK UP") || tipoMayuscula.contains("CAMIÓN");
    }

    public static ResponseStatusException ValidarConductor(Conductor c){
        Pattern patternId = Pattern.compile("[0-9]{10}");
        Pattern patternId2 = Pattern.compile("[0-9]{8}");
        Pattern patternNombre = Pattern.compile("[A-z]{3,}[ ][A-z]{3,}");
        Pattern patternCelular = Pattern.compile("[0-9]{10}");
        Pattern patternCorreo = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

        if(!patternId.matcher(c.getId().toString()).matches() && !patternId2.matcher(c.getId().toString()).matches()){
            return new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id no es válido");
        } else if (!patternNombre.matcher(c.getNombre()).matches()){
            return new ResponseStatusException(HttpStatus.BAD_REQUEST, "Nombre no es válido");
        } else if (!(c.getEdad()>=18 && c.getEdad()<100)){
            return new ResponseStatusException(HttpStatus.BAD_REQUEST, "Edad no es válida");
        } else if (!patternCelular.matcher(c.getCelular()).matches()){
            return new ResponseStatusException(HttpStatus.BAD_REQUEST, "Celular no es válido");
        }else if (!patternCorreo.matcher(c.getCorreo()).matches()){
            return new ResponseStatusException(HttpStatus.BAD_REQUEST, "Correo no es válido");
        }

        return new ResponseStatusException(HttpStatus.OK);


    }

}
