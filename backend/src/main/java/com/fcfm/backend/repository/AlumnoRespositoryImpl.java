package com.fcfm.backend.repository;
import com.fcfm.backend.repository.AlumnoRepository;
import com.fcfm.backend.repository.entity.Alumno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AlumnoRespositoryImpl implements AlumnoRepository{
    @PersistenceContext
    private EntityManager em;
    @Transactional
    public void insertar(Alumno alumno){
        em.persist(alumno);
    }
    @Override
    public Alumno getAlumnoById(Long id){
        return em.find(Alumno.class, id);
    }
    @Transactional
    public void eliminar(Long id) {em.remove(getAlumnoById(id));}

    @Transactional
    public void actualizar(Alumno alumno) {
        em.merge(alumno);
    }


    public List<Alumno> getAllAlumnos() {
        TypedQuery<Alumno> query = em.createQuery("SELECT a FROM Alumno a", Alumno.class);
        return query.getResultList();
    }

}