package principal;

import java.util.ArrayList;
import java.util.List;


public class Festival {
	
	private String nombre;
	private String lugar;
	private String fecha;	
	// a�adimos el List para asociar los Grupos
	private List<Grupo> grupos = new ArrayList<Grupo>();
	
	// A�adimos constructores
	public Festival(){
		
	}
	
	public Festival(String nombre, String lugar, String fecha){
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fecha;
		//this.grupos = new ArrayList<Grupo>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	// Utilizaremos este m�todo para referenciar la relaci�n bidireccional, reforzando dicha relaci�n
	public void addGrupo (Grupo grupo){
		grupo.setFestival(this);
		this.grupos.add(grupo);
	}

	

}
