package utils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Solde {

	
	public static void main(String[] args) {

		 DataInputStream lecteur;
		    
		  
		BufferedReader bufferReader = null;
		FileWriter fileWriter = null;
		ArrayList<Double> opperationList = new ArrayList<Double>();
		double resultat = 0;
		try {
			lecteur= new DataInputStream(new FileInputStream(new File("personnes")));
			String sCurrentLine;

			try {
				while (lecteur.available() > 0) {
					sCurrentLine = lecteur.readUTF();
					System.out.print("("+sCurrentLine+")");
					System.out.print(" + ");
					//opperationList.add(Double.valueOf());
				}
					
			}catch (EOFException a){
				for (Double opperation : opperationList) {
					resultat += opperation;
				}
				System.out.println(resultat);
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

