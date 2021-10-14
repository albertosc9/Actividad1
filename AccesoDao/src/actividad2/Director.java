package actividad2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



public class Director {

	String ruta = "C:\\Users\\alumnoA\\Downloads\\dam2-aadd-ficheros-master\\recursos\\info-config.properties";
			
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
	
		
		
		
		Director dr = new Director();
		
		dr.Crear("ruta1");
		dr.Crear("ruta2");
		dr.Crear("ruta3");
		dr.Crear("ruta4");
		dr.Crear("ruta5");
		dr.Crear("ruta6");
		dr.Crear("ruta7");
		dr.Crear("ruta8");
		
		dir("C:/Users/alumnoA/DAM2/AccesoDatos/Ficheros/00-TMP");
		borrar("C:/Users/alumnoA/DAM2/AccesoDatos/Ficheros/00-TMP");
	
	}
	
	
	private void Crear(String clave) throws IOException {
		Properties prop = new Properties();
		InputStream input = null;
			
			
			input = new FileInputStream(ruta);
			
			prop.load(input);
			
			Path path = Paths.get(prop.getProperty(clave));
			if (!Files.exists(path)){
				Files.createDirectories(path);
			}else {
				System.out.println("existe");
			}
			
			
		
	}
	private static void dir(String ruta) throws IOException {
		
		String [] arch;
		
		File f = new File(ruta);
		
		arch = f.list();
		
		
		for (String archi : arch) {
			
			FileWriter fw = new FileWriter(ruta+"//"+archi.concat("//info-temporal.txt"));
		}
		
		
		
	}

	private static void borrar(String ruta) {
		File f = new File(ruta);
		File [] fs = f.listFiles();
		
		for (File direct : fs) {
			direct.delete();
				
			}
		}

}
