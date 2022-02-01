package it.unikey;

public abstract class Distributore {

    double deposito;
    double euroPerLitro;



    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void setEuroPerLitro(double euroPerLitro) {
        this.euroPerLitro = euroPerLitro;
    }

    public Distributore(double deposito, double euroPerLitro) {
        this.deposito = deposito;
        this.euroPerLitro = euroPerLitro;
    }



    public  abstract void rifornisci (double carburante);


    public abstract double vendi (double pagato, double euroPerLitro);

    public double getDeposito() {
        return deposito;
    }


    public double getEuroPerLitro() {
        return euroPerLitro;
    }

    public abstract void aggiorna(double euroPerLitro);

}

