
public class KalkulaatoriKaivitus implements KalkulaatoriLiides{
    String vaartus, malu, liidesemalu, viimaneSumbol;
    int arvudSumbolist = 0;
    int mitmes = 0;
    int eelminenr = 0;
    int jarjekord = 0;
    public void vajutus(String nupp){
        String sisestus = nupp;
        if(nupp.equals("C")){
            this.vaartus = "";
            this.malu = "";
            this.liidesemalu = "";
        } else{
            if(malu == null){
                this.malu = sisestus;
                this.vaartus = this.malu;

                //liitmine part 1
            } else if(sisestus.equals("+") && jarjekord == 0){
                jarjekord = 1;
                this.vaartus = this.malu.substring(0, mitmes);
                this.malu += sisestus;
                arvudSumbolist = mitmes + 1;
                mitmes += 1;
                liidesemalu = "";
            } else if(sisestus.equals("+") && jarjekord == 1){
                this.vaartus = this.malu.substring(arvudSumbolist, mitmes);
                this.malu += sisestus;
                liidesemalu = "";
                //------------

                //lahutamine part 1
            } else if(sisestus.equals("-") && jarjekord == 0){
                jarjekord = 1;
                this.vaartus = this.malu.substring(0, mitmes);
                this.malu += sisestus;
                arvudSumbolist = mitmes + 1;
                mitmes += 1;
                liidesemalu = "";
            } else if(sisestus.equals("-") && jarjekord == 1){
                this.vaartus = this.malu.substring(arvudSumbolist, mitmes);
                this.malu += sisestus;
                liidesemalu = "";
                //------------

                //korrutamine part 1
            } else if(sisestus.equals("*") && jarjekord == 0){
                jarjekord = 1;
                this.vaartus = this.malu.substring(0, mitmes);
                this.malu += sisestus;
                arvudSumbolist = mitmes + 1;
                mitmes += 1;
                liidesemalu = "";
            } else if(sisestus.equals("*") && jarjekord == 1){
                this.vaartus = this.malu.substring(arvudSumbolist, mitmes);
                this.malu += sisestus;
                liidesemalu = "";
                //------------
                //Võrdusmärk
            } else if(sisestus.equals("=")){
                jarjekord = 0;
                arvudSumbolist = 0;
                for(int i=0; i<this.malu.length(); i++){
                    String kasSumbol = Character.toString(this.malu.charAt(i));
                    //liitmine part 2
                    if(kasSumbol.equals("+") && jarjekord == 0){
                        eelminenr = Integer.parseInt(this.malu.substring(0, arvudSumbolist));
                        arvudSumbolist = 0;
                        jarjekord = 1;
                        this.vaartus = String.valueOf(eelminenr);
                        viimaneSumbol = "+";
                    } else if(kasSumbol.equals("+") && jarjekord > 0){
                        eelminenr = eelminenr + Integer.parseInt(this.malu.substring(i - arvudSumbolist, i));
                        this.vaartus = String.valueOf(eelminenr);
                        arvudSumbolist = 0;
                        viimaneSumbol = "+";
                    } else if(i+1 == this.malu.length() && viimaneSumbol.equals("+")){
                        eelminenr = eelminenr + Integer.parseInt(this.malu.substring(i - arvudSumbolist, i+1));
                        this.vaartus = String.valueOf(eelminenr);
                        viimaneSumbol = "+";
                    //------------
                    //lahutamine part 2
                    } else if(kasSumbol.equals("-") && jarjekord == 0){
                        eelminenr = Integer.parseInt(this.malu.substring(0, arvudSumbolist));
                        arvudSumbolist = 0;
                        jarjekord = 1;
                        this.vaartus = String.valueOf(eelminenr);
                        viimaneSumbol = "-";
                    } else if(kasSumbol.equals("-") && jarjekord > 0){
                        eelminenr = eelminenr - Integer.parseInt(this.malu.substring(i - arvudSumbolist, i));
                        this.vaartus = String.valueOf(eelminenr);
                        arvudSumbolist = 0;
                        viimaneSumbol = "-";
                    } else if(i+1 == this.malu.length() && viimaneSumbol.equals("-")){
                        eelminenr = eelminenr - Integer.parseInt(this.malu.substring(i - arvudSumbolist, i+1));
                        this.vaartus = String.valueOf(eelminenr);
                        viimaneSumbol = "-";
                    //------------
                    //korrutamine part 2
                    } else if(kasSumbol.equals("*") && jarjekord == 0){
                        eelminenr = Integer.parseInt(this.malu.substring(0, arvudSumbolist));
                        arvudSumbolist = 0;
                        jarjekord = 1;
                        this.vaartus = String.valueOf(eelminenr);
                        viimaneSumbol = "*";
                    } else if(kasSumbol.equals("*") && jarjekord > 0){
                        eelminenr = eelminenr * Integer.parseInt(this.malu.substring(i - arvudSumbolist, i));
                        this.vaartus = String.valueOf(eelminenr);
                        arvudSumbolist = 0;
                        viimaneSumbol = "*";
                    } else if(i+1 == this.malu.length() && viimaneSumbol.equals("*")){
                        eelminenr = eelminenr * Integer.parseInt(this.malu.substring(i - arvudSumbolist, i+1));
                        this.vaartus = String.valueOf(eelminenr);
                        viimaneSumbol = "*";
                    //------------
                    } else {
                        arvudSumbolist = arvudSumbolist + 1;
                    }
                }
            } else {
                liidesemalu += sisestus;
                this.malu += sisestus;
                this.vaartus = liidesemalu;
                mitmes += 1;
            }
            
        }
    }
    
	public String kuvatav(){
        return vaartus;
    }
}