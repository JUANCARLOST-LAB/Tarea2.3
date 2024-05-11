package com.fcfm.backend.utils;

import com.fcfm.backend.repository.entity.Alumno;

import java.sql.Date;

public class AlumnoMapper {

    public static com.fcfm.backend.model.Alumno alumnoEntitytoAlumnoModel(Alumno alumno){
        com.fcfm.backend.model.Alumno model = new com.fcfm.backend.model.Alumno();

        model.setPrimerNombre(alumno.getPrimerNombre());
        model.setSegundoNombre(alumno.getSegundoNombre());
        model.setApellidoPat(alumno.getApellidoPat());
        model.setApellidoMat(alumno.getApellidoMat());
        model.setCurp(alumno.getCurp());
        model.setFechaNac(alumno.getFechaNac().toString()); //njnvjvn
        model.setEmail(alumno.getEmail());
        return model;
    }

    public static  Alumno alumnoModelToAlumnoEntity(com.fcfm.backend.model.Alumno alumno){
        Alumno entity = new com.fcfm.backend.repository.entity.Alumno();
        entity.setAlumnoId(Long.valueOf(alumno.getAlumnoId()));
        entity.setPrimerNombre(alumno.getPrimerNombre());
        entity.setSegundoNombre(alumno.getSegundoNombre());
        entity.setApellidoPat(alumno.getApellidoPat());
        entity.setApellidoMat(alumno.getApellidoMat());
        entity.setCurp(alumno.getCurp());
        entity.setFechaNac(Date.valueOf(alumno.getFechaNac())); //ihgfi
        entity.setEmail(alumno.getEmail());

        return entity;
    }

    public static  Alumno alumnoModelToAlumnoEntity2(com.fcfm.backend.model.Alumno alumno){
        Alumno entity = new  com.fcfm.backend.repository.entity.Alumno();
        entity.setPrimerNombre(alumno.getPrimerNombre());
        entity.setSegundoNombre(alumno.getSegundoNombre());
        entity.setApellidoPat(alumno.getApellidoPat());
        entity.setApellidoMat(alumno.getApellidoMat());
        entity.setCurp(alumno.getCurp());
        entity.setFechaNac(Date.valueOf(alumno.getFechaNac())); //ihgfi
        entity.setEmail(alumno.getEmail());

        return entity;
    }
}