import java.util.ArrayList;

public class Proov {
    public static void main(String[] arg){
        /*ValikuLiides jV = new JuhuslikValik();
        String[] inimesed = {"Oliver", "Toomas", "Tanel", "Karel"};
        jV.lisaValik(inimesed);
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta ülesanne: ");
        String ulesanne = sisend.nextLine(); 
        System.out.println("Ülesande '"+ulesanne+"' teeb: " + jV.alusta());*/
        ValikuLiides jV = new JuhuslikValik();
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
