package com.example.Examen1Back2.modelos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import com.example.Examen1Back2.ayudas.TipoUsuario;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id_usuario;

    @Column(name="nombre", nullable = false, length = 100)
    private String nombre;

    @Column (name = "correoElectronico", unique = true, length = 50)
    private String correoElectronico;

    @Column(name="contraseña", nullable = false, unique = false, length = 10)
    private String contraseña;

    @Column (name = "telefono", unique = true,  length = 10)
    private String telefono;

    @Column (name = "tipoUsuario", unique = false )
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    //Estableciendo la relacion uno a uno con la tabla docente
    @OneToOne(mappedBy = "usuario")
    @JsonBackReference(value = "docente-usuario")
    private Docente docente;

    public Usuario() {
    }


    public Usuario(Integer id_usuario, String nombre, String correoElectronico, String contraseña, String telefono, TipoUsuario tipoUsuario, Docente docente) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.tipoUsuario = tipoUsuario;
        this.docente = docente;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}