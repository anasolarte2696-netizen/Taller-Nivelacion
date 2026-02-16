
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, resultado = 0;
        char operacion;

      
        System.out.println("Ingrese el primer número:");
        num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo número:");
        num2 = sc.nextDouble();

       
        System.out.println("Seleccione la operación (+, -, *, /):");
        operacion = sc.next().charAt(0);

       
        switch (operacion) {

            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("Operación no válida.");
        }

        sc.close();
    }
}
