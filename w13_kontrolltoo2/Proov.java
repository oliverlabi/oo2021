import java.util.ArrayList;

import javax.management.openmbean.ArrayType;
import javax.swing.plaf.basic.BasicListUI.ListDataHandler;

public class Proov{
    public static void main(String[] arg){
        /*Funktsioon sirgjoon1 = new Funktsioon("y=3x", "3*x", 2);
        System.out.println(sirgjoon1.arvuta());*/

        //y=3x
        Funktsioon korrutus1 = new Kordaja(3, 5);
        korrutus1.arvuta();
        System.out.println(korrutus1.toString());

        //y=3x+2
        Funktsioon liitmine1 = new Liida(korrutus1.arvuta(), 2);
        liitmine1.arvuta();
        System.out.println(liitmine1.toString());
        
        //y=3x massiiv
        System.out.println("----Korrutamine-----");
        ArrayList<Double> korrutajaList = new ArrayList<Double>();
        korrutajaList.add(4.0);
        korrutajaList.add(2.5);
        korrutajaList.add(1.0);
        korrutajaList.add(7.0);
        MassiiviArvutus mitukorrutamist = new MassiiviArvutus(korrutajaList, korrutus1);
        mitukorrutamist.arvutaMassiiv();
        System.out.println(korrutajaList);
        System.out.println(mitukorrutamist.toString());

        //y=3x+2 massiiv
        System.out.println("----Liitmine-----");
        ArrayList<Double> liitmiseList = new ArrayList<Double>();
        liitmiseList.add(2.0);
        liitmiseList.add(10.0);
        liitmiseList.add(5.0);
        liitmiseList.add(9.0);
        MassiiviArvutus mituliitmist = new MassiiviArvutus(liitmiseList, liitmine1);
        mituliitmist.arvutaMassiiv();
        System.out.println(liitmiseList);
        System.out.println(mituliitmist.toString());
    }
}