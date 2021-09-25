package examen2p2_eduardoaguilar;


public class Interior {
    private String mas;
    private String tipo;
    private int botones;
    private int time;
    public String getMas() {
        return mas;
    }

    public void setMas(String mas) {
        this.mas = mas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }

    public Interior(String mas, String tipo, int botones, int time) {
        this.mas = mas;
        this.tipo = tipo;
        this.botones = botones;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    

    public Interior() {
    }

    @Override
    public String toString() {
        return "Interior{" + "mas=" + mas + ", tipo=" + tipo + ", botones=" + botones + ", time=" + time + '}';
    }
    
    
    
}
