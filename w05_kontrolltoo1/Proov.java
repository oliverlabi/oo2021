import java.util.ArrayList;
import java.io.*;
public class Proov{
    public static void main(String argumendid[]) throws IOException{
        BufferedReader sisse=new BufferedReader(
            new FileReader("autoandmed.txt")
        );
        String rida = sisse.readLine();
        int autodearv = 0;
        while(rida != null) {
            autodearv += 1;
            rida = sisse.readLine();
        }
        sisse.close();
        String[] autonimed = new String[autodearv];
        double[] algasukohad = new double[autodearv];
        double[] kiirused = new double[autodearv];
        int[] ajad = new int[autodearv];
        String[] ajauhikud = new String[autodearv]; 
        int mitmes = 0;
        BufferedReader sisse2=new BufferedReader(
            new FileReader("autoandmed.txt")
        );
        rida = sisse2.readLine();
        while(rida != null){
            String[] andmed = rida.split(" ");
            autonimed[mitmes] = andmed[0];
            algasukohad[mitmes] = Integer.parseInt(andmed[1]);
            kiirused[mitmes] = Integer.parseInt(andmed[2]);
            ajad[mitmes] = Integer.parseInt(andmed[3]);
            ajauhikud[mitmes] = andmed[4];
            mitmes += 1;
            rida = sisse2.readLine();   
        }
        sisse2.close();

        ArrayList<liikuvAuto> autod = new ArrayList<liikuvAuto>();
        for(int i = 0; i<autonimed.length; i++){
            liikuvAuto auto = new liikuvAuto(autonimed[i], algasukohad[i], kiirused[i]);
            autod.add(auto);
        }
        String valjund = "";
        for(int i=0;i<autonimed.length; i++){
            PrintWriter valja=new PrintWriter(new FileWriter("tulemused.txt"));
            autod.get(i).liigu(ajad[i], ajauhikud[i]);
            valjund += "\n" + autod.get(i).toString();
            valja.println(valjund);
            valja.close();
        }
    }
        
        /*
        liikuvAuto auto1 = new liikuvAuto("Mercedes", 0, 30);
        liikuvAuto auto2 = new liikuvAuto("BMW", 1500, 25);
        liikuvAuto auto3 = new liikuvAuto("Audi", 750, 35);

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());

        auto1.liigu(3, "s");
        auto2.liigu(5, "m");
        auto3.liigu(2, "t");

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());
        */
}