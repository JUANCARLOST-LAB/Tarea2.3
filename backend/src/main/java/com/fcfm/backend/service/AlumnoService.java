package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AlumnoService {

    void createAlumno(Alumno newAlumno);

    List<Alumno> getAlumnoList();
    Alumno getAlumnoById(int idAlumno);

    void deleteAlumno(int idAlumno);

    void updateAlumno(int idAlumno,Alumno alumnoNuevo);

    int getListSize();

}
