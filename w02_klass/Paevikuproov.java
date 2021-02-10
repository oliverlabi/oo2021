public class Paevikuproov{
    public static void main(String[] arg){
        Paevik kevadsemester = new Paevik();
        int sisend = 4;
        kevadsemester.lisaKursus("Hulgateooria ja loogika elemendid", 4);
        kevadsemester.lisaKursus("Objektorienteeritud programmeerimine", 6);
        kevadsemester.lisaKursus("Sissejuhatus infosüsteemidesse", 4);
        kevadsemester.lisaKursus("Interaktsioonidisain", 4);
        System.out.println("\n");
        System.out.println(kevadsemester.kursusteNimekiri());
        System.out.println(kevadsemester.kursusteEAP());
        System.out.println("\n");
        System.out.println("Keskmine kursuse EAP arv: " + kevadsemester.keskmineEAP());
        System.out.println("EAPe kokku: " + kevadsemester.kokkuEAP());
        System.out.println("Soovitud EAP arvust on puudu veel '" + kevadsemester.EAPkalkulaator(180) + "' EAPi.");
        System.out.println("Võlgnevus " + sisend + " EAP eest on: " + kevadsemester.EAPvolgnevus(4) + " eurot.");
        System.out.println("\n");
    }
}