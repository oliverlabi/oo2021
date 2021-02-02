public class Funktsioonid2{
    public static int midiNumbriks(String tahtnimetus){
        if(tahtnimetus.equals("do")){return 60;}
        if(tahtnimetus.equals("do#")){return 61;}
        if(tahtnimetus.equals("re")){return 62;}
        if(tahtnimetus.equals("mib")){return 63;}
        if(tahtnimetus.equals("mi")){return 64;}
        if(tahtnimetus.equals("fa")){return 65;}
        if(tahtnimetus.equals("fa#")){return 66;}
        if(tahtnimetus.equals("sol")){return 67;}
        if(tahtnimetus.equals("sol#")){return 68;}
        if(tahtnimetus.equals("la")){return 69;}
        if(tahtnimetus.equals("sib")){return 70;}
        if(tahtnimetus.equals("si")){return 71;}
        return -1;
    }
    public static int[] midiNumbriteks(String[] tahtnimetused){
        int[] vastus=new int[tahtnimetused.length];
        for(int i=0; i<tahtnimetused.length; i++){
            vastus[i]=midiNumbriks(tahtnimetused[i]);
        }
        return vastus;
    }
    public static int suurim(int[] m){
        if(m==null){throw new RuntimeException("tühi viit");}
        if(m.length==0){throw new RuntimeException("elemendid puudu");}
        int meeles=m[0];
        for(int i=1; i<m.length; i++){
            if(m[i]>meeles){meeles=m[i];}
        }
        return meeles;
    }
    public static void main(String[] arg){
        int[] sendid={1, 2, 5};
        int[] eurod=new int[4];
        eurod[0]=1;
        eurod[1]=2;
        eurod[2]=5;
        eurod[3]=10;
        int[] ostud={};
        int[] ostudeTahvel=null;
        System.out.println(suurim(new int[]{3, 6, 5}));
        System.out.println(suurim(sendid));
        try{
          System.out.println(suurim(ostud));
          System.out.println(suurim(ostudeTahvel));
        } catch(RuntimeException ex){
            System.out.println("Tekkis probleem: "+ex.getMessage());
        }
        System.out.println(midiNumbriks("mi"));
        int[] mnumbrid=midiNumbriteks(new String[]{
            "mi", "mi", "re", "mi", "do", "do", "do"
        });
        for(int mnr: mnumbrid){
            System.out.println(mnr);
        }
    }
}