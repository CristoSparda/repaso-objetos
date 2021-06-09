package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{
    int numeroDeLados;
    double lado;
    public PoligonoRegular(int numeroDeLados){
        if( numeroDeLados <=5)
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public String getName() {
        return "Poligono Regular";
    }

    public double getArea(){
        return (8.6602540378443866666666666666667*(lado*numeroDeLados)/2);
    }

    public double getLado(){
        return lado;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
