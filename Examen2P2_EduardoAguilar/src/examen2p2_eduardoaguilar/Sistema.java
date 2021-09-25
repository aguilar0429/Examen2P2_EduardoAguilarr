package examen2p2_eduardoaguilar;


public class Sistema {
    private int time;
    private int pantallas;
    private String visor;
    private int ancho;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPantallas() {
        return pantallas;
    }

    public void setPantallas(int pantallas) {
        this.pantallas = pantallas;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Sistema() {
    }

    public Sistema(int time, int pantallas, String visor, int ancho) {
        this.time = time;
        this.pantallas = pantallas;
        this.visor = visor;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Sistema{" + "time=" + time + ", pantallas=" + pantallas + ", visor=" + visor + ", ancho=" + ancho + '}';
    }
    
    
    
}
