package javaejercicio;
/*@author IrmaZ*/
    import java.util.Scanner;
    import java.util.Arrays;
public class JavaEjercicio {
    public static void main(String[] args) {
        /*EJERCICIO: Que le pida al usuario ingresar 5 numeros al azar y que 
        la aplicación lo ordene de menor a mayor*/
        System.out.println("EJERCICIO NÚMERO UNO");
        Scanner ingresar = new Scanner (System.in);
                int[] number = new int [5];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Ingrese el N°: " + (i+1) + ": ");
            number[i] = ingresar.nextInt();
        }
        Arrays.sort(number);
        System.out.println("Los números ordenados de menor a mayor: ");
        for (int num : number) {
            System.out.println(num + " ");
        }
    }
}
