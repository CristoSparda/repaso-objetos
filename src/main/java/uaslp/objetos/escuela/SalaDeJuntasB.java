package uaslp.objetos.escuela;

public class SalaDeJuntasB implements SalaDeJuntas{

    private static SalaDeJuntasB uniqueInstace;

    String nombre = "Sala B";

    @Override
    public String getNombre(){
        return nombre;
    }

    public static SalaDeJuntasB getInstance(){
        if(uniqueInstace == null){
            uniqueInstace = new SalaDeJuntasB();
        }
        return uniqueInstace;
    }
}
