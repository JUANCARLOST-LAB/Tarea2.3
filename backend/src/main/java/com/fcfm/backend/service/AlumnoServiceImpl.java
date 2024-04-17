package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService{
    List<Alumno> alumnoList = new ArrayList<>();
    public List<Alumno> getAlumnoList(){
        return alumnoList;
    }
    public void createAlumno(Alumno newAlumno){
        alumnoList.add(newAlumno);
    }

    public Alumno getAlumnoById(int idAlumno){
        return alumnoList.get(idAlumno);
    }

    public void deleteAlumno(int idAlumno){alumnoList.remove(idAlumno);}

    public void updateAlumno(int idAlumno,Alumno alumnoNuevo){alumnoList.set(idAlumno, alumnoNuevo);}

    public int getListSize(){return alumnoList.size();}
}
