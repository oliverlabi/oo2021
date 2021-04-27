import java.util.*;
import jdk.jshell.spi.ExecutionControl.RunException;

public class Joogivaat{
    double ruumala, kogus, ulekogus;
    Jook jook;
    Joogipudel uusPudel;
    public Joogivaat(double ruumala, double kogus, Jook jook){
        this.ruumala = ruumala;
        this.kogus = kogus;
        this.jook = null;
    }

    public void lisaJook(Joogipudel jook){
        double joogikogus = jook.leiaMass();
        if(joogikogus + this.kogus > this.ruumala && this.jook == null || this.jook == jook.jook){
            this.ulekogus += (this.kogus + joogikogus) - this.ruumala;
            this.kogus = this.ruumala;
            this.jook = jook.jook;
        } else if(joogikogus + this.kogus < this.ruumala && this.jook == null || this.jook == jook.jook) {
            this.kogus += joogikogus;
            jook.jook = null;
            this.jook = jook.jook;
        } else {

        }
    }

    public double kuvaKogus(){
        return this.kogus;
    }

    public double kuvaUleKogus(){
        return this.ulekogus;
    }

    public ArrayList<Joogipudel> vaatPudelitesse(Joogipudel pudel){
        ArrayList<Joogipudel> pudelid = new ArrayList<Joogipudel>();
        for(int i=0; this.kogus > pudel.maht; i++){
            this.kogus -= pudel.maht;
            this.uusPudel = new Joogipudel(pudel.pudelituup, pudel.maht, pudel.taaramaksumus, this.jook);
            pudelid.add(uusPudel);
        }
        return pudelid;
    }

}