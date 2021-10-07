package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EE {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File nuevo = new File("C:\\Users\\alumnoA\\eclipse-workspace\\Ficheros\\Recursos\\Nombre1.txt");
		
		
		
		FileWriter fw = new FileWriter(nuevo);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Nombre, Apellidos, Curso");
		bw.newLine();
		bw.close();
	}

}
