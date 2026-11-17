package modelos;


public class Veiculo {
    private int km;
    private int litros;
    public Veiculo(){
        this(0,0);
    }
    public Veiculo(int km, int litros){
        setKm(km);
        setLitros(litros);
    }
    public int getKm(){
       return km; 
    }
    public void setKm(int km){
        this.km = km;
    }
    public int getLitros(){
       return litros; 
    }
    public void setLitros(int litros){
        this.litros = litros;
    }
    public double getConsumo(){
        return getKm()/(double) getLitros();
    }
}
