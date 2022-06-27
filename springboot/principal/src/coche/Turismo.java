package coche;

public class Turismo extends Vehiculo {

    //Campos espec�ficos de la subclase.

    private String IdTurismo;

    //Constructor de la subclase: incluimos como par�metros al menos los del constructor de la superclase

    public Turismo (String matricula, String marca, String modelo, String fuel, String maxspeed) {

        super(matricula, marca, modelo, fuel, maxspeed); //Con la palabra reservada 'super' cogemos los par�metros de la superclase

        IdTurismo = "Unknown";   } //Cierre del constructor

    //M�todos espec�ficos de la subclase

    public void setIdTurismo (String IdTurismo) { this.IdTurismo = IdTurismo;   }

    public String getIdTurismo () { return IdTurismo;   }

    public void mostrartodo() {

        // marca = "Audi"; Si trat�ramos de acceder directamente a un campo privado de la superclase, salta un error

        // S� que podemos acceder a variables de instancia a trav�s de los m�todos de acceso p�blicos de la superclase

        System.out.println ("Veh�culo con matr�cula: " + getMatricula() + ". De la marca: " +  getMarca() +

        ". Combustible: " + getfuel() + ". Velocidad: " + getmaxspeed() + ". Con el identificador: " + getIdTurismo() ); }

} //Cierre de la clase