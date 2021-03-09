package calc;
import java.util.*;

public class Calculatrice {
    private Stack<Double> calculatrice = new Stack<>();
    
    public Calculatrice() {
    }

    public void entrerValeur(double v) {
        this.calculatrice.push(v);
    }

    public int nbValeurs() {
        if(this.calculatrice.isEmpty()) {
            return 0;
        }
        return this.calculatrice.size();
    }

    public Double sommet() {
        if (!calculatrice.isEmpty()) {
            return calculatrice.peek();
        }
        else {
            return 0.0;
        }
    }

    public void addition() {
        double val1 = this.calculatrice.pop();
        double val2 = this.calculatrice.pop();
        double resultatAddition = val1 + val2;
        this.calculatrice.push(resultatAddition);
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


