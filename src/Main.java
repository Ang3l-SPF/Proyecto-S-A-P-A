import java.util.Stack;

public class Main {
    static int posicion = 0;
    public static void main(String[] args) {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.ingresarAlfaberto("0  1");
        alfabeto.basicValidAlphabet("021");
    }

    public static boolean isWord(String palabra){
        Stack pila = new Stack<Byte>();
        char recorrido[] = palabra.toCharArray();
        for (int i = 0; i < recorrido.length; i++) {
            if (recorrido[i] == 'a' && recorrido[i+1]=='a'){
                pila.push(0);
                i++;
            }else if(recorrido[i] == 'b'){
                pila.pop();
            }
        }
        return pila.empty();
    }

    public static void estado(char[] palabra, Stack pila, char leido, char sacado, char ingresado){

        while(posicion< palabra.length &&palabra[posicion]==leido) {
            if (sacado != 'λ') {
                if (!pila.pop().equals(sacado)) {
                    throw new RuntimeException("ERROR");
                }
            }
            if (ingresado != 'λ') {
                pila.push(ingresado);
            }
            posicion++;
        }

    }

    public static void punteroSiguienteEstado(char[] palabra, Stack pila, char leido, char sacado, char ingresado){
        if(palabra[posicion]==leido)
        if (sacado!='λ'){
            if (!pila.pop().equals(sacado)){
                throw new RuntimeException("ERROR");
            }
        }
        if (ingresado!='λ'){
            pila.push(ingresado);
        }
        posicion++;
    }

    public static void punteroEstadoFinal(char[] palabra, Stack pila, char sacado){
        if (pila.pop().equals(sacado)){
            System.out.println("la palabra existe");
        }else {
            System.out.println("la palabra no existe");
        }

    }
}
