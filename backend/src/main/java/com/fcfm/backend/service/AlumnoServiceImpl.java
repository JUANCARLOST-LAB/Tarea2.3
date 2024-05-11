package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;
import com.fcfm.backend.repository.AlumnoRepository;
import com.fcfm.backend.utils.AlumnoMapper;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService{
    List<Alumno> alumnoList = new ArrayList<>();
    private AlumnoRepository alumnoRepository;
    @Autowired
    AlumnoServiceImpl(AlumnoRepository alumnoRepository) {this.alumnoRepository = alumnoRepository;}
    public void createAlumno(Alumno newAlumno){
        alumnoRepository.insertar(AlumnoMapper.alumnoModelToAlumnoEntity2(newAlumno));
    }
    public Alumno getAlumnoById(int id){
        com.fcfm.backend.repository.entity.Alumno alumnoEntity = alumnoRepository.getAlumnoById(Long.valueOf(id));
        return AlumnoMapper.alumnoEntitytoAlumnoModel(alumnoEntity);
    }
    @Override
    public void deleteAlumno(int id) {alumnoRepository.eliminar(Long.valueOf(id));}

    @Override
    public void updateAlumno(int id, Alumno updatedAlumno) {
        Alumno existingAlumno = getAlumnoById(id);
        if (existingAlumno != null) {
            existingAlumno.setPrimerNombre(updatedAlumno.getPrimerNombre());
            existingAlumno.setSegundoNombre(updatedAlumno.getSegundoNombre());
            existingAlumno.setApellidoPat(updatedAlumno.getApellidoPat());
            existingAlumno.setApellidoMat(updatedAlumno.getApellidoMat());
            existingAlumno.setCurp(updatedAlumno.getCurp());
            existingAlumno.setFechaNac(updatedAlumno.getFechaNac()); //ihgfi
            existingAlumno.setEmail(updatedAlumno.getEmail());
            alumnoRepository.actualizar(AlumnoMapper.alumnoModelToAlumnoEntity(existingAlumno));
        }
    }



    @Override
    public List<Alumno> getAllAlumnos() {
        List<com.fcfm.backend.repository.entity.Alumno> alumnosEntityList = alumnoRepository.getAllAlumnos();
        List<Alumno> alumnosList = new ArrayList<>();
        for (com.fcfm.backend.repository.entity.Alumno alumnoEntity : alumnosEntityList) {
            alumnosList.add(AlumnoMapper.alumnoEntitytoAlumnoModel(alumnoEntity));
        }
        return alumnosList;
    }
}