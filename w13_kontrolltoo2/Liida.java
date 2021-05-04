public class Liida implements Funktsioon{
    double arv, x, arvutus;
    public Liida(double arv, double x){
        this.arv = arv;
        this.x = x;
    }

    public void muudaArvuLiige(double uusArv){
        this.arv = uusArv;
    }
    
    public void muudaXLiige(double uusX){
        this.x = uusX;
    }

    public double arvuta(){
        this.arvutus = this.arv + this.x;
        return arvutus;
    }

    public String toString(){
        return String.valueOf(arvutus);
    }
}