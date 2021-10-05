package exercicios.exercicio01;

public class Placar {
    private String time1, time2;
    private int golsTimeCasa, golTimeFora;
    

    public Placar(String time1, String time2){
        this(time1, time2, 0, 0);
    
    }
    public Placar(String time1, String time2, int gol1, int gol2){
        this.time1 = time1;
        this.time2 = time2;
        this.golsTimeCasa = gol1;
        this.golTimeFora = gol2;
    }
    public Placar(){ 
        this("Time da Casa", "Visitante", 0, 0);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return time1 + " " + golsTimeCasa + " X " + golTimeFora + " " + time2;
    }

    
}
