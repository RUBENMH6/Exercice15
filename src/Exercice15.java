import java.util.Scanner;

public class Exercice15 {

    public static void main(String[] args) {
        int x;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a note: ");
        x =input.nextInt();

        if ( 0 <= x && x < 3) {
            System.out.println("Muy deficiente");
        } else if ( 3 <= x && x < 5) {
            System.out.println("Insuficiente");
        } else if ( x == 5 ) {
            System.out.println("Suficiente");
        } else if ( x == 6 ) {
            System.out.println("Bien");
        } else if ( 7 <= x && x < 9 ) {
            System.out.println("Notable");
        } else if (x <= 10 && (x>=0)) { //Para que no de "Sobresaliente" si metemos un numero negativo
            System.out.println("Sobresaliente");
        }
    }
}
