import java.util.Scanner;
public class Aufgabe44_WoerterZaehlen {
	public static void main(String [] args) {
		Eingabe();
	}
	public static void Eingabe() {
		Scanner sc  = new Scanner(System.in);
		String[] stringArray = new String[3];
		
		final String END = "Ende";
		
		String string;
		int number = 0;
		int loop;
		
		
		for(int i = 0; i < stringArray.length; i++) {
			loop = 1;
			
			 string = sc.next();
			 if(!string.equals(END)) {
				 while(string.contains(" +") && loop == 1) {				 
					 if(string.contains(" +")) {
						 string.split(" ",2);
					 } else {
						 loop = 0;
					 }
				 }
				 
				 stringArray[i] = string;
				 number = i +1;
			 } else {
				 System.out.println("Sie haben das Programm abgebrochen");
				 
			 }
			 
		}
		Ausgabe(number);
		
		sc.close();
	}
	public static void Ausgabe(int number) {
		System.out.println(number);
	}
	
}
