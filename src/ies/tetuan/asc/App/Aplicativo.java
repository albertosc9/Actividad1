package ies.tetuan.asc.App;

import java.io.IOException;
import java.util.List;

import es.iestetuan.asc.fichtexto.PersonaDao;
import es.iestetuan.asc.vo.Alumno;
import ies.tetuan.asc.dao.IPersona;

public class Aplicativo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		IPersona a1 = new PersonaDao();
		List<Alumno> alumnos = a1.getAlumnos();
		
		System.out.println("Lista de alumnos");
		System.out.println("_______________________");
		for (Alumno al : alumnos) {
			System.out.println(al);
		}
		
			System.out.println("alumno con nia=171"+"\n"+a1.getAlumno(171).toString());
		
		
		
		
	}

}
