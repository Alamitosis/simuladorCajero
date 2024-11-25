package cuentas;

public class Cuentas {

	private int idCliente;
	private long numCuenta;
	private String nombreCliente;
	private double monto;
	
	public Cuentas() {
	}

	public Cuentas(int idCliente, long numCuenta, String nombreCliente, double monto) {
		this.idCliente = idCliente;
		this.numCuenta = numCuenta;
		this.nombreCliente = nombreCliente;
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Cuentas [idCliente=" + idCliente + ", numCuenta=" + numCuenta + ", nombreCliente=" + nombreCliente
				+ ", monto=" + monto + "]\n";
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public long getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(long numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	
}
