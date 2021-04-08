public class uhenduseProov {
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        Luliti l1 = new Luliti();
        l1.seisund(false);
        Luliti l2 = new Luliti();
        l2.seisund(true);
        Luliti l3 = new Luliti();
        l3.seisund(true);
        Roopuhendus r1 = new Roopuhendus();
        r1.lisa(l1);
        r1.lisa(l2);
        kuvaOlek(r1);
        Jadauhendus j1 = new Jadauhendus();
        j1.lisa(r1);
        j1.lisa(l1);
        kuvaOlek(j1);
    }
}