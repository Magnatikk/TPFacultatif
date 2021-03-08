package calc;
import java.util.*;

public class Calculatrice {
    private Stack<Double> calculatrice = new Stack<>();
    
    public Calculatrice(Stack calculatrice) {
        this.calculatrice = calculatrice;
    }

    public Double entrerValeur() {
        System.out.println("Rentrez le chiffre que vous voulez rentrer :");
        Scanner sc = new Scanner(System.in);
        Double valeur = sc.nextDouble();
        calculatrice.push(valeur);
        return valeur;
    }

    public Double sommet() {
        return calculatrice.peek();
    }

    public void addition() {

    }
}


