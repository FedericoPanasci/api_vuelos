package com.api.vuelos.vuelos.service.impl;

import com.api.vuelos.vuelos.entity.Pasajeros;
import com.api.vuelos.vuelos.entity.Vuelos;
import com.api.vuelos.vuelos.repository.vuelosRepository;
import com.api.vuelos.vuelos.service.vuelosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class vuelosServiceImpl implements vuelosService {

    private final vuelosRepository vuelosRepository;

    @Override
    public List<Vuelos> getVuelos() {return vuelosRepository.findAll();}

    @Override
    public Optional<Pasajeros> getPasajeros(int pasaporte){return Optional.empty();}

}
