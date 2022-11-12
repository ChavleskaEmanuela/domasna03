package zadaca04;

import java.util.Random;
import java.util.Scanner;

public class Brojach {

	public void toss() {
		Scanner console = new Scanner(System.in);
		Random rand = new Random(); 
	   	String[] pg = {"pismo" , "glava"};
	   	
	   	String coin;
	   	int pismo = 0, glava = 0,n;
	   	int broj = console.nextInt();
	   	for(n = 1; n <= broj; n++) {
	   	coin = pg[rand.nextInt(pg.length)];
	   	if ( coin == "pismo") 
	   		pismo++;
	   	else  
	   		glava++;
	   	}
	   	System.out.println("Frlanja: "+ broj + " pati.");
	   	System.out.println("Glava: " + glava);
	   	System.out.println("Pismo: " + pismo);
	   	toss();
	   	console.close();
	}
}
