package zadaca02;

public class Fakultet {
public String nazivNaFakultet, dekan, sediste;
public int brojNaSmerovi, brojNaStudenti;

public void PrvMetod() {
	brojNaStudenti = brojNaStudenti + 50;
	System.out.println("Zgolemen br. na studenti " + brojNaStudenti);
}

public int VtorMetod(int namali) {
	int namalenaVrednost;
	namalenaVrednost = brojNaStudenti - namali;
	return namalenaVrednost;
}

public void TretMetod() {
	System.out.println(nazivNaFakultet + " - " + sediste);
}
}
