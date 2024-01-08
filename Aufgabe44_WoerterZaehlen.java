import java.util.Scanner;
public class Aufgabe44_WoerterZaehlen {
	public static void main(String [] args) {
		//Eingabe();
		Eingabe2();
	}
	public static void Eingabe2() {
		Scanner sc = new Scanner(System.in);
		String input = "";
        while (!input.equalsIgnoreCase("Ende")) {
            System.out.println("Bitte geben Sie einen String ein (oder 'Ende' zum Beenden): ");
            input = sc.nextLine();

            // Wenn nicht "Ende" eingegeben wurde, verarbeite den String
            if (!input.equalsIgnoreCase("Ende")) {
                int wordCount = countWords(input);
                System.out.println("Anzahl der Wörter: " + wordCount);
            }
        }

        // Schließen des Scanners am Ende
        sc.close();
        System.out.println("Programm wird beendet. Auf Wiedersehen!");
    }

    // Methode zum Zählen der Wörter in einem String
    private static int countWords(String input) {
        // Splitte den String an Leerzeichen und zähle die Teile
        String[] words = input.split("\\s+");
        return words.length;
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
//				 while(string.contains(" +") && loop == 1) {				 
//					 if(string.contains(" +")) {
//						 string.split(" ",2);
//					 } else {
//						 loop = 0;
//					 }
//				 }
				 
				 // shorter?
				 while(string.contains(" +") && loop == 1) {				 
						 string.split(" ",2);
					 }
				 loop = 0;
	
				 
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
