package com.productos.ejercicio2;

import java.time.LocalDate;

/**
 * Clase que representa un producto de alimentación.
 * Hereda de Producto y añade fecha de caducidad y si contiene gluten.
 */
public class Alimentos extends Producto {
    /** Fecha de caducidad del alimento */
    private LocalDate fechaCaducidad;
    /** Indica si contiene gluten */
    private final boolean gluten;
    /** IVA aplicado a los alimentos */
    private final double IVA = 1.11;

    /**
     * Constructor de Alimentos
     * @param idProducto Identificador único
     * @param nombreProducto Nombre del producto
     * @param precioProducto Precio base
     * @param fechaCaducidad Fecha de caducidad
     * @param gluten Si contiene gluten
     */
    public Alimentos(String idProducto, String nombreProducto, double precioProducto,
                     LocalDate fechaCaducidad, boolean gluten) {
        super(idProducto, nombreProducto, precioProducto);
        this.fechaCaducidad = fechaCaducidad;
        this.gluten = gluten;
    }

    /**
     * Devuelve la fecha de caducidad
     * @return Fecha de caducidad
     */
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }
    /**
     * Establece la fecha de caducidad
     * @param fechaCaducidad Nueva fecha
     */
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    /**
     * Indica si contiene gluten
     * @return true si contiene gluten
     */
    public boolean getGluten() {
        return gluten;
    }
    /**
     * Devuelve el precio con IVA
     * @return Precio con IVA
     */
    @Override
    public double getPrecioProducto() {
        return precioProducto * IVA;
    }
    /**
     * Indica si el alimento está caducado
     * @return true si está caducado
     */
    public boolean estaCaducado() {
        return fechaCaducidad.isBefore(LocalDate.now());
    }
    /**
     * Representación en String del alimento
     * @return String con los datos
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alimentos{ ");
        sb.append("idProducto= ").append(idProducto);
        sb.append(", nombreProducto= ").append(nombreProducto);
        sb.append(", fechaCaducidad= ").append(fechaCaducidad);
        sb.append(", gluten= ").append(gluten);
        sb.append(", precioProducto= ").append(precioProducto).append("€");
        sb.append(", iva= ").append(getPrecioProducto()).append("€");
        sb.append(", estaCaducado= ").append(estaCaducado());
        sb.append(" }");
        return sb.toString();
    }
}
