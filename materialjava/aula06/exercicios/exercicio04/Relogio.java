package exercicios.exercicio04;

public class Relogio {
    private int horas, minutos, segundos;

    public Relogio( int horas, int minutos, int segundos){
        if( horas < 24 && horas >= 0){
            this.horas = horas;
        }
        if( minutos <= 60 && minutos >= 0){
            this.minutos = minutos;
        }
        if( segundos <= 60 && segundos >= 0){
            this.segundos = segundos;
        }

    }

    void horaAtual(){
        System.out.println(horas + " : " + minutos + " : " + segundos);
    }

    int getHoras(){
        return horas;
    }

    int getMinutos(){
        return minutos;
    }

    int getSegundos(){
        return segundos;
    }

    public void setHoras(int horas){
        if( horas < 24 && horas >= 0){
            this.horas = horas;
        }
    }

    public void setMinutos(int minutos){
        if( minutos <= 60 && minutos >= 0){
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos){
        if( segundos <= 60 && segundos >= 0){
            this.segundos = segundos;
        }
    }
}
