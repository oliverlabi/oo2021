import java.util.ArrayList;

interface ValikuLiides{
    void lisaValikud(ArrayList<String> valikud);
    void lisaUlesanded(ArrayList<String> ulesanded);
    void alusta();
    String naitaUlesanne(String nimi);
    String naitaUlesanded();
}