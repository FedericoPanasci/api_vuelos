package com.api.vuelos.vuelos.repository;

import com.api.vuelos.vuelos.entity.Pasajeros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface pasajerosRepository extends JpaRepository<Pasajeros, Long> {
}
