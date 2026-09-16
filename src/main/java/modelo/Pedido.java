/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author ire22
 */
public class Pedido {
    private int id;
    private LocalDate fechaPedido; 
    private LocalDate fechaFin; 
    private booelan entregado; 

    public Pedido(int id, LocalDate fechaPedido, LocalDate fechaFin, booelan entregado) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.fechaFin = fechaFin;
        this.entregado = entregado;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public booelan getEntregado() {
        return entregado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }


    public void setEntregado(booelan entregado) {
        this.entregado = entregado;
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", fechaPedido=" + fechaPedido + ", fechaFin=" + fechaFin + ", entregado=" + entregado + '}';
    }
    
}
