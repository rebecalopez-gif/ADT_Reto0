/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ire22
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private Categoria categoria;
    private int stock;
    private String ruta;

    public Producto() {
    }
    public Producto(int id, String nombre, double precio, Categoria categoria, int stock, String ruta) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        this.ruta = ruta;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    public String getRuta() {
        return ruta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + ", stock=" + stock + ", ruta=" + ruta + '}';
    }
    
    

}
