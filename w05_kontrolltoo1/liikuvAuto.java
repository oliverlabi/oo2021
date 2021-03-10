public class liikuvAuto{
    double asukoht, kiirus, liigutud;
    String autonimi;
    public liikuvAuto(String an, double x, double dx){
        this.asukoht = x;
        this.autonimi = an;
        this.kiirus = dx;
        this.liigutud = 0;
        
    }

    public void liigu(double aeg, String ajauhik){
        if(ajauhik.equals("s") || ajauhik.equals("S")){
            this.asukoht += (aeg * kiirus);
            this.liigutud += (aeg * kiirus);
        } else if(ajauhik.equals("m") || ajauhik.equals("M")){
            this.asukoht += ((aeg * kiirus) * 60);
            this.liigutud += ((aeg * kiirus) * 60);
        } else if(ajauhik.equals("t") || ajauhik.equals("T")){
            this.asukoht += ((aeg * kiirus) * 3600);
            this.liigutud += ((aeg * kiirus) * 3600);
        } else {
            throw new RuntimeException("Ajaühik peab olema märgitud s/m/t!");
        }
    }

    public String toString(){
        if(this.liigutud == 0){
            return autonimi + " | Kiirus: " +kiirus+ " m/s | Auto kaugus maantee algusest: "+asukoht+" meetrit | ";
        } else {
            return autonimi + " | Kiirus: " +kiirus+ " m/s | Auto kaugus maantee algusest: "+asukoht+" meetrit | Auto on liikunud algasukohast: "+liigutud+" meetrit | ";
        }
        
    }
}