package usuario;

import java.util.ArrayList;

public class Evento {

	private String nombre;
	 private int edadMinima;
	 private ArrayList<Entrada> listaEntradas = new ArrayList<Entrada>();;
	 private ArrayList<EntradaVIP> listaEntradasVIP = new ArrayList<EntradaVIP>();
	 private ArrayList<Entrada> listaEntradasUsadas = new ArrayList<Entrada>();
	 private ArrayList<EntradaVIP> listaEntradasVIPUsadas = new ArrayList<EntradaVIP>();
	 private boolean enCurso;
	public Evento(String nombre, int edadMinima) {
		super();
		this.nombre = nombre;
		this.edadMinima = edadMinima;
		this.listaEntradas = listaEntradas;
		this.listaEntradasVIP = listaEntradasVIP;
		this.listaEntradasUsadas = listaEntradasUsadas;
		this.listaEntradasVIPUsadas = listaEntradasVIPUsadas;
		this.enCurso = enCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	public ArrayList<Entrada> getListaEntradas() {
		return listaEntradas;
	}
	public void setListaEntradas(ArrayList<Entrada> listaEntradas) {
		this.listaEntradas = listaEntradas;
	}
	public ArrayList<EntradaVIP> getListaEntradasVIP() {
		return listaEntradasVIP;
	}
	public void setListaEntradasVIP(ArrayList<EntradaVIP> listaEntradasVIP) {
		this.listaEntradasVIP = listaEntradasVIP;
	}
	public ArrayList<Entrada> getListaEntradasUsadas() {
		return listaEntradasUsadas;
	}
	public void setListaEntradasUsadas(ArrayList<Entrada> listaEntradasUsadas) {
		this.listaEntradasUsadas = listaEntradasUsadas;
	}
	public ArrayList<EntradaVIP> getListaEntradasVIPUsadas() {
		return listaEntradasVIPUsadas;
	}
	public void setListaEntradasVIPUsadas(ArrayList<EntradaVIP> listaEntradasVIPUsadas) {
		this.listaEntradasVIPUsadas = listaEntradasVIPUsadas;
	}
	public boolean isEnCurso() {
		return enCurso;
	}
	public void setEnCurso(boolean enCurso) {
		this.enCurso = enCurso;
	}
	@Override
	public String toString() {
		return "Evento [nombre=" + nombre + ", edadMinima=" + edadMinima + ", listaEntradas=" + listaEntradas
				+ ", listaEntradasVIP=" + listaEntradasVIP + ", listaEntradasUsadas=" + listaEntradasUsadas
				+ ", listaEntradasVIPUsadas=" + listaEntradasVIPUsadas + ", enCurso=" + enCurso + "]";
	}
	
	 public boolean entrarEvento(Cliente cliente) {
		  for(Entrada entrada: cliente.getEntradasCompradas()) {
		   if(this.listaEntradas.contains(entrada) && !this.listaEntradasUsadas.contains(entrada) && this.enCurso) {
		    this.addEntradaUsada(entrada);
		    System.out.printf("Usando entrada con cliente %s (%s) para evento %s%nEntrada encontrada, %s puede pasar%n", cliente.getNombre(), cliente.getRut(), this.nombre, cliente.getNombre());
		    return true;
		   } else if(this.listaEntradas.contains(entrada) && !this.listaEntradasUsadas.contains(entrada) && !this.enCurso) {
		    System.out.printf("Usando entrada con cliente %s (%s) para evento %s%nNo se puede usar la entrada porque el evento %s no est� en curso.%n", cliente.getNombre(), cliente.getRut(), this.nombre, this.nombre);
		    return false;
		   } else if (this.listaEntradas.contains(entrada) && this.listaEntradasUsadas.contains(entrada) && this.enCurso) {
		    System.out.printf("Usando entrada con cliente %s (%s) para evento %s%nEntrada para rut %s ya fue usada, no puede pasar.%n", cliente.getNombre(), cliente.getRut(), this.nombre, cliente.getRut());
		    return false;
		   }
		  }
		  System.out.println("El cliente no tiene entrada para el evento");
		  return false;
		 }
	private void addEntradaUsada(Entrada entrada) {
		// TODO Auto-generated method stub
		
	}

		 

}
