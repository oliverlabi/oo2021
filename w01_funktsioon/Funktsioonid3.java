import java.util.Scanner;

public class Funktsioonid3{
    public static int kiviPaberKäärid(String valik){
        if(valik.equals("k")){
            return 0;
        }
        if(valik.equals("p")){
            return 1;
        }
        if(valik.equals("kd")){
            return 2;
        } else {
            return -1;
        }
    }

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nKivi, paber või käärid? [k/p/kd]");
        String valik = input.next();

        input.close();

        String valikukuva = "";

        if(valik.equals("k")){
            valikukuva = "Kivi";
        }
        if(valik.equals("p")){
            valikukuva = "Paber";
        }
        if(valik.equals("kd")){
            valikukuva = "Käärid";
        }

        System.out.println("\nSinu valik on: " + valikukuva);

        int min = 0;
        int max = 2;
        int arvutiNumber = (int)(Math.random() * (max - min + 1) + min);

        if(kiviPaberKäärid(valik) == -1){
            System.out.println("Valikut '" + valik + "' pole olemas.");
        }
        if(kiviPaberKäärid(valik) == 0){
            if(arvutiNumber == 0){
                System.out.println("Arvuti kasutas kivi. \nViik!\n");
            }
            if(arvutiNumber == 1){
                System.out.println("Arvuti kasutas paberit. \nKaotus!\n");
            }
            if(arvutiNumber == 2){
                System.out.println("Arvuti kasutas kääre. \nVõit!\n");
            }
        }
        if(kiviPaberKäärid(valik) == 1){
            if(arvutiNumber == 0){
                System.out.println("Arvuti kasutas kivi. \nVõit!\n");
            }
            if(arvutiNumber == 1){
                System.out.println("Arvuti kasutas paberit. \nViik!\n");
            }
            if(arvutiNumber == 2){
                System.out.println("Arvuti kasutas kääre. \nKaotus!\n");
            }
        }
        if(kiviPaberKäärid(valik) == 2){
            if(arvutiNumber == 0){
                System.out.println("Arvuti kasutas kivi. \nKaotus!\n");
            }
            if(arvutiNumber == 1){
                System.out.println("Arvuti kasutas paberit. \nVõit!\n");
            }
            if(arvutiNumber == 2){
                System.out.println("Arvuti kasutas kääre. \nViik!\n");
            }
        } 
    }
}