public class Luliti implements Lulitatav, Voolujuht{
    boolean uhendatud;
    public boolean kasJuhib(){
        return uhendatud;
    }
    public void seisund(boolean sees){
        uhendatud = sees;
    }
    
}