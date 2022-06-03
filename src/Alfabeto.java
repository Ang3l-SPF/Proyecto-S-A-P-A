import java.util.ArrayList;

public class Alfabeto {
    ArrayList<Character> alfabeto = new ArrayList<Character>();

    public boolean ingresarAlfaberto(String entrada){
        char[] arr = entrada.toCharArray();
        byte i=0;
        boolean condicion = Character.isLetter(arr[i]) || Character.isDigit(arr[i]) ||
                (Character.isLetter(arr[i]) || Character.isDigit(arr[i])
                        && Character.isSpaceChar(arr[i+1]) && arr.length>=i+1);
        boolean isValid = false;

        while (condicion && i< arr.length){
            alfabeto.add(arr[i]);
            i+=2;
        }

        if (entrada.length() == alfabeto.size()+alfabeto.size()-1)
            isValid=true;

        return isValid;
    }

    public boolean basicValidAlphabet(String palabra){
        char arr[] = palabra.toCharArray();
        byte[] cantidad = new byte[alfabeto.size()];
        byte  i = 0, j = 0, sum = 0;
        while(j<cantidad.length){
            while (i<palabra.length()){
                if (arr[i]==alfabeto.get(j)){
                    cantidad[j]++;
                }
                i++;
            }
            i=0;j++;
        }
        for (int k = 0; k < cantidad.length; k++) {
            sum += cantidad[k];
        }
        return sum==palabra.length();
    }

}
