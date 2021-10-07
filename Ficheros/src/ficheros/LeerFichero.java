package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main (String[]args) throws IOException {
		
	File archivo = null;
	
	
	
	
		archivo = new File("C://xampp//htdocs//aadd//recursos//infoinstitutodam2.json");
		
		LeerFichero fich = new LeerFichero();
		
		
		
		
	
		
		 System.out.println(fich.lectura(archivo));
	
		
		
		
		
			
		
	}
	
	

	private  String lectura(File archivo) throws IOException {
		String linea;
		String linea1="";
		FileReader fr = null;
		BufferedReader br = null;
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		while ((linea=br.readLine())!=null) {
			linea1+=linea;
	
	}
		br.close();
		return linea1;
	}
}


