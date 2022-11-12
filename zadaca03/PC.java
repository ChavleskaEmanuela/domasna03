package zadaca03;

public class PC {
public int memorija,hardDisk;
public String tipNaMemorija,golemina;

public PC() {
	this.memorija = 2;
	this.tipNaMemorija = "DDR2";
	this.hardDisk = 160;
}

public void PrvMetod(int zgolemiMemorija, int novHardDisk) {
	int zgolemenaMemorija = memorija + zgolemiMemorija;
	System.out.println("Memorijata bese " + memorija + " GB, sega iznesuva " + zgolemenaMemorija + " GB.");
	System.out.println("Tipot na memorija e: " + tipNaMemorija);
	System.out.println("HD ima golemina od " + novHardDisk + " GB. Prethodno iznesuvase " + hardDisk + " GB.");
}
}
