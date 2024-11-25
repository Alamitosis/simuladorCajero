package interfaceCuentas;

import java.util.ArrayList;
import java.util.List;

import cuentas.Cuentas;



public interface InterCuentas {
	List<Cuentas> listaClientes=new ArrayList<Cuentas>();

	public String alta(Cuentas cuenta);
	
	public double consultaSaldo(Cuentas cuenta);
	
	public void deposito(Cuentas cuenta,double montoDeposito);
	
	public void retiro(Cuentas cuenta, double montoRetiro);
	
}
