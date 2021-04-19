import java.util.*;

public class Puhver<S, V> implements FunktsiooniLiides<S, V>{
    FunktsiooniLiides<S, V> arvutaja;
    Map<S, V> fhoidla=new HashMap<S, V>();
    Map<S, V> hoidla=new HashMap<S, V>();
    public Puhver(FunktsiooniLiides<S, V> fliides){
        arvutaja = fliides;
    }
    public V arvuta(S sisend){
        if(!hoidla.containsKey(sisend)){
            hoidla.put(sisend, arvutaja.arvuta(sisend));
        }
        return arvutaja.arvuta(sisend);
    }
    public String eemalda(S sisend){
        if(hoidla.containsKey(sisend)){
            hoidla.remove(sisend);
            return "'" + sisend + "' võti eemaldatud";
        }
        return "Viga võtme '"+sisend+"' eemaldamisel";
    }
    public String filtreeri(S sisend){
        if(hoidla.containsKey(sisend)){
            fhoidla.putAll(hoidla);
            hoidla.remove(sisend);
            return "'" + sisend + "' võti filtreeritud";
        }
        return "Viga võtme '"+sisend+"' filtreerimisel";
    }
    public String eemaldaFiltrid(){
        hoidla = fhoidla;
        return "Filtrid eemaldatud";
    }
}
