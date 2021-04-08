public class PoorajaProov {
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        Luliti l1 = new Luliti();
        Luliti l2 = new Luliti();
        Luliti l3 = new Luliti();
        Luliti l4 = new Luliti();

        Jadauhendus j1 = new Jadauhendus();
        j1.lisa(l1); j1.lisa(l2);
        Jadauhendus j2 = new Jadauhendus();
        j2.lisa(l3); j2.lisa(l4);
        Roopuhendus r1 = new Roopuhendus();
        r1.lisa(j1); r1.lisa(j2);

        Pooraja p3 = new Pooraja(l3);
        Pooraja p4 = new Pooraja(l4);
        p3.seisund(false);
        p4.seisund(false);

        Sisend a=new Sisend();
        a.lisa(l1); a.lisa(p3);
        Sisend b=new Sisend();
        b.lisa(l2); b.lisa(p4);
        a.seisund(false); b.seisund(false);
        
        kuvaOlek(r1);
    }
}