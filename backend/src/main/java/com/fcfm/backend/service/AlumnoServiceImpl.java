package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;
import com.fcfm.backend.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

@Service
public class AlumnoServiceImpl implements AlumnoService{
    List<Alumno> alumnoList = new ArrayList<>();

    private AlumnoRepository alumnoRepository;

    @Autowired
    AlumnoServiceImpl(AlumnoRepository alumnoRepository){this.alumnoRepository = alumnoRepository;}
    public List<Alumno> getAlumnoList(){
        return alumnoList;
    }
    public void createAlumno(Alumno newAlumno){
        com.fcfm.backend.repository.entity.Alumno alumno = new com.fcfm.backend.repository.entity.Alumno();
        alumno.setPrimerNombre(newAlumno.getPrimerNombre());
        alumno.setSegundoNombre(newAlumno.getSegundoNombre());
        alumno.setApellidoPat(newAlumno.getApellidoPat());
        alumno.setApellidoMat(newAlumno.getApellidoMat());
        alumno.setCurp(newAlumno.getCurp());
        alumno.setEmail(newAlumno.getEmail());
        alumno.setFechaNac(Date.valueOf(newAlumno.getFechaNac()));

        alumnoRepository.insertar(alumno);
    }

    public Alumno getAlumnoById(int id){
        com.fcfm.backend.repository.entity.Alumno alumnoEntity = alumnoRepository.getAlumnoById(Long.valueOf(id));
        Alumno alumno = new Alumno();
        alumno.setPrimerNombre(alumnoEntity.getPrimerNombre());
        return alumno;
    }

    public void deleteAlumno(int idAlumno){alumnoList.remove(idAlumno); }

    public void updateAlumno(int idAlumno,Alumno alumnoNuevo){alumnoList.set(idAlumno, alumnoNuevo);}

    public int getListSize(){return alumnoList.size();}
}
