import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class failiLugemine{
    public static void main(String argumendid[]) throws IOException{
    ArrayList<Integer> arvud = new ArrayList();
    BufferedReader sisse=new BufferedReader(
      new FileReader("arvud.txt")
    );
    String rida = sisse.readLine();
    while(rida != null){
        int arv = Integer.parseInt(rida);
        rida = sisse.readLine();
        arvud.add(arv);
    }
    sisse.close();

    System.out.println("\nfaili arvud: " + arvud + "\n");
    int arv1 = arvud.get(2);
    int arv2 = arvud.get(16);
    liitmine liitmine = new liitmine();
    int liidetud = liitmine.liida(arv1, arv2);
    System.out.println(arv1);
    System.out.println(arv2);
    System.out.println(liidetud);
    System.out.println("\nFormaatimine\n");
    System.out.println("\t" + arv1);
    System.out.println("+\t" + arv2);
    
    
    System.out.println("\t" + liidetud);


    /*System.out.println("Mitu arvu soovid liita?");
    Scanner kusija = new Scanner(System.in);
    int arvudekogus = kusija.nextInt();*/
    /*int arvudekogus = 2;
    ArrayList<Integer> arvud2 = new ArrayList();

    for(int i = 0; i <= arvudekogus; i++){
        System.out.println("Mitmes arv massiivist?");
        Scanner kusija2 = new Scanner(System.in);
        int mitmes = kusija2.nextInt();
        int arv = arvud.get(mitmes);
        arvud2.add(arv);
    }*/


    




    

}
}
