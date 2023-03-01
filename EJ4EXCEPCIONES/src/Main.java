import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String num1, num2;
        Double num3, num4;
        System.out.println("Ingrese el primer numero");
        num1 = leer.next();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.next();

        Double resultado = null;

        try {
            System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
            num3 = Double.parseDouble(num1);
            num4 = Double.parseDouble(num2);
            resultado = num3 / num4;
            if (num4 == 0) {
                throw new ArithmeticException();
            }
            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println("Es imposible dividir entre 0");
        } catch(NumberFormatException nfe){
            System.err.println("Es imposible convertir string a numero");
        } catch( InputMismatchException IME){
            System.err.println("Usted no ingreso un número");
        }
    }
}