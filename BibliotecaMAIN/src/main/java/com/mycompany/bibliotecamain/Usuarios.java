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
public class Usuarios extends Transaccion {
    private String nombre, direccion;
    private Integer telefono, dpi, tipoUsuario;

    public Usuarios(String nombre, String direccion, Integer telefono, Integer dpi, Integer tipoUsuario, String tipoTransaccion, String libroPrestado, String usuarioLibro, Date fechaPrestamo, Date fechaDevolucion) {
        super(tipoTransaccion, libroPrestado, usuarioLibro, fechaPrestamo, fechaDevolucion);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dpi = dpi;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public Integer getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    private void registrarUsuarios(){
        
    }
    
}
