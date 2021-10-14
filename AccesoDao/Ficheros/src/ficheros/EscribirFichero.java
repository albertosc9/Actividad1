package ficheros;

import java.io.*;
import java.nio.charset.Charset;

public class EscribirFichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File nuevo = new File("Nombre.txt");
	
	
		
			FileWriter fw = new FileWriter(nuevo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Nombre, Apellidos, Curso");
			bw.newLine();
			bw.write("alberto Sanchez Catela,Dam2");
			bw.newLine();
			
			
		
			EscribirFichero arch = new EscribirFichero();
			String palabra;
			arch.Completar("alberto Sanchez Catela,Dam2");
			FileReader Fr = new FileReader("alumnos-dam2-nuevos.txt",Charset.forName("UTF-8"));
			BufferedReader Br = new BufferedReader(Fr);
			
			
			while ((palabra=Br.readLine())!=null) {
				
				String []partes = palabra.split(",");
					
				if (!palabra.contains("NOMBRE"))
					if (partes.length==3){
						bw.append(partes[1]+" "+partes[2]+" Dam2"+"\n");
					}else {
						bw.append(partes[1]+" "+partes[2]+partes[3]+" Dam2"+"\n");
					}
					
				
				}
			
			
			
	Br.close();
	bw.close();
		

		
		
	
		
		
	}
	public void Completar (String nuevo) throws IOException {
		BufferedWriter escribir =null;
		
		escribir = new BufferedWriter(new FileWriter("Nombre.txt",true));
		escribir.newLine();
		escribir.append(nuevo);
		escribir.close();
		
	}
	
}
