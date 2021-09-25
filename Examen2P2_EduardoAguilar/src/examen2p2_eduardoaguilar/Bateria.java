package examen2p2_eduardoaguilar;


public class Bateria {
    private int autonomia;
    private String material;
    private int time;

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    
    public Bateria() {
    }

    @Override
    public String toString() {
        return "Bateria{" + "autonomia=" + autonomia + ", material=" + material + ", time=" + time + '}';
    }

    public Bateria(int autonomia, String material, int time) {
        this.autonomia = autonomia;
        this.material = material;
        this.time = time;
    }
    
    
       
    
            
}
