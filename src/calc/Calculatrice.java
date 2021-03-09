package calc;
import java.util.*;
import java.lang.Math;

public class Calculatrice {
    private Stack<Double> calculatrice = new Stack<>();
    
    public Calculatrice() {
    }

    public void entrerValeur(double v) {
        this.calculatrice.push(v);
    }

    public static double ChiffreOuLettre(String charChoix, double choix) {
        Boolean flag = Character.isDigit(charChoix.charAt(0));
        if(flag) {
            choix = Double.parseDouble(charChoix);
            return choix;
        }
        else {
            for (int i = 0; i < charChoix.length(); i++) {
                choix += charChoix.charAt(i);
            }
            return choix;
        }
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

    public int division() {
        double val1 = calculatrice.pop();
        double val2 = calculatrice.pop();

        if (val1 == 0) {
            calculatrice.push(val2);
            calculatrice.push(val1);
            return 1;
        }

        double resultatAddition = val2 / val1;
        calculatrice.push(resultatAddition);
        return 0;
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

    public void sinus() {
        double val1 = Math.toRadians(calculatrice.pop());
        calculatrice.push(Math.sin(val1));
    }

    public void cosinus() {
        double val1 = Math.toRadians(calculatrice.pop());
        calculatrice.push(Math.cos(val1));
    }

    public void tangente() {
        double val1 = Math.toRadians(calculatrice.pop());
        calculatrice.push(Math.tan(val1));
    }

    public void absolue() {
        double val1 = calculatrice.pop();
        calculatrice.push(Math.abs(val1));
    }

    public void logneperien() {
        double val1 = calculatrice.pop();
        calculatrice.push(Math.log(val1));
    }

    public void logBase10() {
        double val1 = calculatrice.pop();
        calculatrice.push(Math.log10(val1));
    }

    public  void logBase2() {
        double val1 = calculatrice.pop();
        calculatrice.push((Math.log10(val1) / Math.log(2)));
    }

    public void  carre() {
        double val1 = calculatrice.pop();
        calculatrice.push((val1 * val1));
    }

    public void racine() {
        double val1 = calculatrice.pop();
        calculatrice.push(Math.sqrt(val1));
    }
}


