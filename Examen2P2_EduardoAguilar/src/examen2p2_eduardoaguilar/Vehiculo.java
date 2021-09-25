package examen2p2_eduardoaguilar;


public class Vehiculo {
    private String VIN;
    private String color;
    private Bateria bateria;
    private Carroceria carroceria;
    private Interior interior;
    private String marca_audio;
    private int asientos;


    public Vehiculo() {
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public String getMarca_audio() {
        return marca_audio;
    }

    public void setMarca_audio(String marca_audio) {
        this.marca_audio = marca_audio;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public Vehiculo(String VIN, String color, Bateria bateria, Carroceria carroceria, Interior interior, String marca_audio, int asientos) {
        this.VIN = VIN;
        this.color = color;
        this.bateria = bateria;
        this.carroceria = carroceria;
        this.interior = interior;
        this.marca_audio = marca_audio;
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Vehiculo: " + "\nVIN: " + VIN + "\nColor: " + color + "\nBateria: " + bateria + "\nCarroceria: " + carroceria + "\nInterior:" + interior + "\nMarca_audio: " + marca_audio + "\nAsientos: " + asientos ;
    }

    
    
    
    
    
    
}
