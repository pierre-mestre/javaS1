package utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Solde {

	public static void main(String[] args) {

		BufferedReader bufferReader = null;
		FileWriter fileWriter = null;
		ArrayList<Double> opperationList = new ArrayList<Double>();
		double resultat = 0;
		try {
			String sCurrentLine;
			bufferReader = new BufferedReader(new FileReader("input.txt"));
			fileWriter = new FileWriter("output.txt");

			while ((sCurrentLine = bufferReader.readLine()) != null) {
				System.out.print("("+sCurrentLine+")");
				System.out.print(" + ");
				opperationList.add(Double.valueOf(sCurrentLine));
				
			}
			for (Double opperation : opperationList) {
				resultat += opperation;
			}
			fileWriter.write("la solde des chiffre du fichier d'entree est : "+resultat);
			System.out.println(resultat);

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

