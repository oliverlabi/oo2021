import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

class JuhuslikValik implements ValikuLiides{
    /*String[] valikud;
    public void lisaValik(String[] valikud){
        this.valikud = valikud;
    }

    public String alusta(){
        int suurus = valikud.length;
        double randNr = Math.floor(Math.random() * suurus);
        int randValik = (int) Math.round(randNr);
        String voitja = valikud[randValik];
        
        return voitja;
    }*/

    ArrayList<String> valikud, ulesanded;
    Random rand = new Random();
    public void lisaValikud(ArrayList<String> valikud){
        this.valikud = valikud;
    }

    public void lisaUlesanded(ArrayList<String> ulesanded){
        this.ulesanded = ulesanded;
    }

    public void alusta(){
        Collections.shuffle(this.ulesanded);
    }

    public String naitaUlesanne(String nimiValik){
        String valjund = "";
        int i = 0;
        for(String nimi : this.valikud){
            if(nimiValik == nimi){
                valjund += "(" + nimi + ": " + this.ulesanded.get(i) + ") ";
                break;
            } else if(nimiValik != nimi){
                i = i + 1;
            } else {
                throw new RuntimeException("Nime pole nimekirjas!");
            }
        }
        return valjund;
    }

    public String naitaUlesanded(){
        String valjund = "";
        for(int i = 0; i<valikud.size(); i++){
            valjund += "(" + valikud.get(i) + ": " + ulesanded.get(i) + ") ";
        }
        return valjund;
    }
}