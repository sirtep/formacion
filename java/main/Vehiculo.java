package main;

public class Vehiculo {

    private String matricula;

    private String marca;

    private String modelo;

    //Constructor

    public Vehiculo (String matricula, String marca, String modelo) {

        this.matricula = matricula;

        this.marca = marca;

        this.modelo = modelo;                   }

    //M�todos

    public String getMatricula () { return matricula;  }

    public String getMarca () { return marca;  }

    public String getModelo () { return modelo;   }

}