import java.util.*;
public abstract class Hulgiuhendus implements Voolujuht{
    List<Voolujuht> hoidla = new ArrayList<Voolujuht>();

    public void lisa(Voolujuht v){
        hoidla.add(v);
    }

    
}
