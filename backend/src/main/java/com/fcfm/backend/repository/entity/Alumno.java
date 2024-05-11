package com.fcfm.backend.repository.entity;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

import java.sql.Date;

@Entity
public class Alumno{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alumnoId")
    private Long alumnoId;
    @Column(name = "primerNombre")
    private String primerNombre;
    @Column(name = "segundoNombre")
    private String segundoNombre;
    @Column(name = "apellidoPat")
    private String apellidoPat;
    @Column(name = "apellidoMat")
    private String apellidoMat;
    @Column(name = "curp")
    private String curp;
    @Column(name = "email")
    private String email;
    @Column(name = "fechaNac")
    private Date fechaNac;

    public Alumno(String primerNombre, String segundoNombre, String apellidoPat, String apellidoMat, String curp,Date fechaNac, String email) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.curp = curp;
        this.fechaNac = fechaNac;
        this.email = email;
    }

    public Alumno() {
    }

    public void setAlumnoId(Long alumnoId) {this.alumnoId = alumnoId;}
    public Long getAlumnoId() {return alumnoId;}

    public String getPrimerNombre() {return primerNombre;}

    public void setPrimerNombre(String primerNombre) {this.primerNombre = primerNombre;}

    public String getSegundoNombre() {return segundoNombre;}

    public void setSegundoNombre(String segundoNombre) {this.segundoNombre = segundoNombre;}

    public String getApellidoPat() {return apellidoPat;}

    public void setApellidoPat(String apellidoPat) {this.apellidoPat = apellidoPat;}

    public String getApellidoMat() {return apellidoMat;}

    public void setApellidoMat(String apellidoMat) {this.apellidoMat = apellidoMat;}

    public String getCurp() {return curp;}

    public void setCurp(String curp) {this.curp = curp;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public Date getFechaNac() {return fechaNac;}

    public void setFechaNac(Date fechaNac) {this.fechaNac = fechaNac;}
}