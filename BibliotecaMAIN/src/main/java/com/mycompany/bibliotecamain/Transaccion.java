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
public class Transaccion {
    private String tipoTransaccion, libroPrestado, usuarioLibro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Transaccion(String tipoTransaccion, String libroPrestado, String usuarioLibro, Date fechaPrestamo, Date fechaDevolucion) {
        this.tipoTransaccion = tipoTransaccion;
        this.libroPrestado = libroPrestado;
        this.usuarioLibro = usuarioLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(String libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public String getUsuarioLibro() {
        return usuarioLibro;
    }

    public void setUsuarioLibro(String usuarioLibro) {
        this.usuarioLibro = usuarioLibro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public void registrarPrestamo (){
        
    }
     public void registrarDevolucion (){
        
    }
    
     public void calcularMora (){
        
    }
    
}
