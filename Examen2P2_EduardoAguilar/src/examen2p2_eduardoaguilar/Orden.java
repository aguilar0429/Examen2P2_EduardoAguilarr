
package examen2p2_eduardoaguilar;

public class Orden {
    private Vehiculo car;
    private Ensamblador tecnico;

    public Vehiculo getCar() {
        return car;
    }

    public void setCar(Vehiculo car) {
        this.car = car;
    }

    public Ensamblador getTecnico() {
        return tecnico;
    }

    public void setTecnico(Ensamblador tecnico) {
        this.tecnico = tecnico;
    }

    public Orden(Vehiculo car, Ensamblador tecnico) {
        this.car = car;
        this.tecnico = tecnico;
    }
    
    
    
}
