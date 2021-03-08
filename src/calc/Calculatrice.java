package calc;
import java.util.*;

public class Calculatrice {
    private Stack<Double> calculatrice = new Stack<>();
    
    public Calculatrice() {
        this.calculatrice = calculatrice;
    }

    public Double entrerValeur(double v) {
        calculatrice.push(v);
        return v;
    }

    public int nbValeurs() {
        if(this.calculatrice.isEmpty()) {
            return 0;
        }
        return this.calculatrice.size();
    }

    public Double sommet() {
        return calculatrice.peek();
    }

    public double addition() {
        double val1 = calculatrice.peek();
        calculatrice.pop();
        double val2 = calculatrice.peek();
        calculatrice.pop();
        double resultatAddition = val1 + val2;
        calculatrice.push(resultatAddition);
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




    public void effacer() {
        while(!calculatrice.empty()) {
            calculatrice.pop();
        }
    }
}


