package uaslp.objetos.figuras;

import uaslp.objetos.figuras.Figura;

public class Triangulo extends Figura {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }


    public void setBase(double base) {
        this.base = base;
    }


    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double getArea(){
        if( base == 0)
            throw new BaseNoProvistaException();
        if( altura == 0)
            throw new AlturaNoProvistaException();
        return ((base*altura)/2);
    }


    public double getBase(){
        return base;
    }


    public double getAltura(){
        return altura;
    }

    @Override
    public String getDescription(){
        return "Cualquier triangulo";
    }

    @Override
    public String getName() {
        return null;
    }

}










