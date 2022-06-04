public class Conversor {

    public boolean convertirABoolean(Condicion condicion, byte cantVeces){
        boolean cumple = false;
                switch (condicion.getLimites()){
                    case ">":
                        if (cantVeces>condicion.getVariable())
                        break;
                    case ">=":
                        break;
                }
        return cumple;
    }
}
