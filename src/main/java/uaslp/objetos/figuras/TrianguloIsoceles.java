package uaslp.objetos.figuras;

import uaslp.objetos.figuras.Triangulo;

public class TrianguloIsoceles extends Triangulo {


    public String getDescription() {
        return "2 Lados iguales y 1 diferente";
    }

    @Override
    public String getName() {
        return "Triangulo Isoceles";
    }
}
