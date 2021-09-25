package examen2p2_eduardoaguilar;


public class Asientos {
    private int time;
    private String material;
    private String tipo;
    private String si_no;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Asientos(int time, String material, String tipo, String si_no) {
        this.time = time;
        this.material = material;
        this.tipo = tipo;
        this.si_no = si_no;
    }
    
    
    
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String isTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSi_no() {
        return si_no;
    }

    public void setSi_no(String si_no) {
        this.si_no = si_no;
    }

    public Asientos(int time, String tipo, String si_no) {
        this.time = time;
        this.tipo = tipo;
        this.si_no = si_no;
    }

    public Asientos() {
    }

    @Override
    public String toString() {
        return "Asientos{" + "time=" + time + ", tipo=" + tipo + ", si_no=" + si_no + '}';
    }
    
    
    
}
