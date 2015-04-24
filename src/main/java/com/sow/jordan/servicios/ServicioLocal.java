/*
 * Paquete que contiene los servicios.
 */
package com.sow.jordan.servicios;

import com.sow.jordan.modelos.Local;
import com.sow.jordan.modelos.Lugar;
import com.sow.jordan.modelos.Servicio;
import com.sow.jordan.modelos.Transporte;
import java.util.List;

/**
 * Interfaz de los servicios de los locales.
 * @author GARCÍA CASTRO HÉCTOR JAVIER
 * @author LARA RAMÍREZ JOSÉ JAVIER
 * @author OLIVOS NAVARRO CESAR JONATHAN
 * @author VILLEGAS MORENO ZEUXIS DANIEL
 */
public interface ServicioLocal {
    
    /**
     * Método para guardar la información de los locales.
     * @param local El local a guardar.
     */
    void guardarLocal(Local local);
    
    /**
     * Método para guardar la información de los lugares.
     * @param lugar El lugar a guardar.
     */
    void guardarLugar(Lugar lugar);
    
    /**
     * Método para guardar la información de los servicios.
     * @param servicio El servicio a guardar.
     */
    void guardarSercivio(Servicio servicio);
    
    /**
     * Método para guardar la información de los transportes.
     * @param transporte El transporte a guardar.
     */
    void guardarTransporte(Transporte transporte);
    
    /**
     * Método que carga la información de los locales.
     * @return Una lista con la información.
     */
    List<Local> cargarLocales();
    
    /**
     * Metodo que carga ls informacion de los lugares
     * @return 
     */
    List<Lugar> cargarLugares();
    
    /**
     * Método que carga la información de los servicios
     * @return Una lista con la información
     */
    List<Servicio> cargarServicios();
    
    /**
     * Método que carga la información de los tranportes.
     * @return Una lista con la información.
     */
    List<Transporte> cargarTransportes();
    
    /**
     * Método para eliminar un local.
     * @param local El local a eliminar.
     */
    void eliminarLocal(Local local);
    
    /**
     * Método que busca un local mediante su id.
     * @param id El id del local.
     * @return Un local.
     */
    Local buscarLocal(int id);
    
    /**
     * Método que busca un lugar mediante su id.
     * @param id El id del lugar.
     * @return Una lista con la información
     */
    Lugar buscarLugar(int id);
    
    /**
     * Método que busca un transporte mediante su id.
     * @param id El id del transporte.
     * @return Un transporte.
     */
    Transporte buscarTransporte(int id);
    
    /**
     * Método que regres una lista de los tipos de transporte.
     * @return Una lista con la información.
     */
    List<String> tipos();
    
    /**
     * Método que regresa los transportes de acuerdo al tipo seleccionado.
     * @param tipo El tipo de transporte
     * @return Una lista con la información.
     */
    List<Transporte> porTipos(String tipo);
    
}
