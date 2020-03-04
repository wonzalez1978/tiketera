package usuario;

import java.time.LocalDate;

public class Persona {
	private String rut;
	private LocalDate fechaNacimiento;
	private String nombre;
	public Persona(String rut, LocalDate fechaNacimiento, String nombre) {
		super();
		this.rut = rut;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + "]";
	}

}
