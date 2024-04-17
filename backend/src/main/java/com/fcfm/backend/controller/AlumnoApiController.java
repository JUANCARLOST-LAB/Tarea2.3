package com.fcfm.backend.controller;

import com.fcfm.backend.model.Alumno;
import com.fcfm.backend.service.AlumnoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/alumno")
public interface AlumnoApiController {




    @PostMapping("/")
    ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo);

    @GetMapping("/")
    ResponseEntity<List<Alumno>> getAlumnoList();

    @GetMapping("/{idAlumno}")
    ResponseEntity<Alumno> getAlumnoById(@PathVariable int idAlumno);

    @DeleteMapping("/{idAlumno}")
    ResponseEntity<String> deleteAlumno(@PathVariable int idAlumno);

    @PutMapping("/{idAlumno}")
    ResponseEntity<Alumno> updateAlumno(@PathVariable int idAlumno, @RequestBody Alumno alumnoNuevo);


}
