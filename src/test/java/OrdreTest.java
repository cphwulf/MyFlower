import com.sun.tools.corba.se.idl.constExpr.Or;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrdreTest {
    Ordre ordre;
    Buket buket;
    Adresse adresse;
    Blomst blomst;
    Tilbehør tilbehør;

    @Before
    public void setUp() throws Exception {
        // Arrange
        blomst = new Blomst("Tulipan");
        tilbehør = new Tilbehør("Snepryd");
        buket = new Buket("Bryllup");
        buket.setBlomst(blomst);
        buket.setTilbehør(tilbehør);
        buket.setPris();
        adresse = new Adresse("Odense");
        ordre = new Ordre();
        ordre.setBuket(buket);
        ordre.setAdresse(adresse);
        ordre.setPris();
    }

    @Test
    public void getPris() {
        int expected = 377;
        int actual = ordre.getPris();
        assertEquals(expected,actual);
    }

}