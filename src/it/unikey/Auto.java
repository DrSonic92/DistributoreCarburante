package it.unikey;

public class Auto {
    private double capacita = 0;
    private String tipoCarburante;

    public Auto() { }

    public Auto(double capacita, String tipoCarburante) {
        this.capacita = capacita;
        this.tipoCarburante = tipoCarburante;
    }

    public double getCapacita() {
        return capacita;
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
}
