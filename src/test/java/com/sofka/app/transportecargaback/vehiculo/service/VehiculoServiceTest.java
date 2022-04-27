package com.sofka.app.transportecargaback.vehiculo.service;

import com.sofka.app.transportecargaback.Conductor.collection.Conductor;
import com.sofka.app.transportecargaback.vehiculo.collection.Vehiculo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
class VehiculoServiceTest {

    @Autowired VehiculoService service;

    @Test
    void save() {
        Vehiculo vehiculo = new Vehiculo();
        Conductor conductor = new Conductor(1001014265, "Carlos", 34, "3216538976", "carlos@gmail.com");
        vehiculo.setPlaca("ABC123");
        vehiculo.setMarca("TOYOTA PRIDE BLACK");
        vehiculo.setAnio(2020);
        vehiculo.setCapacidad(1000);
        vehiculo.setTipo("PICK UP");
        vehiculo.setConductor(conductor);

        service.save(vehiculo);


    }

    /*@Test
    void findAll() {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setPlaca("ABC123");
        vehiculo.setMarca("TOYOTA");
        vehiculo.setAnio(2020);
        vehiculo.setCapacidad(1000);
        vehiculo.setTipo("PICK UP");
        service.save(vehiculo);

        Vehiculo vehiculoDos = new Vehiculo();
        vehiculoDos.setPlaca("ABC456");
        vehiculoDos.setMarca("MAZDA");
        vehiculoDos.setAnio(2022);
        vehiculoDos.setCapacidad(800);
        vehiculoDos.setTipo("PICK UP");
        service.save(vehiculoDos);

        Flux<Vehiculo> todos = service.findAll();
        StepVerifier.create(todos).expectNext(vehiculo).expectNext(vehiculoDos).verifyComplete();

    }

    @Test
    void findByMarca() {

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setPlaca("ABC123");
        vehiculo.setMarca("TOYOTA");
        vehiculo.setAnio(2020);
        vehiculo.setCapacidad(1000);
        vehiculo.setTipo("PICK UP");
        service.save(vehiculo);

        Flux<Vehiculo> marca = service.findByMarca("TOYOTA");
        StepVerifier.create(marca).expectNext(vehiculo).verifyComplete();
    }*/
}