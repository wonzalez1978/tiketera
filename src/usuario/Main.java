package usuario;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		
		Evento evento = new Evento("Lollapalooza", 17);
		  Vendedor vendedor = new Vendedor("17399074K", LocalDate.of(1990, Month.MAY, 10), "Daniel Corval�n");
		  Cliente cliente = new Cliente("19292125K", LocalDate.of(1996, Month.MARCH, 15), "Mat�as Pinto");
		  System.out.println(evento.getListaEntradas());
		  vendedor.vender(cliente, evento);
		  System.out.println(evento.getListaEntradas());
		  System.out.println(cliente.edad());
		  System.out.println(vendedor.getEntradasVendidas());
		  evento.setEnCurso(true);
		  //evento.addEntradaUsada(cliente.getEntradasCompradas().get(0));
		  evento.entrarEvento(cliente);
		  System.out.println(vendedor.totalEntradasVendidas());

	}

}
