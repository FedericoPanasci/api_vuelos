package com.api.vuelos.vuelos.service;

import com.api.vuelos.vuelos.entity.Pasajeros;
import com.api.vuelos.vuelos.entity.Vuelos;

import java.util.List;
import java.util.Optional;

public interface vuelosService {
    List<Vuelos> getVuelos();
    Optional<Pasajeros> getPasajeros(int pasaporte);
}
