import java.util.*;
public class Jadauhendus extends Hulgiuhendus{
    List<Boolean> jadaSeisund = new ArrayList<Boolean>();
    public boolean kasJuhib(){
        for(Voolujuht v: hoidla){
            jadaSeisund.add(v.kasJuhib());
        }

        for(boolean j: jadaSeisund){
            if(!j){
                return false;
            }  
        }
        return true; 
    }
}