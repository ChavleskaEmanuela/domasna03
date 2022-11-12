package zadaca02;

public class Main {
public static void main(String[] args) {
	Fakultet prvObjekt = new Fakultet();
	Fakultet vtorObjekt = new Fakultet();
	
	prvObjekt.nazivNaFakultet = "FIKT";
	prvObjekt.brojNaSmerovi = 2;
	prvObjekt.brojNaStudenti = 150;
	prvObjekt.dekan = "Pece Mitrevski";
	prvObjekt.sediste = "Bitola";
	
	prvObjekt.PrvMetod();
	System.out.println("Namalen broj na studenti " + prvObjekt.VtorMetod(30));
	prvObjekt.TretMetod();
	
	vtorObjekt.nazivNaFakultet = "TFB";
	vtorObjekt.brojNaSmerovi = 5;
	vtorObjekt.brojNaStudenti = 500;
	vtorObjekt.dekan = "Stojance Nusev";
	vtorObjekt.sediste = "Bitola";
	
	vtorObjekt.PrvMetod();
	System.out.println("Namalen broj na studenti " + vtorObjekt.VtorMetod(100));
	vtorObjekt.TretMetod();
}
}
