import java.util.Scanner;

public class MaaratudValik extends Valik implements ValikuLiides {
    public void alusta(){
        Scanner nimesisend = new Scanner(System.in);
        System.out.println("Vali nimi");
        String nimiValik = nimesisend.nextLine();

        Scanner ulsisend = new Scanner(System.in);
        System.out.println("Muuda ülesanne");
        String ulValik = ulsisend.nextLine();
        for(int i=0; i<this.valikud.size(); i++){
            if(this.valikud.get(i).equals(nimiValik)){
                this.ulesanded.set(i, ulValik);
            }
        }
    }
}