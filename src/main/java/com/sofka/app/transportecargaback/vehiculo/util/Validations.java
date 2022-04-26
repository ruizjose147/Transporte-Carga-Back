package com.sofka.app.transportecargaback.vehiculo.util;

public class Validations {

    public String validarPlacaLetras(String placa){
        String placaOk;
        placaOk = placa.toUpperCase();
        return placaOk;
    }

    public boolean validaPlaca(String placa){
        boolean valido = true;
        placa = placa.toUpperCase();
        placa = placa.replaceAll("[^a-zA-Z0-9]", "");
        if(placa.length() != 6){
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

    /*public boolean validarMarca(String marca){
        String marcaMayus = marca.toUpperCase();
        if(marcaMayus.matches(".*[0-9].*")){
            return false;
        }
        return true;
    }*/

    public boolean validarAnio(Integer anio){
        boolean result = true;
        if(anio < 2000)
            result = false;
        if(anio > 2023)
            result = false;
        return result;
    }

    public boolean validarCapacidad(Integer capacidad){
        boolean result = true;
        if(capacidad<= 0)
            result = false;
        if(capacidad > 99999)
            result = false;
        return result;
    }

    public boolean validarTipo(String tipo){
        String tipoMayuscula = tipo.toUpperCase();
        boolean validar = false;
        String tipoUno = "CAMION";
        String tipoDos = "VAN";
        String tipoTres = "PICK UP";
        if(tipoMayuscula.equals(tipoUno))
            validar = true;
        if(tipoMayuscula.equals(tipoDos))
            validar = true;
        if(tipoMayuscula.equals(tipoTres))
            validar = true;
        return validar;
    }

    public static void main(String[] args) {

        String nueva = "abc123";
        Validations validations = new Validations();

       // String nuevaOk = validations.validarPlacaLetras(nueva);
       // System.out.println(nuevaOk);
        //String prueba = "AB21r3";
        //System.out.println(validations.validaPlaca(prueba));
        Integer capacidadPrueba = 1000000;
        String marca = "1mazda";
        //System.out.println(validations.validarCapacidad(capacidadPrueba));
        //System.out.println(validations.validarMarca(marca));
        String tipo = "pickup";
        System.out.println(validations.validarTipo(tipo));
    }
}
