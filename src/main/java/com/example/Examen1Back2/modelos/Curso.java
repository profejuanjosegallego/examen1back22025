package com.example.Examen1Back2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
@Entity
public class Curso {

    @Id //La anotación estaba incompleta en su sintaxis
    @GeneratedValue(strategy = GenerationType.IDENTITY) //La anotación estaba incompleta en su sintaxis
    private Integer id;
    private String nombre; //Faltaba el punto y la coma en su sintaxis

    @ManyToOne
    @JoinColumn(name="fk_docente", referencedColumnName = "id");
    @JsonBackReference(value = "docente-curso")
    Docente docente; //Faltaba el punto y la coma en su sintaxis

    public Curso() {
        //Constructor vacío
    }

    public Curso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Agregué el resto de Getters y Setters
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
