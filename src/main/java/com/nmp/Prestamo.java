package com.nmp;

public class Prestamo {

    private int idMaterial;
    private String material;
    private String precio ;
    private double gramos;

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public double getGramos() {
        return gramos;

    }
    public void setGramos(double gramos) {
        this.gramos = gramos;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "idMaterial=" + idMaterial +
                ", material='" + material + '\'' +
                ", precio='" + precio + '\'' +
                ", gramos=" + gramos +
                '}';
    }

}

