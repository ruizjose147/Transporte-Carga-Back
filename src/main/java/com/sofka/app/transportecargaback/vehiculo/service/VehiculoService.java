package com.sofka.app.transportecargaback.vehiculo.service;

import com.sofka.app.transportecargaback.vehiculo.collection.Vehiculo;
import com.sofka.app.transportecargaback.vehiculo.repositorie.VehiculoRepositorieI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VehiculoService {

    @Autowired
    VehiculoRepositorieI repositorieI;

    public Mono<Vehiculo> save(Vehiculo vehiculo){
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
