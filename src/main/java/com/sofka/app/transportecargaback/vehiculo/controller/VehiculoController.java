package com.sofka.app.transportecargaback.vehiculo.controller;

import com.sofka.app.transportecargaback.vehiculo.collection.Vehiculo;
import com.sofka.app.transportecargaback.vehiculo.model.VehiculoDTO;
import com.sofka.app.transportecargaback.vehiculo.service.VehiculoService;
import com.sofka.app.transportecargaback.vehiculo.util.Validations;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VehiculoController {

    @Autowired
    VehiculoService service;
    ModelMapper mapper;

    public VehiculoController(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @PostMapping("/vehiculo")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Vehiculo> save(@Valid @RequestBody VehiculoDTO vehiculoDTO) {
        ResponseStatusException response = Validations.ValidarConductor(vehiculoDTO.getConductor());
        try{
            if(vehiculoDTO.isTipoValid() && response.getStatus().is2xxSuccessful()){
                Vehiculo vehiculo = mapper.map(vehiculoDTO, Vehiculo.class);
                return this.service.save(vehiculo);
            }else if (!vehiculoDTO.isTipoValid()){
                return Mono.error(new ResponseStatusException(HttpStatus.BAD_REQUEST, "Tipo de vehículo no es válido"));
            }else{
                return Mono.error(response);
            }

        }catch (Exception e) {
            return Mono.error(new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage()));
        }

    }


    @GetMapping("/vehiculos")
    public Flux<VehiculoDTO> findAll(){
        return this.service.findAll()
                .flatMap(v -> Mono.just(mapper.map(v, VehiculoDTO.class)));
    }

    @GetMapping("/vehiculo/{placa}")
    public Mono<VehiculoDTO> findByPlaca(@PathVariable("placa") String placa){
        return this.service.findByPlaca(placa)
                .flatMap(v -> Mono.just(mapper.map(v, VehiculoDTO.class)));
    }

    @GetMapping("/vehiculo/marca/{marca}")
    public Flux<VehiculoDTO> findByMarca(@PathVariable("marca") String marca){
        return this.service.findByMarca(marca)
                .flatMap(v -> Mono.just(mapper.map(v, VehiculoDTO.class)));
    }

    @GetMapping("/conductor/correo/{correo}")
    public Mono<VehiculoDTO> findByCorreoConductor(@PathVariable("correo")String correo){
        return this.service.findByCorreo(correo)
                .flatMap(v -> Mono.just(mapper.map(v, VehiculoDTO.class)));
    }
}
