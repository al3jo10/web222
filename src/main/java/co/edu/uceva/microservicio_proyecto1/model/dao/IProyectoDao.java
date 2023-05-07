package co.edu.uceva.microservicio_proyecto1.model.dao;

import co.edu.uceva.microservicio_proyecto1.model.entities.Proyecto;
import org.springframework.data.repository.CrudRepository;

public interface IProyectoDao extends CrudRepository<Proyecto, Long> {
}
