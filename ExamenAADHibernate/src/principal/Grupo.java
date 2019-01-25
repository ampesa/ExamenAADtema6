package principal;

public class Grupo {
	
	private String nombre;
	private String estilo;
	private int miembros;	
	
	// Para representar la relación uno a muchos entre Festival y Grupo también añadimos Festival
	//a la clase Pedido
	private Festival festival;
	
	// Añadimos Actuacion para representara la relación uno a uno
	private Actuacion actuacion;
	
	// Añadimos constructores
	public Grupo(){
		
	}
	
	public Grupo(String nombre, String estilo, int miembros){
		this.nombre = nombre;
		this.estilo = estilo;
		this.miembros = miembros;
		this.actuacion = new Actuacion();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getMiembros() {
		return miembros;
	}
	public void setMiembros(int miembros) {
		this.miembros = miembros;
	}
	public Festival getFestival() {
		return festival;
	}
	public void setFestival(Festival festival) {
		this.festival = festival;
	}

	public Actuacion getActuacion() {
		return actuacion;
	}

	public void setActuacion(Actuacion actuacion) {
		this.actuacion = actuacion;
	}

	

}
