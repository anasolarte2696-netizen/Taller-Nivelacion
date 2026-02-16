import java.util.Scanner;

public class invertirCadena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String texto = sc.nextLine();

        String textoInvertido = "";
       
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + textoInvertido);

        sc.close();
    }
}


