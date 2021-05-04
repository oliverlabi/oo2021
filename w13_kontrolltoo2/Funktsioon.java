import java.util.ArrayList;

public interface Funktsioon{
    public double arvuta();
    public String toString();
    public void muudaXLiige(double x);
    public void muudaArvuLiige(double uusArv);
}

    /*String valeminimi, valem;
    double x;
    public Funktsioon(String valeminimi, String valem, double x){
        this.valeminimi = valeminimi;
        this.valem = valem;
        this.x = x;
    }

    public String arvuta(){
        String arvutusValem = this.valem;
        for(int i=0; i<arvutusValem.length(); i++){
            String C = Character.toString(arvutusValem.charAt(i));
            if(C.equals("x")){
                arvutusValem = arvutusValem.substring(0, i) + this.x + arvutusValem.substring(i+1);
            }
        }

        int j = 0;
        for(int i=0; i<arvutusValem.length(); i++){
            double esimeneNr, teineNr;
            String C = Character.toString(arvutusValem.charAt(i));
            int operaator = 0;

            if(operaator == 1){
                double teineNr = Double.parseDouble(arvutusValem.substring(j, i-1));
                operaator = 1;
            }

            if(C.equals("*")){
                esimeneNr = Double.parseDouble(arvutusValem.substring(j, i-1));
                operaator = 1;
            }
            
        }

        return arvutusValem;

        
        /*for(int i=0; i<arvutusValem.length(); i++){
            String C = Character.toString(arvutusValem.charAt(i));
            if(i == 0){
                double salvestaja = Double.parseDouble(C);
            }
            
            
            if(C.equals("*")){

            }
        }
    }
    }*/