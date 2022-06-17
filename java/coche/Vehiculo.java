package coche;

public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String fuel;
    private String maxspeed;

    //Constructor
    public Vehiculo (String matricula, String marca, String modelo, String fuel, String maxspeed) {

        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;                   
        this.modelo = fuel;
        this.modelo = maxspeed;
    }
        
    //Métodos
    public String getMatricula () { return matricula;  }
    public String getMarca () { return marca;  }
    public String getModelo () { return modelo;   }
    public String getfuel () { return fuel;   }
    public String getmaxspeed () { return maxspeed;   }

}