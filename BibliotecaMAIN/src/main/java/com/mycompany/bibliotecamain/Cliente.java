/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecamain;

import java.util.Date;

/**
 *
 * @author herbert
 */
public class Cliente extends Usuarios {
    
    private Integer idUsuario;

    public Cliente(Integer idUsuario, String nombre, String direccion, Integer telefono, Integer dpi, Integer tipoUsuario, String tipoTransaccion, String libroPrestado, String usuarioLibro, Date fechaPrestamo, Date fechaDevolucion) {
        super(nombre, direccion, telefono, dpi, tipoUsuario, tipoTransaccion, libroPrestado, usuarioLibro, fechaPrestamo, fechaDevolucion);
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public void pedirLibro(){
        
    }
    
}
