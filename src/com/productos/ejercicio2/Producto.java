package com.productos.ejercicio2;

import java.util.Objects;

public abstract class Producto {
    /**
     * Identificador único del producto.
     */
    protected final String idProducto;
    /**
     * Nombre del producto.
     */
    protected String nombreProducto;
    /**
     * Precio base del producto.
     */
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
     * Establece el precio base del producto.
     * @param precioProducto Nuevo precio base.
     */
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    /**
     * Devuelve el precio final del producto (puede incluir IVA u otros cálculos en subclases).
     * @return Precio final del producto.
     */
    public abstract double getPrecioProducto();

    /**
     * Compara si dos productos son iguales según su ID.
     * @param obj Objeto a comparar.
     * @return true si los productos tienen el mismo ID, false en caso contrario.
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Producto producto = (Producto) obj;

        return Objects.equals(idProducto, producto.idProducto);
    }

    /**
     * Devuelve el hashCode basado en el ID del producto.
     * @return hashCode del producto.
     */
    public int hashCode() {
        return Objects.hashCode(idProducto);
    }
}
