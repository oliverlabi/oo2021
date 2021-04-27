import java.util.*;

import org.junit.*;

import jdk.jfr.Timestamp;

import static org.junit.Assert.*;

public class Proov{
    //public static void main(String[] arg){
    Jook fanta = new Jook("fanta", 1.5, 1.08);
    Joogipudel keskmineFanta = new Joogipudel("keskmine", 1000, 0.1, fanta);
    //mass 1080
    Joogipudel vaikeFanta = new Joogipudel("vaike", 500, 0.1, fanta);
    //mass 540
    Joogipudel vagaSuurFanta = new Joogipudel("vagaSuur", 5000, 0.1, fanta);
    //mass 5400

    Joogipudel keskmineTuhi = new Joogipudel("keskmine", 1000, 0.1, null);
    Joogipudel vaikeTuhi = new Joogipudel("vaike", 500, 0.1, null);
    Joogivaat tuhiSuurVaat = new Joogivaat(10000, 0, null);
    Joogivaat tuhiVaikeVaat = new Joogivaat(2500, 0, null);
    
    Joogikast kesminekast = new Joogikast("keskmine", 0, 0, 7);
        
    @Test
    public void mass1(){
        assertEquals(1080.0f, keskmineFanta.leiaMass(), 0.0001f);
    }

    @Test
    public void mass2(){
        assertEquals(0.0f, keskmineTuhi.leiaMass(), 0.0001f);
    }

    @Test
    public void hind1(){
        assertEquals(1.6f, keskmineFanta.leiaOmahind(), 0.0001f);
    }

    @Test
    public void hind2(){
        assertEquals(0.1f, keskmineTuhi.leiaOmahind(), 0.0001f);
    }

    @Test
    public void lisamine1(){
        tuhiSuurVaat.lisaJook(keskmineFanta);
        assertEquals(1080.0f, tuhiSuurVaat.kuvaKogus(), 0.0001f);
    }

    @Test
    public void lisamine2(){
        tuhiVaikeVaat.lisaJook(vagaSuurFanta);
        assertEquals(2500.0f, tuhiVaikeVaat.kuvaKogus(), 0.0001f);
        assertEquals(2900.0f, tuhiVaikeVaat.kuvaUleKogus(), 0.0001f);
    }

    @Test
    public void lisamine3(){
        tuhiVaikeVaat.lisaJook(vaikeFanta);
        tuhiVaikeVaat.lisaJook(keskmineFanta);
        assertEquals(1620.0f, tuhiVaikeVaat.kuvaKogus(), 0.0001f);
    }

    @Test
    public void vaatPudelisse1(){
        tuhiVaikeVaat.lisaJook(vaikeFanta);
        tuhiVaikeVaat.lisaJook(keskmineFanta);
        assertEquals(1620.0f, tuhiVaikeVaat.kuvaKogus(), 0.0001f);

        ArrayList<Joogipudel> fantaPudelid = tuhiVaikeVaat.vaatPudelitesse(vaikeTuhi);
        assertEquals(3, fantaPudelid.size());
    }

    @Test
    public void vaatPudelisse2(){
        tuhiSuurVaat.lisaJook(vagaSuurFanta);
        tuhiSuurVaat.lisaJook(vaikeFanta);
        tuhiSuurVaat.lisaJook(keskmineFanta);
        assertEquals(7020.0f, tuhiSuurVaat.kuvaKogus(), 0.0001f);

        ArrayList<Joogipudel> fantaPudelid = tuhiSuurVaat.vaatPudelitesse(keskmineTuhi);
        assertEquals(7, fantaPudelid.size());

    }

    @Test
    public void kastiLisamine(){

    }
}