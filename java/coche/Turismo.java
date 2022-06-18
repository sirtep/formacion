package coche;

public class Turismo extends Vehiculo {

    //Campos específicos de la subclase.

    private String IdTurismo;

    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase

    public Turismo (String matricula, String marca, String modelo, String fuel, String maxspeed) {

        super(matricula, marca, modelo, fuel, maxspeed); //Con la palabra reservada 'super' cogemos los parámetros de la superclase

        IdTurismo = "Unknown";   } //Cierre del constructor

    //Métodos específicos de la subclase

    public void setIdTurismo (String IdTurismo) { this.IdTurismo = IdTurismo;   }

    public String getIdTurismo () { return IdTurismo;   }

    public void mostrartodo() {

        // marca = "Audi"; Si tratáramos de acceder directamente a un campo privado de la superclase, salta un error

        // Sí que podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase

        System.out.println ("Vehículo con matrícula: " + getMatricula() + ". De la marca: " +  getMarca() +

        ". Combustible: " + getfuel() + ". Velocidad: " + getmaxspeed() + ". Con el identificador: " + getIdTurismo() ); }

} //Cierre de la clase