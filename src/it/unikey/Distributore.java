package it.unikey;

public abstract class Distributore {

    double deposito;
    double euroPerLitro;
    String tipoCarburante;




    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void setEuroPerLitro(double euroPerLitro) {
        this.euroPerLitro = euroPerLitro;
    }

    public Distributore(double deposito, double euroPerLitro, String tipoCarburante) {
        this.deposito = deposito;
        this.euroPerLitro = euroPerLitro;
        this.tipoCarburante = tipoCarburante;
    }

    public String getTipoCarburante() {
        return tipoCarburante;
    }

    public void setTipoCarburante(String tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }

    public  abstract void rifornisci (double carburante);


    public abstract double vendi (double pagato, Auto auto);

    public double getDeposito() {
        return deposito;
    }


    public double getEuroPerLitro() {
        return euroPerLitro;
    }

    public abstract void aggiorna(double euroPerLitro);

    public abstract void depositoAttuale();

    //public abstract void alimentaAuto(double carburante, Auto auto);

}

