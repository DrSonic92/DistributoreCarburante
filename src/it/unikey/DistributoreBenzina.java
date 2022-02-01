package it.unikey;



public class DistributoreBenzina extends Distributore{
    public DistributoreBenzina(double deposito, double euroPerLitro,String tipoCarburante) {

        super(deposito,euroPerLitro,tipoCarburante);

    }

    @Override
    public double getEuroPerLitro() {
        return super.getEuroPerLitro();
    }

    @Override
    public void rifornisci(double benzina) {
        deposito += benzina;
    }


    @Override
    public double vendi(double pagato,Auto auto) {
        double prezzo = getEuroPerLitro();
        double benzina = getDeposito();
        double benzinaVenduta = pagato / prezzo;

        benzina -= benzinaVenduta;
        setDeposito(benzina);//modifico deposito

        double serbatoio = auto.getCarburanteAttuale();
        serbatoio += benzinaVenduta;
        auto.setCarburanteAttuale(serbatoio);//modifico serbatoio auto

        return  benzinaVenduta;
    }


    @Override
    public void  aggiorna(double euroPerLitro) {
        this.setEuroPerLitro(euroPerLitro);

    }

    @Override
    public void depositoAttuale() {
        System.out.printf(" Nel deposito ci sono %6.2f litri\n", getDeposito());
    }


}
