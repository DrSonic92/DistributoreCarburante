package it.unikey;

public abstract class Distributore {

    double deposito;
    double euroPerLitro;

    public Distributore(double euroPerLitro) {
        this.deposito = 0;
        this.euroPerLitro = euroPerLitro;
    }

    public  abstract void rifornisci (double carburante);


    public abstract void vendi (double carburante);

    public double getDeposito() {
        return deposito;
    }


    public double getEuroPerLitro() {
        return euroPerLitro;
    }

    public abstract void aggiorna(double euroPerLitro);

}
