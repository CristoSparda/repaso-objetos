package uaslp.objetos.escuela;

public class SalaDeJuntasA implements SalaDeJuntas{
    static SalaDeJuntasA uniqueInstace;

    String nombre = "Sala A";

    @Override
    public String getNombre(){
        return nombre;
    }

    public static SalaDeJuntasA getInstance(){
        if(uniqueInstace == null){
            uniqueInstace = new SalaDeJuntasA();
        }
        return uniqueInstace;
    }

}
