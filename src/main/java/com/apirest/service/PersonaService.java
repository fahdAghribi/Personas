package com.apirest.service;

import com.apirest.model.Persona;
import com.apirest.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }
    
    // Métodos personalizados
    public List<Persona> findByApellido(String apellido) {
        return personaRepository.findByApellido(apellido);
    }
    
    public Optional<Persona> findByEmail(String email) {
        return personaRepository.findByEmail(email);
    }
    
    public List<Persona> findByNombre(String nombre) {
        return personaRepository.findByNombre(nombre);
    }
} 