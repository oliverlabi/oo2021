import java.util.ArrayList;
public class Proov2 {
    public static void main(String[] arg){
        ValikuLiides mV = new MaaratudValik();
        
        ArrayList<String> nimed = new ArrayList();
        nimed.add("Oliver");
        nimed.add("Tanel");
        nimed.add("Toomas");
        nimed.add("Ragnar");
        ArrayList<String> ulesanded = new ArrayList();
        ulesanded.add("Matemaatika");
        ulesanded.add("Programmeerimine");
        ulesanded.add("Blogi");
        ulesanded.add("Slaidid");

        mV.lisaValikud(nimed);
        mV.lisaUlesanded(ulesanded);
        System.out.println(mV.naitaUlesanded());
        mV.alusta();
        System.out.println(mV.naitaUlesanded());
        
        System.out.println(mV.naitaUlesanne("Toomas"));
    }

}