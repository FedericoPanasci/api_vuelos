package com.api.vuelos.vuelos.repository;

import com.api.vuelos.vuelos.entity.Aviones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface avionesRepository extends JpaRepository<Aviones, Long> {
}
