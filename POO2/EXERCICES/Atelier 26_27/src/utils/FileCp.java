package utils;
import java.io.*;

class FileCp {
	
	public static void main(String[] args) {

		if(args.length != 2) {
			System.err.println("il faut indiquer les fichiers source et destination!");
			System.exit(1);
		}
		
		try {
			
			BufferedInputStream ficin=new BufferedInputStream( new FileInputStream(args[0]));
				BufferedOutputStream ficout=new BufferedOutputStream(
					new FileOutputStream(args[1]));

				int val;
				int n=0;
				while((val=ficin.read()) != -1){
					ficout.write(val);
					n++;
				}
				ficin.close();
				ficout.close();
				System.out.println("copie effectuee�");   
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur !");
		}
		
	}
}
