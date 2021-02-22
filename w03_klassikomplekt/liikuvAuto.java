public class liikuvAuto{
    double asukoht, tippKiirus, kiirendus;
    public liikuvAuto(double x, double dx, double ddx){
        this.asukoht = x;
        this.tippKiirus = dx;
        this.kiirendus = ddx;
    }
    public void kiirenda(){
        int aeg = 0;
        for (double i = 0; i < tippKiirus; i = i + kiirendus){
            aeg = aeg + 1;
            if(kiirendus >= tippKiirus - i){
                System.out.println("Maksimaalne kiirus " + tippKiirus + " saavutatud " + aeg + " sekundiga.");
            }
        }
    }

    public String toString(){
        return " | Kiirus: "+tippKiirus+" | Kiirendus: "+kiirendus+" | ";
    }
}