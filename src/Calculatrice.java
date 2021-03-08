import java.util.*;

public class Calculatrice {



    public Double entrerValeur() {
        System.out.println("Rentrez le chiffre que vous voulez rentrer :");
        Scanner sc = new Scanner(System.in);
        Double valeur = sc.nextDouble();

        return valeur;
    }

    public Double sommet() {
        return calculatrice.peek();
    }

    public void addition() {

    }
}


