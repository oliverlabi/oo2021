public class StringiAstendaja implements FunktsiooniLiides<String, String>{
    Integer astendaja;
    public StringiAstendaja(Integer aste){
        astendaja = aste;
    }
    public String arvuta(String sisend){
        for(int i=0; i<astendaja; i++){
            sisend = sisend + sisend;
        }
        return sisend;
    }
}
