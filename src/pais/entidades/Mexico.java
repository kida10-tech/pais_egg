package pais.entidades;

public class Mexico {
    protected String capital;
    protected int poblacion;
    
    public Mexico(){}
    public Mexico(String capital, int poblacion){
        this.capital = capital;
        this.poblacion = poblacion;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Mexico{" + "capital=" + "Falto la herencia pero vale la intencion XD" + '}';
    }
}
