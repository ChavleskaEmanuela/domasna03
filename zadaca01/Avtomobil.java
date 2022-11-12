package zadaca01;

public class Avtomobil {
public String marka,model,boja,registracija;
public double pominatiKm;
public int godinaNaProizvodstvo;

public Avtomobil(String marka, String model, String boja, String registracija, double pominatiKm, int godinaNaProizvodstvo) {
	this.marka = marka;
	this.model = model;
	this.boja = boja;
	this.registracija = registracija;
	this.pominatiKm = pominatiKm;
	this.godinaNaProizvodstvo = godinaNaProizvodstvo;
}

public void PrvMetod() {
	System.out.println(marka + ", " + model + ", " + boja);
}

public double VtorMetod() {
	return pominatiKm + 1520.25;
}
}
