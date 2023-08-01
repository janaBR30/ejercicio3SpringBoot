
package com.Ejercicio3.ejercicio3;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Paciente {
    
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNasc;

    public Paciente(Long id, String dni, String nombre, String apellido, LocalDate fechaNasc) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNasc = fechaNasc;
    }

    public Paciente() {
    }
    
}
