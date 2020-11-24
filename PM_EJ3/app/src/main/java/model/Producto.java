package model;

public class Producto {

    private String nombre;
    private int proveedor;
    private int provincia;
    private int caja;
    private double precio;
    private float puntuacion;
    private boolean fragil;


    public Producto(String nombre, int proveedor, int provincia, int caja, double precio, float puntuacion, boolean fragil) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.provincia = provincia;
        this.caja = caja;
        this.precio = precio;
        this.puntuacion = puntuacion;
        this.fragil = fragil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", proveedor=" + proveedor +
                ", provincia=" + provincia +
                ", caja=" + caja +
                ", precio=" + precio +
                ", puntuacion=" + puntuacion +
                ", rojo=" + fragil +
                '}';
    }
}
