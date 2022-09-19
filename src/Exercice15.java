import java.util.Scanner;

public class Exercice15 {

    public static void main(String[] args) {
        int x;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a note: ");
        x =input.nextInt();

        if ( 0 <= x && x < 3) {
            System.out.println("Muy deficiente");
        }
        if ( 3 <= x && x < 5) {
            System.out.println("Insuficiente");
        }
        if ( 5 <= x && x < 6) {
            System.out.println("Suficiente");
        }
        if ( 6 <= x && x < 7 ) {
            System.out.println("Bien");
        }
        if ( 7 <= x && x < 9 ) {
            System.out.println("Notable");
        }
        if ( 9 <= x && x <= 10) {
            System.out.println("Sobresaliente");
        }


    }
}
