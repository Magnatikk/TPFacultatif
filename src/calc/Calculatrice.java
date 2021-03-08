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

    public void addition() {
        double val1 = calculatrice.pop();
        double val2 = calculatrice.pop();
        double resultatAddition = val1 + val2;
        calculatrice.push(resultatAddition);
    }

    public void soustraction() {
        double val1 = calculatrice.pop();
        double val2 = calculatrice.pop();
        double resultatAddition = val2 - val1;
        calculatrice.push(resultatAddition);
    }

    public void multiplication() {
        double val1 = calculatrice.pop();
        double val2 = calculatrice.pop();
        double resultatAddition = val1 * val2;
        calculatrice.push(resultatAddition);
    }

    public void division() {
        double val1 = calculatrice.pop();
        double val2 = calculatrice.pop();
        double resultatAddition = val2 / val1;
        calculatrice.push(resultatAddition);
    }

    public void negation() {
        double val1 = calculatrice.pop();
        calculatrice.push(-val1);
    }

    public void effacer() {
        while(!calculatrice.empty()) {
            calculatrice.pop();
        }
    }
}


