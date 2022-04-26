package com.sofka.app.transportecargaback.vehiculo.repositorie;

import com.sofka.app.transportecargaback.vehiculo.collection.Vehiculo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface VehiculoRepositorieI extends ReactiveMongoRepository<Vehiculo, String> {

    public Mono<Vehiculo> findByPlaca(String Placa);
    public Flux<Vehiculo> findByMarca(String marca);
}
