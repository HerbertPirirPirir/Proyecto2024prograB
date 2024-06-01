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
public class ListadoLibros extends Transaccion {
    
    private String iSBN, tituloLibro, AutorLibro, editorial;
    private Date añoPublicaciónLibro;
    private Integer cantidadLibroDisponible;

    public ListadoLibros(String iSBN, String tituloLibro, String AutorLibro, String editorial, Date añoPublicaciónLibro, Integer cantidadLibroDisponible, String tipoTransaccion, String libroPrestado, String usuarioLibro, Date fechaPrestamo, Date fechaDevolucion) {
        super(tipoTransaccion, libroPrestado, usuarioLibro, fechaPrestamo, fechaDevolucion);
        this.iSBN = iSBN;
        this.tituloLibro = tituloLibro;
        this.AutorLibro = AutorLibro;
        this.editorial = editorial;
        this.añoPublicaciónLibro = añoPublicaciónLibro;
        this.cantidadLibroDisponible = cantidadLibroDisponible;
    }

    

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return AutorLibro;
    }

    public void setAutorLibro(String AutorLibro) {
        this.AutorLibro = AutorLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Date getAñoPublicaciónLibro() {
        return añoPublicaciónLibro;
    }

    public void setAñoPublicaciónLibro(Date añoPublicaciónLibro) {
        this.añoPublicaciónLibro = añoPublicaciónLibro;
    }

    public Integer getCantidadLibroDisponible() {
        return cantidadLibroDisponible;
    }

    public void setCantidadLibroDisponible(Integer cantidadLibroDisponible) {
        this.cantidadLibroDisponible = cantidadLibroDisponible;
    }
    
    public void agregarNuevoLibro (){
        
    }
    
}
