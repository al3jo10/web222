package co.edu.uceva.microservicio_proyecto1.model.service;

import co.edu.uceva.microservicio_proyecto1.model.entities.Proyecto;

import java.util.List;

public interface IProyectService {
    Proyecto save(Proyecto proyecto);
    void delete(Proyecto proyecto);
    Proyecto update(Proyecto proyecto);
    List<Proyecto> findAll();
    Proyecto findById(Long id);
}
