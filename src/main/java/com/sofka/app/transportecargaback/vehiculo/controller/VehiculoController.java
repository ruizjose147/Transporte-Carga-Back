package com.sofka.app.transportecargaback.vehiculo.controller;

import com.sofka.app.transportecargaback.vehiculo.collection.Vehiculo;
import com.sofka.app.transportecargaback.vehiculo.model.VehiculoDTO;
import com.sofka.app.transportecargaback.vehiculo.service.VehiculoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VehiculoController {

    @Autowired
    VehiculoService service;
    ModelMapper mapper;

    public VehiculoController(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @PostMapping("/vehiculo")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Vehiculo> save(@RequestBody VehiculoDTO vehiculoDTO){
        Vehiculo vehiculo = mapper.map(vehiculoDTO, Vehiculo.class);
        return this.service.save(vehiculo);
    }

    @GetMapping("/Vehiculos")
    public Flux<VehiculoDTO> findAll(){
        return this.service.findAll()
                .flatMap(v -> Mono.just(mapper.map(v, VehiculoDTO.class)));
    }

    @GetMapping("vehuculo/{placa}")
    public Mono<VehiculoDTO> findByPlaca(String placa){
        return this.service.findByPlaca(placa)
                .flatMap(v -> Mono.just(mapper.map(v, VehiculoDTO.class)));
    }

}
