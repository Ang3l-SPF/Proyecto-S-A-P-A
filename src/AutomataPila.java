import java.util.Scanner;
import java.util.Stack;
public class AutomataPila {
    public static void main(String[] args) {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.ingresarAlfaberto("a e i j");

        Scanner tec=new Scanner(System.in);
        while(tec.hasNext()) {
            String cad=tec.next();
            if(cad.charAt(0)=='Z') System.out.println(true);
            else{System.out.println(Verificacion(alfabeto, cad));}
        }
    }

    static boolean Verificacion(Alfabeto alfabeto, String x)
    {
        boolean acepta=false;

        Stack<String> pila = new Stack<String>();
        int i=0;
        while(i<x.length() && x.charAt(i)==alfabeto.alfabeto.get(0))
        {
            pila.push("h"); pila.push("h");
            i++;
        }
        while(i<x.length() && x.charAt(i)==alfabeto.alfabeto.get(1))
        {
            i++;
        }
        while(i<x.length() && x.charAt(i)==alfabeto.alfabeto.get(2))
        {
            if(!pila.empty() && pila.peek()=="h") {pila.pop();}
            else {pila.push("e");}
            i++; }
        while(i<x.length() && x.charAt(i)==alfabeto.alfabeto.get(3))
        {
            if( (i+1)<x.length() && x.charAt(i+1)==alfabeto.alfabeto.get(3) && (i+2)<x.length()&&
                    x.charAt(i+2)==alfabeto.alfabeto.get(3) )
            {i+=3;}
            else{break;}
        }
        if(pila.empty() && i==x.length()) {acepta=true;}
        return acepta;

    }
}