
package model;

public class Triangulo {
    private double altura;
    private double base;

    public Triangulo(){
        this (0,0);
    }
 public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        return base;
    }
    public double getArea(){
        return ((getBase() * getAltura())/2.0);
    }
}