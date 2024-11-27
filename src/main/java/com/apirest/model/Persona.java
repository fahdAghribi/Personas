package com.apirest.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "personas")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    private String apellido;
    
    private String email;
    
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaNacimiento;
} 