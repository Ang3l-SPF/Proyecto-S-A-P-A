public class Conversor {

    public boolean convertirABoolean(Condicion condicion, byte cantVeces){
        boolean cumple = false;
                switch (condicion.getLimites()){
                    case ">":
                        if (cantVeces>condicion.getVeces())
                        break;
                    case ">=":
                        if (cantVeces>=condicion.getVeces())
                        break;
                }
        return cumple;
    }

    public boolean cumpleOperacion(Condicion condicion, byte cantVeces){
        return false;
    }
}
