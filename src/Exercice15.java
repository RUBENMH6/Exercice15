import java.util.Scanner;

public class Exercice15 {

    public static void main(String[] args) {
        int x;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a note: ");
        x =input.nextInt();

        if (x<0 || x>10) {
            System.out.println("Error");
        } else if (x < 3) {
            System.out.println("Muy deficiente");
        } else if ( 3 <= x && x < 5) {
            System.out.println("Insuficiente");
        } else if ( x == 5 ) {
            System.out.println("Suficiente");
        } else if ( x == 6 ) {
            System.out.println("Bien");
        } else if ( 7 <= x && x < 9 ) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}
