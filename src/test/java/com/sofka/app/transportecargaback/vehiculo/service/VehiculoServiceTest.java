package com.sofka.app.transportecargaback.vehiculo.service;

import com.sofka.app.transportecargaback.Conductor.collection.Conductor;
import com.sofka.app.transportecargaback.vehiculo.collection.Vehiculo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class VehiculoServiceTest {

    @Autowired
    @MockBean
    VehiculoService service;

    @Autowired
    private WebTestClient webTestClient;

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

    @Test
    @DisplayName("findAll")
    void findAll() {
        Vehiculo vehiculo = new Vehiculo();
        Conductor conductor = new Conductor(1001014265, "Carlos", 34, "3216538976", "carlos@gmail.com");
        vehiculo.setPlaca("ABC123");
        vehiculo.setMarca("TOYOTA");
        vehiculo.setAnio(2020);
        vehiculo.setCapacidad(1000);
        vehiculo.setTipo("PICK UP");
        vehiculo.setConductor(conductor);
        service.save(vehiculo);

        Vehiculo vehiculoDos = new Vehiculo();
        Conductor conductor2 = new Conductor(7625265, "Simon", 24, "3298238976", "carlos@gmail.com");
        vehiculoDos.setPlaca("ABC456");
        vehiculoDos.setMarca("MAZDA");
        vehiculoDos.setAnio(2022);
        vehiculoDos.setCapacidad(800);
        vehiculoDos.setTipo("PICK UP");
        vehiculo.setConductor(conductor2);
        service.save(vehiculoDos);

        List<Vehiculo> list = new ArrayList<>();
        list.add(vehiculo);
        list.add(vehiculoDos);

        Flux<Vehiculo> flux = Flux.fromIterable(list);
        Mockito.when(service.findAll()).thenReturn(flux);
        //when(mock.findAll()).thenReturn(flux);
        webTestClient.get().uri("/vehiculos").exchange().expectStatus();


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
    }
}