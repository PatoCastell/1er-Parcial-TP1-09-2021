package tp1.parcial1.clases;

import java.util.ArrayList;

public class TallerMecanico {

	/* todo completar */
	private ArrayList<Servicio> serviciosEfectuados;
	private String nombre;
	private int contadorAceite;
	private int contadorEncendido;
	private int contadorAlineacion;

	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion\n";

	public TallerMecanico(String nombre) {
		this.nombre = nombre;
		this.serviciosEfectuados = new ArrayList<>();
		contadorAceite = 0;
		contadorAlineacion = 0;
		contadorEncendido = 0;
	}

	public boolean agregarServicio(Servicio nuevoServicio) {
		boolean pudo = false;
		if(nuevoServicio !=null) {
			pudo=serviciosEfectuados.add(nuevoServicio);
			this.contarServicios(nuevoServicio);
		}
		return pudo;
	}

	public void listarServicios() {
		System.out.println(this.nombre);
		System.out.printf(FORMATO_CANTIDADES, contadorAceite, contadorEncendido, contadorAlineacion);
		System.out.println("El importe total de ventas es de $"+ sumarVentas() );
	}
	
	public double sumarVentas() {
		double total=0;
		for (Servicio servicio : serviciosEfectuados) {
			
			total+=servicio.calcularPrecioVenta();
		}
		return total;
	}

	

	public void contarServicios(Servicio s) {
		if (s instanceof Alineacion) {
			contadorAlineacion++;
		} else if (s instanceof CambioAceite) {
			contadorAceite++;
		} else {
			contadorEncendido++;
		}
		
		
		
	}
}
