package it.unikey;

public class DistributoreDiesel extends Distributore{

    public DistributoreDiesel(double deposito, double euroPerLitro, String tipoCarburante) {

        super(deposito, euroPerLitro, tipoCarburante);

    }

    @Override
    public double getEuroPerLitro() {
        return super.getEuroPerLitro();
    }

    @Override
    public void rifornisci(double diesel) {
        deposito += diesel;
    }


    @Override
    public double vendi(double pagato,Auto auto) {
        double prezzo = getEuroPerLitro();
        double diesel = getDeposito();
        double dieselVenduto = pagato / prezzo;

        diesel -= dieselVenduto;
        setDeposito(diesel);//modifico deposito

        double serbatoio = auto.getCarburanteAttuale();
        serbatoio += dieselVenduto;
        auto.setCarburanteAttuale(serbatoio);//modifico serbatoio auto

        return  dieselVenduto;
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
