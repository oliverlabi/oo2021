import java.util.*;
public class Sisend implements Lulitatav {
    List<Lulitatav> hoidla = new ArrayList<Lulitatav>();
    public void lisa(Lulitatav l){
        hoidla.add(l);
    }
    public void seisund(boolean sees){
        for(Lulitatav l: hoidla){
            l.seisund(sees);
        }
    }
}