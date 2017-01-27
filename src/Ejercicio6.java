import java.util.Scanner;

/**
 * Created by 46995932d on 13/01/2017.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int i;

        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]    = ");
            numeros[i]=sc.nextInt();
        }

        int totalPares = 0;

        for (i = 0; i < numeros.length; i++){

            if (i%2 == 0){

                totalPares =totalPares+numeros[i];


            }


        }

        double media = totalPares%5;
        System.out.println("La media de los numeros en posicion par es de " +media);

    }
}
