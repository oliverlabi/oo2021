import java.util.ArrayList;
import java.util.Scanner;
class MaaratudValik implements ValikuLiides{
    ArrayList<String> valikud, ulesanded;
    public void lisaValikud(ArrayList<String> valikud){
        this.valikud = valikud;
    }

    public void lisaUlesanded(ArrayList<String> ulesanded){
        this.ulesanded = ulesanded;
    }

    public void alusta(){
        Scanner nimesisend = new Scanner(System.in);
        System.out.println("Vali nimi");
        String nimiValik = nimesisend.nextLine();

        Scanner ulsisend = new Scanner(System.in);
        System.out.println("Muuda ülesanne");
        String ulValik = ulsisend.nextLine();
        int j = 1;
        for(int i=0; i<this.valikud.size(); i++){
            if(this.valikud.get(i).equals(nimiValik)){
                this.ulesanded.set(i, ulValik);
            }
        }
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