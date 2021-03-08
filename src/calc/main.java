package calc;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String args[]) {
        Stack<Double> calculatrice = new Stack<>();
        Calculatrice calc = new Calculatrice(calculatrice);

        System.out.println("Rentrez le chiffre que vous voulez rentrer :");
        Scanner sc = new Scanner(System.in);
        Double valeur = sc.nextDouble();

        for (int i = 0; i < 10; i++) {
            calc.entrerValeur();
            System.out.println(calculatrice.size());
        }

    }
}

