package com.sofka.app.transportecargaback.vehiculo.service;

import com.sofka.app.transportecargaback.Conductor.Conductor;
import com.sofka.app.transportecargaback.vehiculo.collection.Vehiculo;

import com.sofka.app.transportecargaback.vehiculo.repositories.IVehiculoRepository;
import com.sofka.app.transportecargaback.vehiculo.util.Validations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VehiculoService {

    @Autowired
    IVehiculoRepository repositorieI;
    Validations validations;


    public Mono<Vehiculo> save(Vehiculo vehiculo){
        String placa = vehiculo.getPlaca();
        return this.repositorieI.save(vehiculo);
    }

    public Flux<Vehiculo> findAll(){
        return this.repositorieI.findAll();
    }

    public Mono<Vehiculo> findByPlaca(String placa){
        return this.repositorieI.findByPlaca(placa);
    }

    public Flux<Vehiculo> findByMarca(String marca){
        return this.repositorieI.findByMarca(marca);
    }

}
