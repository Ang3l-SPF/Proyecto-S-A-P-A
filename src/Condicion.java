import java.util.Arrays;

public class Condicion {
    private String limites;//>= >
    private String operacion; // dividio en 2, +1 *2 etc
    private float veces;
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

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public float getVeces() {
        return veces;
    }

    public void setVeces(float veces) {
        this.veces = veces;
    }
}
