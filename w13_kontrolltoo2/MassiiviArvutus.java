import java.util.*;

public class MassiiviArvutus{
    ArrayList<Double> yList = new ArrayList<Double>();
    ArrayList<Double> xList;
    Funktsioon operatsioon;
    double yArvutus;

    public MassiiviArvutus(ArrayList<Double> xList, Funktsioon operatsioon){
        this.operatsioon = operatsioon;
        this.xList = xList;
    }

    public void arvutaMassiiv(){
        for(int i=0; i<xList.size(); i++){
            operatsioon.muudaXLiige(xList.get(i));
            double yArvutus = operatsioon.arvuta();
            yList.add(yArvutus);
        }
    }

    public String toString(){
        return yList.toString();
    }
}