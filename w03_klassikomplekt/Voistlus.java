import java.util.Scanner;

public class Voistlus{
    rada esimeneSoit, teineSoit, kolmasSoit, neljasSoit;
    liikuvAuto esimeneAuto, teineAuto, kolmasAuto, neljasAuto;
    public Voistlus(){
        //rajaPikkuseSisestus.close();
        Scanner soitjateArvuSisestus = new Scanner(System.in);
        System.out.println("Mitu mängijat? [Max 4]");
        int soitjateArv = soitjateArvuSisestus.nextInt();
        //soitjateArvuSisestus.close();
        if(soitjateArv > 4 || soitjateArv < 0){
            throw new RuntimeException("Sisestatud mängijate arv ei saa olla alla 0 ning üle 4!");
        }
        Scanner rajaPikkuseSisestus = new Scanner(System.in);
        System.out.println("Sisesta raja pikkus");
        double rajaPikkus = rajaPikkuseSisestus.nextDouble();
        voistlejateLisamine(soitjateArv);
        autodeLisamine(soitjateArv);
        voiduSoit(soitjateArv, rajaPikkus);
    }

    double teePikkus, tippKiirus, kiirendus;
    String esimeneNimi, teineNimi, kolmasNimi, neljasNimi;
    public void voistlejateLisamine(int dx){
        int mitmes = 1;
        for (double i = 0; i < dx; i ++){
            System.out.println("Sisesta " + mitmes + ". sõitja nimi.");
            Scanner Soitja = new Scanner(System.in);
            if(mitmes == 1){
                esimeneNimi = Soitja.nextLine();
            } else if(mitmes == 2){
                teineNimi = Soitja.nextLine();
            } else if(mitmes == 3){
                kolmasNimi = Soitja.nextLine();
            } else if(mitmes == 4){
                neljasNimi = Soitja.nextLine();
            } else {
                throw new RuntimeException("Liiga palju sõitjaid! Max = 4.");
            }
            mitmes = mitmes + 1;
            //Soitja.close();
        }
    }
    double esimeneAk = 0;
    double teineAk = 0;
    double kolmasAk = 0;
    double neljasAk = 0;
    double esimeneAkd = 0;
    double teineAkd = 0;
    double kolmasAkd = 0;
    double neljasAkd = 0;
    public void autodeLisamine(int dx){
        int mitmes = 1;

        for (double i = 0; i < dx; i ++){
            Scanner soitjaAutoKiirus = new Scanner(System.in);
            System.out.println("Sisesta " + mitmes + ". sõitja auto tippkiirus.");
            if(mitmes == 1){
                esimeneAk = soitjaAutoKiirus.nextDouble();
            } else if(mitmes == 2){
                teineAk = soitjaAutoKiirus.nextDouble();
            } else if(mitmes == 3){
                kolmasAk = soitjaAutoKiirus.nextDouble();
            } else if(mitmes == 4){
                neljasAk = soitjaAutoKiirus.nextDouble();
            } else {
                throw new RuntimeException("Viga autode kiiruse lisamisel.");
            }
            //soitjaAutoKiirus.close();
            mitmes = mitmes + 1;
        }
        mitmes = 1;
        for (double i = 0; i < dx; i ++){
            Scanner soitjaAutoKiirendus = new Scanner(System.in);
            System.out.println("Sisesta " + mitmes + ". sõitja auto kiirendus.");
            if(mitmes == 1){
                esimeneAkd = soitjaAutoKiirendus.nextDouble();
            } else if(mitmes == 2){
                teineAkd = soitjaAutoKiirendus.nextDouble();
            } else if(mitmes == 3){
                kolmasAkd = soitjaAutoKiirendus.nextDouble();
            } else if(mitmes == 4){
                neljasAkd = soitjaAutoKiirendus.nextDouble();
            } else {
                throw new RuntimeException("Viga autode kiirenduse lisamisel.");
            }
            //soitjaAutoKiirendus.close();
            mitmes = mitmes + 1;
        }
        mitmes = 1;
        for (double i = 0; i < dx; i ++){
            if(mitmes == 1){
                esimeneAuto = new liikuvAuto(0, esimeneAk, esimeneAkd);
            } else if(mitmes == 2){
                teineAuto = new liikuvAuto(0, teineAk, teineAkd);
            } else if(mitmes == 3){
                kolmasAuto = new liikuvAuto(0, kolmasAk, kolmasAkd);
            } else if(mitmes == 4){
                neljasAuto = new liikuvAuto(0, neljasAk, neljasAkd);
            } else {
                throw new RuntimeException("Viga autode klassi kokkupaneku juures.");
            }
            mitmes = mitmes + 1;
        }
    }

    public void voiduSoit(int dx, double teePikkus){
        int mitmes = 1;
        for (double i = 0; i < dx; i ++){
            if(mitmes == 1){
                esimeneSoit = new rada(0, esimeneAk, esimeneAkd, teePikkus);
                System.out.println("\n" + esimeneNimi + esimeneAuto.toString() + "Teepikkus: " + teePikkus + " | Lõpetusaeg: " + esimeneSoit.loppAeg());
            } else if(mitmes == 2){
                teineSoit = new rada(0, teineAk, teineAkd, teePikkus);
                System.out.println("\n" + teineNimi + teineAuto.toString() + "Teepikkus: " + teePikkus + " | Lõpetusaeg: "  + teineSoit.loppAeg());
            } else if(mitmes == 3){
                kolmasSoit = new rada(0, kolmasAk, kolmasAkd, teePikkus);
                System.out.println("\n" + kolmasNimi + kolmasAuto.toString() + "Teepikkus: " + teePikkus + " | Lõpetusaeg: "  + kolmasSoit.loppAeg());
            } else if(mitmes == 4){
                neljasSoit = new rada(0, neljasAk, neljasAkd, teePikkus);
                System.out.println("\n" + neljasNimi + neljasAuto.toString() + "Teepikkus: " + teePikkus + " | Lõpetusaeg: "  + neljasSoit.loppAeg());
            } else {
                throw new RuntimeException("Tekkis viga autode võistlusel.");
            }
            mitmes = mitmes + 1;
        }
    }

}