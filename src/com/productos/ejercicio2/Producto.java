package com.productos.ejercicio2;

/**
 * Clase abstracta base para productos del supermercado.
 */
public abstract class Producto {
    /** Identificador único del producto. */
    protected final String idProducto;
    /** Nombre del producto. */
    protected String nombreProducto;
    /** Precio base del producto. */
    protected double precioProducto;

    /**
     * Constructor de la clase Producto.
     * @param idProducto Identificador único del producto.
     * @param nombreProducto Nombre del producto.
     * @param precioProducto Precio base del producto.
     */
    public Producto(String idProducto, String nombreProducto, double precioProducto)
    {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    /**
     * Devuelve el identificador del producto.
     * @return ID del producto.
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * Devuelve el nombre del producto.
     * @return Nombre del producto.
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Establece el nombre del producto.
     * @param nombreProducto Nuevo nombre del producto.
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * Devuelve el precio base del producto.
     * @return Precio base.
     */
    public double getPrecioProducto() {
        return precioProducto;
    }

    /**
     * Establece el precio base del producto.
     * @param precioProducto Nuevo precio base.
     */
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
}
