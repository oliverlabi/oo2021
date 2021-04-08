public class RoopuhenduseProov {
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
        Roopuhendus r1 = new Roopuhendus();
        r1.lisa(l1);
        r1.lisa(l2);
        kuvaOlek(r1);
    }
}