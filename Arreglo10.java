import java.util.*;

public class Arreglo10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;
        int sumapequeña = 0;
        int multiplos = 0;

        do {

            System.out.println("Ingrese un numero:");
            numero = teclado.nextInt();

            if (numero % 6 == 0) {
                multiplos += 1;
            }

            if (numero >= 1 && numero <= 10){
                sumapequeña += numero;
            }

            suma += numero;

        } while (suma < 1000);

        System.out.println("La cantidad de numeros multiplos de 6 es: "+multiplos);
        System.out.println("La suma de los numeros comprendidos entre 1 y 10 es: "+sumapequeña);
        
    }
}