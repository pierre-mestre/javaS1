package gestion;

import javax.swing.Timer;

import utils.Metronome;

public class Appli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Metronome m=new Metronome("tic");
		Timer t=new Timer(1000,m); // ERREUR !
		t.start();
		System.out.println("timer demarre...");
		while(true);

	}

}
