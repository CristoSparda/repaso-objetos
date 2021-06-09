package uaslp.objetos.figuras;


public class Cuadrado extends Figura {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {

    }

    @Override
    public String getName(){
        return "Cuadrado";
    }


    public void setLado(double lado){
        this.lado = lado;
    }


    public double getLado(){
        return lado;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double getArea() {
        if( lado == 0)
            throw new LadoNoProvistoException();
        return (lado*lado);
    }

}
