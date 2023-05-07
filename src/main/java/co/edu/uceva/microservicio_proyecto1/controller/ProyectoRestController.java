package co.edu.uceva.microservicio_proyecto1.controller;

import co.edu.uceva.microservicio_proyecto1.model.entities.Proyecto;
import co.edu.uceva.microservicio_proyecto1.model.service.IProyectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto")

public class ProyectoRestController {
    @Autowired
    IProyectService proyectService;

    @GetMapping("/hola/{nombre}")
    public String proyect1(@PathVariable("nombre") String nombre){
        return "Proyecto"+ nombre;
    }

    /**
     * Metodo que lista los paises
     * @return Lista de paises
     */
    @GetMapping("/proyectos")
    public List<Proyecto> listar(){
        return proyectService.findAll();
    }

    @GetMapping("/proyectos/{id}")
    public Proyecto buscarPais(@PathVariable("id") Long id){
        return proyectService.findById(id);
    }

    @PostMapping("/proyectos")
    public Proyecto crearPais(@RequestBody Proyecto proyecto){
        return proyectService.save(proyecto);
    }

    @DeleteMapping("/proyectos/{id}")
    public void borrarPais(@PathVariable("id") Long id){
        Proyecto proyecto;
        proyecto = proyectService.findById(id);
        proyectService.delete(proyecto);
    }

    @PutMapping("/proyectos")
    public Proyecto actualizarPais(@RequestBody Proyecto proyecto){
        return proyectService.update(proyecto);
    }
}
