import java.util.*;
public class Paevik{
    Hashtable<String, Integer> kursused = new Hashtable<String, Integer>();
    public Set kursusteNimekiri(){
        return kursused.keySet();
    }

    public Hashtable<String, Integer> kursusteEAP(){
        return kursused;
    }

    public void lisaKursus(String kursus, int eap){
        if(kursused.containsKey(kursus)){
            throw new RuntimeException("'" + kursus + "' kursus on juba lisatud.");
        } else if(eap < 0){
            throw new RuntimeException("Sisestatud EAP ei saa olla alla 0!");
        } else {
            kursused.put(kursus, eap);
        }
    }
    
    public double keskmineEAP(){
        double kokkuEAP=0;
        double kursusteArv = 0;
        for(double eap: kursused.values()){
            kokkuEAP = eap + kokkuEAP;
            kursusteArv = kursusteArv + 1;
        }
        double keskmine = kokkuEAP / kursusteArv;
        return keskmine;
    }

    public int kokkuEAP(){
        int kokkuEAP = 0;
        for(int eap: kursused.values()){
            kokkuEAP = eap + kokkuEAP;
        }
        return kokkuEAP;
    }

    public int EAPkalkulaator(int soovitudNumber){
        int puuduEAP = soovitudNumber - kokkuEAP();

        return puuduEAP;

    }

    public void kustutaKursus(String valitudKursus){
        if(kursused.containsKey(valitudKursus)){
            kursused.remove(valitudKursus);
        } else {
            throw new RuntimeException("Kursust " + valitudKursus + " ei ole olemas!");
        }
        
    }

    public int EAPvolgnevus(int sisend){
        int EAPhind = 40;
        int EAPvolgnevus = sisend * EAPhind;

        return EAPvolgnevus;
    }
}