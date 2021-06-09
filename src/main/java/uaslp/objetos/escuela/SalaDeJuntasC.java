package uaslp.objetos.escuela;

public class SalaDeJuntasC implements SalaDeJuntas{

    private static SalaDeJuntasC uniqueInstace;

    String nombre = "Sala C";

    @Override
    public String getNombre(){
        return nombre;
    }

    public static SalaDeJuntasC getInstance(){
        if(uniqueInstace == null){
            uniqueInstace = new SalaDeJuntasC();
        }
        return uniqueInstace;
    }
}
