package it.unikey;

public class DistributoreBenzina extends Distributore{
    public DistributoreBenzina(double deposito, double euroPerLitro) {

        super(0, 1.89);

    }

    @Override
    public void rifornisci(double benzina) {
        deposito += benzina;
    }

    @Override
    public double vendi(double pagato, double euroPerLitro) {
        double benzina = getDeposito();

        double benzinaVenduta = pagato / euroPerLitro;
        benzina -= benzinaVenduta;
        return  benzinaVenduta;
    }

    @Override
    public void aggiorna(double euroPerLitro) {

    }
}
