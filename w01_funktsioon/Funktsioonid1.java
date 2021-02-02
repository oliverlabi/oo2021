public class Funktsioonid1{
	//Koostage funktsioon taksosõidu hinna kohta
	//Sisendiks kilomeetrite arv, väljundiks hind
	//sisseistumistasu 3 eurot, kilomeetri hind 80 senti
	public static double taksoHind(double km){
		return Math.round((km * 0.8 + 3) * 100) / 100.0;
	}
	public static String temperatuuriHinnang(int t){
		if(t>18){
			return "külm";
		} else {
			return "soe";
		}
	}
	public static double ringiPindala(double r){
		return Math.PI*r*r;
	}
	public static void main(String[] arg){
		System.out.println(ringiPindala(5));
		if(arg.length==1){
			System.out.println(temperatuuriHinnang(Integer.parseInt(arg[0])));
		}
		if(arg.length==2) {
			System.out.println(taksoHind(Double.parseDouble(arg[1])));
		}
	}	
}