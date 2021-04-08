public class Roopuhendus extends Hulgiuhendus{

    public boolean kasJuhib(){
        for(Voolujuht v: hoidla){
            if(v.kasJuhib()){
                return true;
            }
        }
        return false; 
    }
}