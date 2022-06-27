package java.pvoe.objetos.operaciones;

import java.pvoe.objetos.clases.Fecha;
import java.pvoe.objetos.clases.Tarjeta;
import java.pvoe.objetos.clases.TarjetaCredito;
import java.pvoe.objetos.clases.TarjetaDebito;

public class LlenarDatos {
	/* Creación y llenado de una Tarjeta */
	public Tarjeta llenarDatos() {
		Tarjeta tarjeta = new Tarjeta();
		Fecha fechaVencimiento = new Fecha();
		tarjeta.setNombreTarjeta("Nombre del titular Tarjeta");
		tarjeta.setNumeroCuenta("123456");
		tarjeta.setNumeroTarjeta("123 456 789");
		fechaVencimiento.setMes(11);
		fechaVencimiento.setAnnio(18);
		tarjeta.setFechaVencimiento(fechaVencimiento);

		return tarjeta;
	}

	/* Creación y llenado de una Tarjeta de Crédito */
	public TarjetaCredito llenarDatosCredito() {
		TarjetaCredito tarjeta = new TarjetaCredito();
		Fecha fechaVencimiento = new Fecha();
		tarjeta.setNombreTarjeta("Nombre del titular Credito");
		tarjeta.setNumeroCuenta("123456");
		tarjeta.setNumeroTarjeta("123 456 789");
		fechaVencimiento.setMes(11);
		fechaVencimiento.setAnnio(18);
		tarjeta.setFechaVencimiento(fechaVencimiento);

		tarjeta.setCreditoMaximo(5000);
		tarjeta.setDeuda(1500);

		return tarjeta;
	}

	/* Creación y llenado de una Tarjeta de Débito */
	public TarjetaDebito llenarDatosDebito() {

		TarjetaDebito tarjeta = new TarjetaDebito();
		Fecha fechaVencimiento = new Fecha();
		tarjeta.setNombreTarjeta("Nombre del titular Debito");
		tarjeta.setNumeroCuenta("123456");
		tarjeta.setNumeroTarjeta("123 456 789");
		fechaVencimiento.setMes(11);
		fechaVencimiento.setAnnio(18);
		tarjeta.setFechaVencimiento(fechaVencimiento);

		tarjeta.setSaldoActual(12000);

		return tarjeta;
	}
}
