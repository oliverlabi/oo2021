public class koduneUhendus {
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        Luliti a = new Luliti();
        Luliti b = new Luliti();
        Luliti c = new Luliti();
        Luliti d = new Luliti();
        Luliti e = new Luliti();
        Luliti n = new Luliti();
        Luliti m = new Luliti();
        Luliti f = new Luliti();

        a.seisund(false);
        b.seisund(true);
        c.seisund(false);
        d.seisund(false);
        e.seisund(true);
        n.seisund(true);
        m.seisund(false);
        f.seisund(true);

        Roopuhendus r1 = new Roopuhendus();
        r1.lisa(a);
        r1.lisa(b);
        Roopuhendus r2 = new Roopuhendus();
        r2.lisa(m);
        r2.lisa(n);
        Roopuhendus r3 = new Roopuhendus();
        r2.lisa(e);
        r2.lisa(c);
        Jadauhendus j1 = new Jadauhendus();
        j1.lisa(r2);
        j1.lisa(f);
        Jadauhendus j2 = new Jadauhendus();
        j2.lisa(r3);
        j2.lisa(d);
        Roopuhendus r4 = new Roopuhendus();
        r4.lisa(j1);
        r4.lisa(j2);
        Jadauhendus j3 = new Jadauhendus();
        j3.lisa(r1);
        j3.lisa(r4);

        kuvaOlek(j3);

        
    }
}