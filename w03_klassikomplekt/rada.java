public class rada{
    int kordus = 0;
    double aeg = 0;
    public rada(double x, double dx, double ddx, double teePikkus){
        double asukoht = x;
        double tippKiirus = dx;
        double kiirendus = ddx;
        double keskmineKiirus = 0;
        double kiirusedKokku = 0;
        double hetkkiirus = 0;

        for(asukoht = 0; asukoht < teePikkus; asukoht += hetkkiirus){
            if(hetkkiirus < tippKiirus){
                hetkkiirus = hetkkiirus + kiirendus;
            } else if(hetkkiirus >= tippKiirus){
                hetkkiirus = tippKiirus;
            }
            kordus = kordus + 1;
            kiirusedKokku = kiirusedKokku + hetkkiirus;
        }
        keskmineKiirus = kiirusedKokku / kordus;
        aeg = Math.round((teePikkus / keskmineKiirus) * 100.0) / 100.0;
    }
    public double loppAeg(){
        return aeg;
    }
        
}