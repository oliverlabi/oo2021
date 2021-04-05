import java.util.ArrayList;
public abstract class Valik{
    public abstract void alusta();
    ArrayList<String> valikud, ulesanded;
    public void lisaValikud(ArrayList<String> valikud){
        this.valikud = valikud;
    }

    public void lisaUlesanded(ArrayList<String> ulesanded){
        this.ulesanded = ulesanded;
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