package utils;
import ga.Personne;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import ga.Personne;

public class Solde {

	
	public static void main(String[] args){

		ObjectInputStream lecteur;
		    
		  
		BufferedReader bufferReader = null;
		FileWriter fileWriter = null;
		ArrayList<Personne> opperationList = new ArrayList<Personne>();

		try {
			lecteur= new ObjectInputStream(new FileInputStream(new File("personnes")));
		

			try {
				while (true) {
					//sCurrentLine = (Personne) lecteur.readObject();
					opperationList.add((Personne)lecteur.readObject());
				}
					
			}catch (EOFException a){
				for (Personne opperation : opperationList) {
					System.out.println(opperation.toString());
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferReader != null) {
					bufferReader.close();
				}
				if (fileWriter != null) {
					fileWriter.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}

