package com.sofka.app.transportecargaback.vehiculo.service;

import com.sofka.app.transportecargaback.vehiculo.collection.Vehiculo;

import com.sofka.app.transportecargaback.vehiculo.repositories.IVehiculoRepository;
import com.sofka.app.transportecargaback.vehiculo.util.Validations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class VehiculoService {

    @Autowired
    IVehiculoRepository repositorieI;
    Validations validations;


    public Mono<Vehiculo> save(Vehiculo vehiculo) throws InterruptedException, ExecutionException {
        String placa = vehiculo.getPlaca();
        try {
            Vehiculo vehiculoValidacion = this.repositorieI.findByPlaca(placa)
                    .toFuture().get();
            if(vehiculoValidacion != null)
                throw new IllegalArgumentException("La placa ya existe en base de datos");
            return this.repositorieI.save(vehiculo);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e) {
            throw e;
        }

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

    public Mono<Vehiculo> findByCorreo(String correo){
        return this.repositorieI.findByConductorCorreo(correo);
    }

}
