import java.util.Arrays;

public class Condicion {
    private char variable;//n m
    private char[] limites;//>= >
    private Paridad paridad;//par impar indif
        private enum Paridad{
        par, impar, indif
    }

    public char getVariable() {
        return variable;
    }

    public void setVariable(char variable) {
        this.variable = variable;
    }

    public char[] getLimites() {
        return limites;
    }

    public void setLimites(char[] limites) {
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
                ", limites=" + Arrays.toString(limites) +
                ", paridad=" + paridad +
                '}';
    }
}
