public class rada{
    int aeg = 0;
    public rada(double x, double dx, double ddx, double teePikkus){
        double asukoht = x;
        double tippKiirus = dx;
        double kiirendus = ddx;
        double hetkkiirus = 0;

        for(asukoht = 0; asukoht < teePikkus; asukoht += hetkkiirus){
            if(hetkkiirus < tippKiirus){
                hetkkiirus = hetkkiirus + kiirendus;
            } else if(hetkkiirus >= tippKiirus){
                hetkkiirus = tippKiirus;
            }
            aeg = aeg + 1;
        }
    }
    public int loppAeg(){
        return aeg;
    }
        
}