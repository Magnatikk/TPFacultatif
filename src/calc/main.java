package calc;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String args[]) {

        Calculatrice calculatrice = new Calculatrice();

        System.out.println("Rentrez le chiffre que vous voulez rentrer :");
        Scanner sc = new Scanner(System.in);
        Double valeur = sc.nextDouble();

        while(valeur != 2) {
            calculatrice.entrerValeur();
        }

    }
}

