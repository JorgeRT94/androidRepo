package com.jorge.pm_ej2;

import java.util.ArrayList;

import model.Producto;


public class Data {

    public static int posicion;
    public static String nombre;
    public static ArrayList<Producto> listProductos;
    public static String[] proveedores;
    public static String[] provincias;


    public static int getPosicion() {
        return posicion;
    }

    public static void setPosicion(int posicion) {
        Data.posicion = posicion;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Data.nombre = nombre;
    }

    public static ArrayList<Producto> getListProductos() {
        return listProductos;
    }

    public static void setListProductos(ArrayList<Producto> listProductos) {
        Data.listProductos = listProductos;
    }

    public static String[] getProveedores() {
        return proveedores;
    }

    public static void setProveedores(String[] proveedores) {
        Data.proveedores = proveedores;
    }

    public static String[] getProvincias() {
        return provincias;
    }

    public static void setProvincias(String[] provincias) {
        Data.provincias = provincias;
    }

    public static void addProductosToList () {

        listProductos = new ArrayList<Producto>();

        for (int i = 0; i < 10; i++) {

            listProductos.add(new Producto("Producto",1,1, 1, 1.00, 5, false));
        }
    }

    public static String[] addProveedores () {

        proveedores = new String[]{"Proveedor 1", "Proveedor 2", "Proveedor 3", "Proveedor 4"};
        return proveedores;
    }

    public static String[] addProvincias () {

        provincias = new String[] {"Sevilla", "Malaga", "Huelva", "Cordoba", "Granada", "Jaen", "Almeria", "Cadiz"};
        return provincias;
    }

}
