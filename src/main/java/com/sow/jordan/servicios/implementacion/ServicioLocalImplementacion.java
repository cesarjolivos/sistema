/*
 * Paquete en el que se implementan los Servicios
 */
package com.sow.jordan.servicios.implementacion;

import com.sow.jordan.modelos.*;
import com.sow.jordan.repositorios.*;
import com.sow.jordan.servicios.ServicioLocal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Clase que implementa los servicios de local.
 * @author GARCÍA CASTRO HÉCTOR JAVIER
 * @author LARA RAMÍREZ JOSÉ JAVIER
 * @author OLIVOS NAVARRO CESAR JONATHAN
 * @author VILLEGAS MORENO ZEUXIS DANIEL
 */
public class ServicioLocalImplementacion implements ServicioLocal{

    @Autowired
    private RepositorioLocal repositorioLocal; 
    
    @Autowired
    private RepositorioLugar repositorioLugar;
    
    @Autowired
    private RepositorioServicio repositorioServicio;
    
    @Autowired
    private RepositorioTransporte repositorioTransporte;

    /**
     * Método para guardar la información de los locales.
     * @param local El local a guardar.
     */
    @Override
    public void guardarLocal(Local local) {
        for(Menu menu:local.getMenu()){
            menu.setLocal(local);
        }
        repositorioLocal.save(local);
    }
    
    /**
     * Método para guardar la información de los lugares
     * @param lugar El lugar a guardar
     */
    @Override
    public void guardarLugar(Lugar lugar) {
        repositorioLugar.save(lugar);
    }

    /**
     * Método para guardar la información de los servicios
     * @param servicio El servicio a guardar
     */
    @Override
    public void guardarSercivio(Servicio servicio) {
        repositorioServicio.save(servicio);
    }
    
    /**
     * Método para guardar la información de los transportes.
     * @param transporte El transporte a guardar.
     */
    @Override
    public void guardarTransporte(Transporte transporte) {
        repositorioTransporte.save(transporte);
    }

    /**
     * Método que carga la información de los locales.
     * @return Una lista con la información.
     */
    @Override
    public List<Local> cargarLocales() {
        return repositorioLocal.cargarLocales();
    }
    
    /**
     * Metodo que carga ls informacion de los lugares
     * @return 
     */
    @Override
    public List<Lugar> cargarLugares() {
        return repositorioLugar.cargarLugares();
    }

    /**
     * Método que carga la información de los servicios
     * @return Una lista con la información
     */
    @Override
    public List<Servicio> cargarServicios() {
        return repositorioServicio.cargarServicios();
    }

    /**
     * Método que carga la información de los tranportes.
     * @return Una lista con la información.
     */
    @Override
    public List<Transporte> cargarTransportes(){
        return repositorioTransporte.cargarTranportes();
    }
    
    /**
     * Método para eliminar un local.
     * @param local El local a eliminar.
     */
    @Override
    public void eliminarLocal(Local local) {
        repositorioLocal.delete(local);
    }
    
    /**
     * Método que busca un local mediante su id.
     *
     * @param id El nombre del local.
     * @return Un local.
     */
    @Override
    public Local buscarLocal(int id) {
        return repositorioLocal.buscarLocal(id);
    }
    
    /**
     * Método que busca un lugar mediante su id.
     * @param id El id del lugar.
     * @return Una lista con la información
     */
    @Override
    public Lugar buscarLugar(int id) {
        return repositorioLugar.buscarLugar(id);
    }
    
    /**
     * Método que busca un transporte mediante su id.
     * @param id El id del transporte.
     * @return Un transporte.
     */
    @Override
    public Transporte buscarTransporte(int id){
        return repositorioTransporte.buscarTransporte(id);
    }

    /**
     * Método que regres una lista de los tipos de transporte.
     * @return Una lista con la información.
     */
    @Override
    public List<String> tipos() {
        return repositorioTransporte.tipos();
    }

    /**
     * Método que regresa los transportes de acuerdo al tipo seleccionado.
     * @param tipo El tipo de transporte
     * @return Una lista con la información.
     */
    @Override
    public List<Transporte> porTipos(String tipo) {
        return repositorioTransporte.porTipos(tipo);
    }
    
}
