package examen2p2_eduardoaguilar;


public class Carroceria {
    private int time;
    private String tip;
    private int maletero;

    public String getTip() {
        return tip;
    }

    public int getMaletero() {
        return maletero;
    }

    public Carroceria(int time, String tip, int maletero) {
        this.time = time;
        this.tip = tip;
        this.maletero = maletero;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    
    
}
