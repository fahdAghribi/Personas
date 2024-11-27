package com.apirest.repository;

import com.apirest.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    // Métodos de búsqueda básicos
    Optional<Persona> findByEmail(String email);
    List<Persona> findByApellido(String apellido);
    List<Persona> findByNombre(String nombre);
} 