import org.junit.*;
import java.util.*;
import jdk.jfr.Timestamp;

import static org.junit.Assert.*;


public class VorrandiTestid{
    Funktsioon liitmine;
    Funktsioon korrutus = new Kordaja(3, 5);
    ArrayList<Double> korrutajaList = new ArrayList<Double>();
    ArrayList<Double> liitmiseList = new ArrayList<Double>();
    public void kontrolliLiitmist(){
        liitmine = new Liida(korrutus.arvuta(), 2);
    }
    
    @Test
    public void ykontroll1(){
        assertEquals(15.0f, korrutus.arvuta(), 0.00f);
        korrutus.muudaXLiige(2);
        assertEquals(6.0f, korrutus.arvuta(), 0.00f);
    }

    @Test
    public void ykontroll2(){
        assertEquals(15.0f, korrutus.arvuta(), 0.00f);
        kontrolliLiitmist();
        assertEquals(17.0f, liitmine.arvuta(), 0.00f);
        korrutus.muudaXLiige(3);
        assertEquals(9.0f, korrutus.arvuta(), 0.00f);
    }

    @Test
    public void ykontroll3(){
        assertEquals(15.0f, korrutus.arvuta(), 0.00f);
        kontrolliLiitmist();
        assertEquals(17.0f, liitmine.arvuta(), 0.00f);
        korrutus.muudaXLiige(3);
        kontrolliLiitmist();
        assertEquals(9.0f, korrutus.arvuta(), 0.00f);
        assertEquals(11.0f, liitmine.arvuta(), 0.00f);
    }

    @Test
    public void massiivikontroll1(){
        liitmine = new Liida(korrutus.arvuta(), 2);
        liitmiseList.add(2.0);
        liitmiseList.add(10.0);
        liitmiseList.add(5.0);
        liitmiseList.add(9.0);
        MassiiviArvutus mituliitmist = new MassiiviArvutus(liitmiseList, liitmine);
        mituliitmist.arvutaMassiiv();
        assertEquals("[17.0, 25.0, 20.0, 24.0]", mituliitmist.toString());
    }

    @Test
    public void massiivikontroll2(){
        korrutajaList.add(2.0);
        korrutajaList.add(10.0);
        korrutajaList.add(5.0);
        korrutajaList.add(9.0);
        MassiiviArvutus mitukorrutamist = new MassiiviArvutus(korrutajaList, korrutus);
        mitukorrutamist.arvutaMassiiv();
        assertEquals("[6.0, 30.0, 15.0, 27.0]", mitukorrutamist.toString());
    }

}