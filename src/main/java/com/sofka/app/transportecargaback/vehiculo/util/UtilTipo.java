package com.sofka.app.transportecargaback.vehiculo.util;

public enum UtilTipo {

    VAN("Van"),
    PICK_UP("Pick Up"),
    CAMION("Camión");

    private final String value;

    public String getValue() {
        return value;
    }

    UtilTipo(String value) {
        this.value = value;
    }
}
