package co.edu.uceva.microservicio_proyecto1.model.service;


import co.edu.uceva.microservicio_proyecto1.model.dao.IProyectoDao;
import co.edu.uceva.microservicio_proyecto1.model.entities.Proyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoServiceImpl implements IProyectService{


    @Autowired
    IProyectoDao proyectoDao;

    @Override
    public Proyecto save(Proyecto proyecto) {
        return proyectoDao.save(proyecto);
    }

    @Override
    public void delete(Proyecto proyecto) {
        proyectoDao.delete(proyecto);
    }

    @Override
    public Proyecto update(Proyecto proyecto) {
        return proyectoDao.save(proyecto);
    }

    /**
     * Este metodo lista los paises guardados
     * @return una lista de paises
     */
    @Override
    public List<Proyecto> findAll() {
        return (List<Proyecto>) proyectoDao.findAll();
    }

    /**
     * Este metodo busca un pais
     * @param id Llave primaria del pais que se quiere buscar
     * @return el pais identificado por el campo id
     */
    @Override
    public Proyecto findById(Long id) {
        return proyectoDao.findById(id).get();
    }
}
