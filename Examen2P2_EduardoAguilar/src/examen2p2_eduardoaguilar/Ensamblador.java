package examen2p2_eduardoaguilar;


public class Ensamblador {
    private int ID;
    private String name;
    private String genero;
    private int edad;
    private int cantidad;

    public Ensamblador() {
    }

    public Ensamblador(int ID, String name, String genero, int edad) {
        this.ID = ID;
        this.name = name;
        this.genero = genero;
        this.edad = edad;
        this.cantidad = 0;
    }
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ensamblador: " +"\nID: " + ID + "\nName: " + name + "\nGenero: " + genero + "\nEdad: " + edad + "\nCantidad: " + cantidad;
    }
    
    
    
}
