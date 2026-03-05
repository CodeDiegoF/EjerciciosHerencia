package com.productos.ejercicio2;

/**
 * Clase que representa un producto de droguería.
 * Hereda de Producto y añade nivel de toxicidad.
 */
public class Drogueria extends Producto {
    /** Nivel de toxicidad del producto */
    private NivelToxicidad nivelToxicidad;
    /** IVA aplicado a droguería */
    private final double IVA = 1.21;

    /**
     * Constructor de Drogueria
     * @param idProducto Identificador único
     * @param nombreProducto Nombre del producto
     * @param precioProducto Precio base
     * @param nivelToxicidad Nivel de toxicidad
     */
    public Drogueria(String idProducto, String nombreProducto, double precioProducto,
                     NivelToxicidad nivelToxicidad) {
        super(idProducto, nombreProducto, precioProducto);
        this.nivelToxicidad = nivelToxicidad;
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
     * Representación en String del producto de droguería
     * @return String con los datos
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Drogueria{ ");
        sb.append("idProducto= ").append(idProducto);
        sb.append(", nombreProducto= ").append(nombreProducto);
        sb.append(", precioProducto= ").append(precioProducto).append("€");
        sb.append(", iva= ").append(getPrecioProducto()).append("€");
        sb.append(", nivelToxicidad= ").append(nivelToxicidad);
        sb.append(" }");
        return sb.toString();
    }
}
