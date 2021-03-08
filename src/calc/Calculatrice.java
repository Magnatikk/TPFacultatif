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

    public double addition() {
        double val1 = calculatrice.peek();
        calculatrice.pop();
        double val2 = calculatrice.peek();
        double resultatAddition = val1 + val2;
        calculatrice.push(val1);

        return resultatAddition;
    }

    public double soustraction() {
        double val1 = calculatrice.peek();
        calculatrice.pop();
        double val2 = calculatrice.peek();
        double resultatSoustraction = val1 - val2;
        calculatrice.push(val1);

        return resultatSoustraction;
    }

    public double multiplication() {
        double val1 = calculatrice.peek();
        calculatrice.pop();
        double val2 = calculatrice.peek();
        double resultatMultiplication = val1 * val2;
        calculatrice.push(val1);

        return  resultatMultiplication;
    }

    public double division() {
        double val1 = calculatrice.peek();
        calculatrice.pop();
        double val2 = calculatrice.peek();
        double resultatDivision = val1 / val2;
        calculatrice.push(val1);
        return resultatDivision;
    }




    public void supprimerMemoire() {
        while(!calculatrice.empty()) {
            calculatrice.pop();
        }
    }
}


