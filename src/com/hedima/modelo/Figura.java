package com.hedima.modelo;

public class Figura {
    private int x;
    private int y;


    public String mostrarPosicion() {
        return "x: " + x + ", y: " + y;
    }

    public double calcularArea() {
        return x*y;
    }

    public Figura() {
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
