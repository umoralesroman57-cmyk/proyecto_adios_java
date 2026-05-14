import java.util.Scanner;
public class AdiosJava {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el numero 1: ");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el numero 2: ");
        numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("La suma es: " + resultado);

        int resta = numero1 - numero2;
        System.out.println("La resta es: " + resta);
        
        Persona persona1 = new Persona("Ulises",17,"Calle juerez #25","2211234567");

        System.out.println(persona1);
    }

}
