public class LulitiProov {
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        Luliti l1 = new Luliti();
        l1.seisund(true);
        kuvaOlek(l1);
    }
}