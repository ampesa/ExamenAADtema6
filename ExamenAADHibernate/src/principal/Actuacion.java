package principal;

public class Actuacion {
	
	// a�adimos id para identificar las actuaciones con entidad propia (tabla)
	private int id;
	private String hora;
	private String escenario;	
	
	// A�adimos Grupo para representar la relaci�n uno a uno
	private Grupo grupo;
	
	// A�adimos constructores
	public Actuacion(){
		
	}
	
	public Actuacion(String hora, String escenario){
		this.hora = hora;
		this.escenario = escenario;
		
	}
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getEscenario() {
		return escenario;
	}
	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}	
	
	

}
