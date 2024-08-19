package edu.uca.producto;

public class electrodomesticos extends ProductoBase {
    private int garantia;

    public electrodomesticos(int id, String nombre, double precio, int garantia) {
        super(id, nombre, precio);
        this.garantia = garantia;
    }
    @Override
    public String toString() {return super.toString() + " garantia=" + garantia +'}'; }
}
