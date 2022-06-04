import java.util.Arrays;

public class Condicion {
    private String limites;//>= >
    private String operacion; // dividio en 2 +1 *2 e
    private Paridad paridad;//par impar indiferente
        private enum Paridad{
        par, impar, indiferente
    }
    
    public String getLimites() {
        return limites;
    }

    public void setLimites(String limites) {
        this.limites = limites;
    }

    public Paridad getParidad() {
        return paridad;
    }

    public void setParidad(Paridad paridad) {
        this.paridad = paridad;
    }

    @Override
    public String toString() {
        return "Condicion{" +
                "variable=" + variable +
                ", limites=" + limites +
                "es paridad=" + paridad +
                '}';
    }
}
