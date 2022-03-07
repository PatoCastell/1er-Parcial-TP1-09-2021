package tp1.parcial1.clases;

public class Alineacion extends Servicio implements CotizablePorManoObra {

	static final double EXTRABALANCEO = 500;
	private int horas;
	private boolean conBalanceo;

	public Alineacion(String descripcion, double porcentajeGanancia, String patente, int horas, boolean conBalanceo) {
		super(descripcion, porcentajeGanancia, patente);
		this.horas = horas;
		this.conBalanceo = conBalanceo;
	}

	@Override
	public double calcularCostoHoras() {
		return horas * CotizablePorManoObra.COSTOHORA;
	}

	@Override
	public double calcularPrecioCosto() {
		return conBalanceo == true ? calcularCostoHoras() + EXTRABALANCEO : calcularCostoHoras();
	}

}
