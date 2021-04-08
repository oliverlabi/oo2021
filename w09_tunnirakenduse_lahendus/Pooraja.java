public class Pooraja implements Lulitatav{
    Lulitatav sisu;
    public Pooraja(Lulitatav l){
        sisu = l;
    }

    public void seisund(boolean sees){
        sisu.seisund(!sees);
    }
}