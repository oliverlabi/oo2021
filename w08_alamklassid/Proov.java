import java.util.ArrayList;

public class Proov {
    public static void main(String[] arg){
        JuhuslikValik jV = new JuhuslikValik();
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
        jV.lisaValikud(nimed);
        jV.lisaUlesanded(ulesanded);
        jV.alusta();
        System.out.println(jV.naitaUlesanded());
        System.out.println(jV.naitaUlesanne("Toomas"));

    }

}
