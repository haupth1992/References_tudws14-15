//@author Thomas Hauptvogel

public class Reference {

	public static void main(String[] args) {
	
		// Variablen - Wertzuweisungen
		int var1 = 4;
		int var2 = var1;
		var1 = 8; 
		System.out.println(var2);
		
		//Objektreferenzen
		Number ref1 = new Number(4);  //ref1 ist eine Instanz von Number
		Number ref2 = ref1;           //ref2 ist nur eine Referenz auf ref1
		ref1.number = 8;
		System.out.println(ref2.number);

	}
}
