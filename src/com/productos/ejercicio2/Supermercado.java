package com.productos.ejercicio2;

import java.util.*;
import java.time.LocalDate;

/**
 * Clase que representa un supermercado con un conjunto de productos.
 */
public class Supermercado {
    /** Nombre del supermercado */
    private String nombreSupermercado;
    /** Conjunto de productos del supermercado */
    private final Set<Producto> productos = new HashSet<>();

    /**
     * Constructor de la clase Supermercado.
     * @param nombreSupermercado Nombre del supermercado.
     */
    public Supermercado(String nombreSupermercado) {
        this.nombreSupermercado = nombreSupermercado;
    }

    /**
     * Obtiene el nombre del supermercado.
     * @return Nombre del supermercado.
     */
    public String getNombreSupermercado() {
        return nombreSupermercado;
    }

    /**
     * Establece el nombre del supermercado.
     * @param nombreSupermercado Nuevo nombre del supermercado.
     */
    public void setNombreSupermercado(String nombreSupermercado) {
        this.nombreSupermercado = nombreSupermercado;
    }

    /**
     * Devuelve el conjunto de productos del supermercado.
     * @return Conjunto de productos.
     */
    public Set<Producto> getProductos() {
        return productos;
    }

    /**
     * Añade un producto al supermercado si no existe previamente.
     * @param producto Producto a añadir.
     * @return true si se añadió correctamente, false si ya existía.
     */
    public boolean addProducto(Producto producto) {
        if (productos.contains(producto)) {
            System.out.println("El producto ya existe");
            return false;
        } else {
            productos.add(producto);
            return true;
        }
    }

    /**
     * Elimina un producto del supermercado si existe.
     * @param producto Producto a eliminar.
     * @return true si se eliminó correctamente, false si no existía.
     */
    public boolean removeProducto(Producto producto) {
        if (productos.contains(producto)) {
            productos.remove(producto);
            return true;
        } else {
            System.out.println("El producto no existe");
            return false;
        }
    }

    /**
     * Busca y devuelve un producto por su ID.
     * @param id ID del producto a buscar.
     * @return El producto si se encuentra, null en caso contrario.
     */
    public Producto getProductoPorID(String id) {
        for (Producto producto : productos) {
            if(producto.idProducto.equals(id)){
                return producto;
            }
        }
        return null;
    }

    /**
     * Actualiza el precio de un producto dado su ID.
     * @param idProducto ID del producto a actualizar.
     * @param nuevoPrecio Nuevo precio a establecer.
     * @return true si se actualizó correctamente, false si no se encontró el producto.
     */
    public boolean actualizarPrecioPorId(String idProducto, double nuevoPrecio) {
        Producto producto = getProductoPorID(idProducto);
        if (producto != null) {
            producto.setPrecioProducto(nuevoPrecio);
            return true;
        }
        return false;
    }

    /**
     * Devuelve una lista de productos de tipo Alimentos que están caducados.
     * @return Lista de productos caducados.
     */
    public List<Alimentos> obtenerProductosCaducados() {
        List<Alimentos> caducados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto instanceof Alimentos) {
                Alimentos alimento = (Alimentos) producto;
                if (alimento.estaCaducado()) {
                    caducados.add(alimento);
                }
            }
        }
        return caducados;
    }
}
