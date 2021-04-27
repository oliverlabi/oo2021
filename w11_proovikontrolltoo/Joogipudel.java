public class Joogipudel{
    double maht, taaramaksumus;
    String pudelituup;
    Jook jook;
    public Joogipudel(String pudelituup, double maht, double taaramaksumus, Jook jook){
        this.pudelituup = pudelituup;
        this.maht = maht;
        this.taaramaksumus = taaramaksumus;
        if(jook != null){
            this.jook = jook;
        } else {
            this.jook = new Jook(null, 0, 0);
        }
    }

    public double leiaMass(){
        double erikaal = this.jook.erikaal;
        double mass = erikaal * maht;

        return mass;
    }

    public double leiaOmahind(){
        double joogihind = maht / 1000 * this.jook.liitrihind;
        double omahind = joogihind + taaramaksumus;
        return omahind;
    }

}