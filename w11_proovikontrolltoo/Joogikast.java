import java.util.*;

public class Joogikast{
    String kastituup;
    double kastihind, kastimass;
    int pesadearv, mitu;
    Joogipudel pudel;
    public Joogikast(String kastituup, int pesadearv){
        this.kastituup = kastituup;
        this.pesadearv = pesadearv;
    }

    public void lisaKasti(Joogivaat vaat, Joogipudel pudel){
        this.pudel = pudel;
        ArrayList<Joogipudel> pudelid = vaat.vaatPudelitesse(pudel);
        if(pudelid.size() < this.pesadearv){
            this.pesadearv -= pudelid.size();
            this.mitu += pudelid.size();
        } else {
            this.mitu = this.pesadearv + pudelid.size();
            this.pesadearv = 0;
        }
    }

    public void lisaKasti(Joogipudel pudel, int mitu){
        if(this.pesadearv > mitu){
            this.pesadearv -= mitu;
            this.mitu += mitu;
            this.pudel = pudel;
        } else {
            this.pesadearv = 0;
            this.mitu = mitu;
        }
    }

    public double kastiHind(){
        this.kastihind = this.pudel.leiaOmahind() * this.pesadearv;
        return this.kastihind;
    }

    public double kastiMass(){
        this.kastimass = this.pudel.leiaMass() * this.pesadearv;
        return this.kastimass;
    }
}