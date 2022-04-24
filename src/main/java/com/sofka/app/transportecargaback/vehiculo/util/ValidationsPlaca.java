package com.sofka.app.transportecargaback.vehiculo.util;

public class ValidationsPlaca {

    public String validarPlacaLetras(String placa){
        String placaOk;
        placaOk = placa.toUpperCase();
        return placaOk;
    }

    /*public boolean tamañoPlaca(String placa){
        boolean valido = true;
        if(placa.length() != 6){
            valido = false;
        }
        return valido;
    }

    public boolean validarLetras(String placa){
        if(!placa.substring(0, 3).matches("[A-Z]*")){
            return false;
        }
        return true;
    }

    public boolean validarNumeros(String placa){
        if(!placa.substring(3).matches("[0-9]*")){
            return false;
        }
        return true;
    }

    public boolean validarCaracteres(String placa){
            placa.
    }*/

    public boolean validaPlaca(String placa){
        boolean valido = true;
        if(placa.length() != 7){
            valido = false;
        }
        if(!placa.substring(0, 3).matches("[A-Z]*")){
            valido = false;
        }
        if(!placa.substring(3).matches("[0-9]*")){
            valido = false;
        }
        return valido;
    }

    public static void main(String[] args) {

        String nueva = "abc123";
        ValidationsPlaca validationsPlaca = new ValidationsPlaca();

       // String nuevaOk = validations.validarPlacaLetras(nueva);
       // System.out.println(nuevaOk);

    }
}
