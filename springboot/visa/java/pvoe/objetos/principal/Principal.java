import java.pvoe.objetos.clases.Tarjeta;
import java.pvoe.objetos.clases.TarjetaCredito;
import java.pvoe.objetos.clases.TarjetaDebito;
import java.pvoe.objetos.interfaces.OperacionesTarjeta;
import java.pvoe.objetos.operaciones.LlenarDatos;
import java.pvoe.objetos.operaciones.OperacionesTarjetaImpl;

public class Principal {
	public static void main(String[] args) {
		manejoTarjetaDebito();
		manejarTarjetaCredito();
	}

	public static void manejoTarjetaDebito() {

		LlenarDatos llenar = new LlenarDatos();
		TarjetaDebito tarjeta = new TarjetaDebito();

		tarjeta = llenar.llenarDatosDebito();
		OperacionesTarjeta operaciones = new OperacionesTarjetaImpl();
		operaciones.imprimirDatos(tarjeta);

	}

	public static void manejarTarjetaCredito() {

		LlenarDatos llenar = new LlenarDatos();
		Tarjeta tarjeta = new TarjetaCredito();

		tarjeta = llenar.llenarDatosCredito();
		OperacionesTarjeta operaciones = new OperacionesTarjetaImpl();
		operaciones.imprimirDatos(tarjeta);
	}
}