package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;

import java.util.List;

public interface AlumnoService {
    void createAlumno(Alumno newAlumno);
    Alumno getAlumnoById(int id);
    void deleteAlumno(int id);
    void updateAlumno(int id, Alumno updatedAlumno);

    List<Alumno> getAllAlumnos();
}