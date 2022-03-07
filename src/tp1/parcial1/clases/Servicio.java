package tp1.parcial1.clases;

public abstract class Servicio implements Detallable {
	
	
	private String descripcion;

    private double porcentajeGanancia;

    private String patente;


	public Servicio(String descripcion, double porcentajeGanancia, String patente) {
		this.descripcion = descripcion;
		this.patente = patente;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public abstract double calcularPrecioCosto();
	
	public double calcularPrecioVenta() {
		double costo = this.calcularPrecioCosto();
		return costo+(this.porcentajeGanancia*costo/100);
	}
	
	public void detallar() {
		System.out.println("Servicio de "+ getClass().getSimpleName());
		System.out.println("Patente " + this.patente + " Precio: "+this.calcularPrecioVenta());
	}

	public String getDescripcion() {
		return this.descripcion;
	}
	

	

	
}
