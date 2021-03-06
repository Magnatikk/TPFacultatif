
package calc;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

//import calculatricePile.Calculatrice;

public class CalculatriceTest {

    // Ce jeu de tests est incomplet !!

    @Test
    public final void testEntrerEtEffacer() {
        Calculatrice c = new Calculatrice();

        // Lorsqu'on crée une nouvelle calculatrice, elle doit être vide.
        assertEquals(0, c.nbValeurs());

        c.entrerValeur(2.0);
        assertEquals(1, c.nbValeurs());
        assertEquals(2.0, c.sommet(), 0.0);
        c.entrerValeur(3.0);
        assertEquals(2, c.nbValeurs());
        assertEquals(3.0, c.sommet(), 0.0);
        c.entrerValeur(4.0);
        assertEquals(3, c.nbValeurs());
        assertEquals(4.0, c.sommet(), 0.0);

        c.effacer();
        assertEquals(0, c.nbValeurs());
    }

    @Test
    public final void testAddition() {
        Calculatrice c = new Calculatrice();
        c.entrerValeur(2.0);
        c.entrerValeur(3.0);
        c.entrerValeur(4.0);
        c.addition();
        assertEquals(2, c.nbValeurs());
        assertEquals(7.0, c.sommet(), 0.0);
        c.addition();
        assertEquals(1, c.nbValeurs());
        assertEquals(9.0, c.sommet(), 0.0);
    }
/*
    @Test
    public final void testSoustraction() {
        Calculatrice c = new Calculatrice();
        c.entrerValeur(5.0);
        c.entrerValeur(3.0);
        c.entrerValeur(4.0);
        c.soustraction();
        assertEquals(2, c.nbValeurs());
        assertEquals(-1.0, c.sommet(), 0.0);
        c.soustraction();
        assertEquals(1, c.nbValeurs());
        assertEquals(6.0, c.sommet(), 0.0);
    }

    @Test
    public final void testNégation() {
        Calculatrice c = new Calculatrice();
        c.entrerValeur(2.0);
        c.entrerValeur(3.0);
        c.negation();
        assertEquals(2, c.nbValeurs());
        assertEquals(-3.0, c.sommet(), 0.0);

        // vérifier que les autres valeurs de la pile n'ont pas été touchées
        c.addition();
        assertEquals(-1.0, c.sommet(), 0.0);
    }

*/
}

