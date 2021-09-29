package ies.tetuan.asc.dao;

import java.io.IOException;
import java.util.List;

import es.iestetuan.asc.vo.Alumno;

public interface IPersona {

	public Alumno getAlumno(long nia) throws IOException;
	public List<Alumno> getAlumnos();
	
}
