package utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {

		BufferedReader bufferReader = null;
		FileWriter fileWriter = null;
		try {
			int sCurrentLine;
			bufferReader = new BufferedReader(new FileReader("input.txt"));
			fileWriter = new FileWriter("output.txt");

			while ((sCurrentLine = bufferReader.read()) != -1) {
				System.out.print((char)sCurrentLine);
				fileWriter.write(sCurrentLine);
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

