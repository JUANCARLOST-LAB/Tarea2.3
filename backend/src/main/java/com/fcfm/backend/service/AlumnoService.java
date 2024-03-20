package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;

import java.util.List;

public interface AlumnoService {

    void createAlumno(Alumno newAlumno);

    List<Alumno> getAlumnoList();
    Alumno getAlumnoById(int idAlumno);
}
