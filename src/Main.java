import java.util.Stack;

public class Main {
    static int posicion = 0;
    public static void main(String[] args) {
        String entrada = "aaaabbb";
        char recorrido[] = entrada.toCharArray();
        Stack pila = new Stack();

        //z indica que la pila está vacía
        pila.push('z');

        //estado 1  lee a, no saca nada y mete n ceros-> a,λ;0
        estado(recorrido, pila,'a','λ','0');

        //cambio al siguiente estado lee b, saca 1 cero; no mete nada-> b,0;λ
        punteroSiguienteEstado(recorrido,pila,'b','0','λ');

        //estado 2 lee b, saca n ceros; no mete nada -> b,0;λ
        estado(recorrido, pila, 'b', '0','λ');

        //cambio al siguiente estado de finalización  no lee nada, saca la z; no mete nada-> λ,z;λ
        punteroEstadoFinal(recorrido,pila,'z');


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
