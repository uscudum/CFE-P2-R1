import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer valor:");
        int num = leer.nextInt();

        System.out.println("Ingrese el segundo valor");
        int num2 = leer.nextInt();

        String nombre = leer.nextLine();

        // Comentario
        leer.nextLine();

        System.out.println("El resultado es: " + (num + num2));
    }
}