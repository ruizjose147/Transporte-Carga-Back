package com.sofka.app.transportecargaback.vehiculo.service;

import com.sofka.app.transportecargaback.Conductor.collection.Conductor;
import com.sofka.app.transportecargaback.vehiculo.collection.Vehiculo;
import com.sofka.app.transportecargaback.vehiculo.model.VehiculoDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class VehiculoServiceTest {

    /*@Autowired
    @MockBean
    VehiculoService service;

    @Autowired
    private WebTestClient webTestClient;

    @Test
    @DisplayName("save")
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
        Conductor conductor2 = new Conductor(7625265, "Simon", 24, "3298238976", "simon@gmail.com");
        vehiculoDos.setPlaca("ABC456");
        vehiculoDos.setMarca("MAZDA");
        vehiculoDos.setAnio(2022);
        vehiculoDos.setCapacidad(800);
        vehiculoDos.setTipo("PICK UP");
        vehiculoDos.setConductor(conductor2);
        service.save(vehiculoDos);

        List<Vehiculo> list = new ArrayList<>();
        list.add(vehiculo);
        list.add(vehiculoDos);

        Flux<Vehiculo> flux = Flux.fromIterable(list);
        Mockito.when(service.findAll()).thenReturn(flux);
        webTestClient.get().uri("/vehiculos").exchange().expectStatus();


    }

    @Test
    @DisplayName("findByMarca")
    void findByMarca() {
        Vehiculo vehiculo = new Vehiculo();
        Conductor conductor = new Conductor(7625265, "Simon", 24, "3298238976", "simon@gmail.com");
        vehiculo.setPlaca("ABC456");
        vehiculo.setMarca("TOYOTA");
        vehiculo.setAnio(2022);
        vehiculo.setCapacidad(800);
        vehiculo.setTipo("PICK UP");
        vehiculo.setConductor(conductor);
        service.save(vehiculo);

        Vehiculo vehiculoDos = new Vehiculo();
        Conductor conductor2 = new Conductor(100026373, "Viviana", 30, "8336272976", "viviana@gmail.com");
        vehiculoDos.setPlaca("GHL2563");
        vehiculoDos.setMarca("MAZDA");
        vehiculoDos.setAnio(2022);
        vehiculoDos.setCapacidad(800);
        vehiculoDos.setTipo("PICK UP");
        vehiculoDos.setConductor(conductor2);
        service.save(vehiculoDos);

        List<Vehiculo> list = new ArrayList<>();
        list.add(vehiculo);
        list.add(vehiculoDos);

        Flux<Vehiculo> flux = Flux.fromIterable(list);
        Mockito.when(service.findByMarca("TOYOTA")).thenReturn(flux);
        webTestClient.get().uri("/vehiculo/marca/TOYOTA").exchange().expectStatus();

    }

    @Test
    @DisplayName("findByPlaca")
    void findByPlaca() {
        Vehiculo vehiculo = new Vehiculo();
        Conductor conductor = new Conductor(7625265, "Simon", 24, "3298238976", "simon@gmail.com");
        vehiculo.setPlaca("ABC456");
        vehiculo.setMarca("TOYOTA");
        vehiculo.setAnio(2022);
        vehiculo.setCapacidad(800);
        vehiculo.setTipo("PICK UP");
        vehiculo.setConductor(conductor);
        service.save(vehiculo);

        Mockito.when(service.findByPlaca("ABC456")).thenReturn(Mono.just(vehiculo));
        webTestClient.get().uri("/vehiculo/ABC456").exchange().expectStatus();

    }

    @Test
    @DisplayName("findByCorreoConductor")
    void findByCorreoConductor() {
        Vehiculo vehiculoDos = new Vehiculo();
        Conductor conductor2 = new Conductor(100026373, "Viviana", 30, "8336272976", "viviana@gmail.com");
        vehiculoDos.setPlaca("GHL2563");
        vehiculoDos.setMarca("MAZDA");
        vehiculoDos.setAnio(2022);
        vehiculoDos.setCapacidad(800);
        vehiculoDos.setTipo("PICK UP");
        vehiculoDos.setConductor(conductor2);
        service.save(vehiculoDos);

        Mockito.when(service.findByCorreo("viviana@gmail.com")).thenReturn(Mono.just(vehiculoDos));
        webTestClient.get().uri("/conductor/correo/viviana@gmail.com").exchange().expectStatus();

    }*/
}