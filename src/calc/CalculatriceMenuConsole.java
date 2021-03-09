package calc;
import java.util.Scanner;

public class CalculatriceMenuConsole {

    public static void menu(Calculatrice c1) {
        System.out.println("Sommet de la calculatrice : " + c1.sommet() + "\t\t(" + c1.nbValeurs() + " valeur(s) dans la pile de la calculatrice )");
        System.out.println("Tapez une valeur pour l'entrer ");
        System.out.println("a pour addition");
        System.out.println("s pour soustraction");
        System.out.println("m pour multiplication");
        System.out.println("d pour division");
        System.out.println("n pour négation");
        System.out.println("sin pour le sinus");
        System.out.println("cos pour le cosinus");
        System.out.println("tan pour la tagente");
        System.out.println("abs pour la valeur absolue");
        System.out.println("ln pour le logarithme neperien");
        System.out.println("logDix pour le logarithme en base 10");
        System.out.println("logDeux pour le logarithme en base 2");
        System.out.println("carre pour la valeur au carré");
        System.out.println("racine pour la racine de la valeur");
        System.out.println("c pour reset la mémoire");
        System.out.println("q pour quitter");
        System.out.println("Faites votre choix ;)");

        Scanner sc = new Scanner(System.in);
        String charChoix = sc.nextLine();

        double choix = 0;
        choix = Calculatrice.ChiffreOuLettre(charChoix, choix);



        while ((int)choix != 113) {
            if ((int)choix == 97) {
                c1.addition();
                menu(c1);
            }
            else if ((int)choix == 115) {
                c1.soustraction();
                menu(c1);
            }
            else if ((int)choix == 109) {
                c1.multiplication();
                menu(c1);
            }
            else if ((int)choix == 100) {
                c1.division();
                menu(c1);
            }
            else if ((int)choix == 110) {
                c1.negation();
                menu(c1);
            }
            else if ((int)choix == 99) {
                c1.effacer();
                menu(c1);
            }
            else if ((int)choix == 113) {
                System.exit(0);
            }
            else if ((int)choix == 330) {
                c1.sinus();
                menu(c1);
            }
            else if ((int)choix == 325) {
                c1.cosinus();
                menu(c1);
            }
            else if ((int)choix == 323) {
                c1.tangente();
                menu(c1);
            }
            else if ((int)choix == 310) {
                c1.absolue();
                menu(c1);
            }
            else if ((int)choix == 218) {
                c1.logneperien();
                menu(c1);
            }
            else if ((int)choix == 615) {
                c1.logBase10();
                menu(c1);
            }
            else if ((int)choix == 728) {
                c1.logBase2();
                menu(c1);
            }
            else if ((int)choix == 525) {
                c1.carre();
                menu(c1);
            }
            else if ((int)choix == 626) {
                c1.racine();
                menu(c1);
            }
            else {
                c1.entrerValeur(choix);
                menu(c1);
            }
        }

    }

}
