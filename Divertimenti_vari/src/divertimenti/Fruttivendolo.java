package divertimenti;
import java.lang.String;



public class Fruttivendolo {
	public static void main(String[] args){
		int i = 11;
		while(!condizione(i))
			i=i+11;
		System.out.println(" "+i);
		
	}

	private static boolean condizione(int i) {
		return i%5==1 && i%7==1 && i%9==1;
	}
	
	
}
