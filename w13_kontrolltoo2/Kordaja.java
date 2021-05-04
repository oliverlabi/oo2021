import java.util.*;

public class Kordaja implements Funktsioon{
    double arv, x, arvutus;
    public Kordaja(double arv, double x){
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
        arvutus = this.arv * this.x;
        return arvutus;
    }

    public String toString(){
        return String.valueOf(arvutus);
    }
}