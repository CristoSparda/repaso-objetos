package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {

    public static SalaDeJuntas get(String nombre){

        switch (nombre){
            case "Sala A":
                return SalaDeJuntasA.getInstance();
            case "Sala B":
                return SalaDeJuntasB.getInstance();
            case "Sala C":
                return SalaDeJuntasC.getInstance();
        }

        return null;
    }
}
