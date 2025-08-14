package com.example.Examen1Back2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, unique = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name="fk_docente", referencedColumnName = "id", nullable = false)
    @JsonBackReference(value = "docente-curso")
    private Docente docente;

    public Curso() {
    }


    public Curso(Integer id, String nombre, Docente docente) {
        this.id = id;
        this.nombre = nombre;
        this.docente = docente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
