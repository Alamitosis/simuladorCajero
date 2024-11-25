package implementCuentas;
import java.util.List;
import java.util.ArrayList;

import cuentas.Cuentas;
import interfaceCuentas.InterCuentas;


public class Implementacion implements InterCuentas{

	List<Cuentas> listaClientes= new ArrayList<Cuentas>();
	@Override
	public String alta(Cuentas cuenta) {
		// TODO Auto-generated method stub
		boolean bandera=false;
		for(Cuentas c:listaClientes) {
			if(c.getNumCuenta() == cuenta.getNumCuenta()) {
				bandera=true;
				return "Esta cuenta ya existe";
			}
		}
		if(bandera==false) {
			listaClientes.add(cuenta);
		}
		return "Cuenta añadida con exito";
	}

	@Override
	public double consultaSaldo(Cuentas cuenta) { //Verificar con profesor
		// TODO Auto-generated method stub
		double dinero=cuenta.getMonto();
		return dinero;
	}

	@Override
	public void deposito(Cuentas cuenta, double montoDeposito) {
		// TODO Auto-generated method stub
		if(montoDeposito > 10000) {
			System.out.println("Error, el monto maximo de deposito es de $10,000");
			return;
		}
		else if(montoDeposito < 0) {
			System.out.println("Error al realizar el deposito");
			return;
		}
		else {
			double deposito= cuenta.getMonto()+ montoDeposito;
			cuenta.setMonto(deposito);
			System.out.println("Deposito realizado exitosamente");
		}
	}

	@Override
	public void retiro(Cuentas cuenta, double montoRetiro) {
		// TODO Auto-generated method stub
		double retiro= cuenta.getMonto() - montoRetiro;
		if(retiro>0) {
			if(montoRetiro > 10000) {
				System.out.println("Error, el monto maximo de retiro es de $10,000");
				return;
			}
			else if(montoRetiro < 0) {
				System.out.println("Error al realizar el retiro");
				return;
			}
			else {
				cuenta.setMonto(retiro);
				System.out.println("retiro realizado exitosamente");
			}
	}else {
		System.out.println("No cuentas con el efectivo suficiente");
		return;
	}
	}
	
	public List<Cuentas> mostrar() {
		return listaClientes;
	}
	
	public Cuentas buscar(long numCuenta) {
		Cuentas cuentaencon=null;
		for(Cuentas c: listaClientes) {
			if(c.getNumCuenta() == numCuenta) {
				cuentaencon=c;
				break;
			}
		}
		return cuentaencon;
	}

	
}
