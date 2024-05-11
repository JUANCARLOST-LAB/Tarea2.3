package com.fcfm.backend.controller;

import com.fcfm.backend.model.Alumno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/alumno")
public interface AlumnoApiController {
    @PostMapping("/")
    ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo);
    @GetMapping("/{idAlumno}")
    ResponseEntity<Alumno> getAlumnoById(@PathVariable int idAlumno);
    @DeleteMapping("/{idAlumno}")
    ResponseEntity<Void> deleteAlumno(@PathVariable int idAlumno);
    @PutMapping("/{idAlumno}")
    ResponseEntity<Alumno> updateAlumno(@PathVariable int idAlumno, @RequestBody Alumno alumnoActualizado);


    @GetMapping("/")
    ResponseEntity<List<Alumno>> getAllAlumnos();
}