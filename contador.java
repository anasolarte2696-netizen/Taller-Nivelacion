import java.util.Scanner;

public class contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra;
        int vocales = 0;
        int consonantes = 0;

        System.out.println("Ingrese una palabra en minúsculas:");
        palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        sc.close();
    }
}

    
    

