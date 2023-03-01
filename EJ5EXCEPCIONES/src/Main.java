
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
        } while (!validar());
        System.out.println("Adivinaste!!!!!! despues de: " + cont + " intentos");
    }

    static int cont = 0;
    static int numAleatorio = (int) ((Math.random() * 500) + 1);

    public static boolean validar() {
        Scanner leer = new Scanner(System.in);
        int numIngresado = 0;
        try {
            System.out.println("Intenta adivinar el numero en el que estoy pensando");
            numIngresado = leer.nextInt();
            cont++;
            if (numIngresado < numAleatorio) {
                System.out.println("El numero a adivinar es mayor al que acabas de ingresar");
            } else if (numIngresado > numAleatorio) {
                System.out.println("El numero a adivinar es menor al que acabas de ingresar");
            }

        } catch (Exception e) {
            System.out.println("Ingrese un número válido");
            cont++;
        }
        if (numIngresado == numAleatorio) {
            return true;
        } else {
            return false;
        }
    }

}
