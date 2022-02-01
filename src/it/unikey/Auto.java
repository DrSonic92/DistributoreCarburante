package it.unikey;

public class Auto {
    private double capacita;
    private double carburanteAttuale;
    private String tipoCarburante;

    public Auto() { }

    public Auto(double capacita, double carburanteAttuale,String tipoCarburante) {
        this.capacita = capacita;
        this.carburanteAttuale = carburanteAttuale;
        this.tipoCarburante = tipoCarburante;
    }

    public double getCapacita() {
        return capacita;
    }

    public double getCarburanteAttuale() {
        return carburanteAttuale;
    }

    public void setCarburanteAttuale(double carburanteAttuale) {
        this.carburanteAttuale = carburanteAttuale;
    }

    public void setCapacita(double capacita) {
        this.capacita = capacita;
    }

    public String getTipoCarburante() {
        return tipoCarburante;
    }

    public void setTipoCarburante(String tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }

    public void Serbatoio(){
        System.out.printf("%4.2f",getCarburanteAttuale()," litri");
    }
}
