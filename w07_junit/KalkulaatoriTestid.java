import org.junit.*;
import static org.junit.Assert.*;

public class KalkulaatoriTestid{
    KalkulaatoriLiides k=new KalkulaatoriKaivitus();
    @Before
    public void puhasta(){
        k.vajutus("C");
    }
    @Test
    public void sisestus1(){
        assertEquals("", k.kuvatav());
        k.vajutus("2");
        assertEquals("2", k.kuvatav());
    }
    @Test
    public void sisestus2(){
        k.vajutus("3");
        k.vajutus("5");
        assertEquals("35", k.kuvatav());
    }
    @Test
    public void sisestus3(){
        k.vajutus("2");
        k.vajutus("0");
        k.vajutus("0");
        k.vajutus("5");
        assertEquals("2005", k.kuvatav());
    }
    @Test
    public void arvutus1(){
        k.vajutus("3");
        k.vajutus("+");
        assertEquals("3", k.kuvatav());
        k.vajutus("2");
        assertEquals("2", k.kuvatav());
        k.vajutus("=");
        assertEquals("5", k.kuvatav());
    }
    @Test
    public void arvutus2(){
        k.vajutus("2");
        k.vajutus("0");
        k.vajutus("0");
        k.vajutus("5");
        assertEquals("2005", k.kuvatav());
        k.vajutus("+");
        k.vajutus("3");
        k.vajutus("0");
        assertEquals("30", k.kuvatav());
        k.vajutus("=");
        assertEquals("2035", k.kuvatav());
    }
    @Test
    public void arvutus3(){
        k.vajutus("2");
        k.vajutus("1");
        assertEquals("21", k.kuvatav());
        k.vajutus("+");
        assertEquals("21", k.kuvatav());
        k.vajutus("1");
        k.vajutus("1");
        assertEquals("11", k.kuvatav());
        k.vajutus("=");
        assertEquals("32", k.kuvatav());
    }

    @Test
    public void arvutus4(){
        k.vajutus("2");
        k.vajutus("1");
        assertEquals("21", k.kuvatav());
        k.vajutus("+");
        assertEquals("21", k.kuvatav());
        k.vajutus("1");
        assertEquals("1", k.kuvatav());
        k.vajutus("1");
        k.vajutus("+");
        assertEquals("11", k.kuvatav());
        k.vajutus("1");
        k.vajutus("1");
        assertEquals("11", k.kuvatav());
        k.vajutus("=");
        assertEquals("43", k.kuvatav());
    }

    @Test
    public void arvutus5(){
        k.vajutus("2");
        k.vajutus("1");
        assertEquals("21", k.kuvatav());
        k.vajutus("-");
        assertEquals("21", k.kuvatav());
        k.vajutus("1");
        k.vajutus("1");
        assertEquals("11", k.kuvatav());
        k.vajutus("=");
        assertEquals("10", k.kuvatav());
    }

    @Test
    public void arvutus6(){
        k.vajutus("2");
        k.vajutus("1");
        assertEquals("21", k.kuvatav());
        k.vajutus("-");
        assertEquals("21", k.kuvatav());
        k.vajutus("1");
        k.vajutus("+");
        assertEquals("1", k.kuvatav());
        k.vajutus("1");
        k.vajutus("0");
        assertEquals("10", k.kuvatav());
        k.vajutus("0");
        assertEquals("100", k.kuvatav());
        k.vajutus("=");
        assertEquals("122", k.kuvatav());
    }

    @Test
    public void arvutus7(){
        k.vajutus("2");
        k.vajutus("1");
        assertEquals("21", k.kuvatav());
        k.vajutus("*");
        assertEquals("21", k.kuvatav());
        k.vajutus("3");
        k.vajutus("=");
        assertEquals("63", k.kuvatav());
    }

    @Test
    public void arvutus8(){
        k.vajutus("2");
        assertEquals("2", k.kuvatav());
        k.vajutus("*");
        k.vajutus("3");
        assertEquals("3", k.kuvatav());
        k.vajutus("*");
        k.vajutus("2");
        k.vajutus("0");
        k.vajutus("=");
        assertEquals("120", k.kuvatav());
    }
}