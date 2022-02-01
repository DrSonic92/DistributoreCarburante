package it.unikey;

public class Main {

    public static void main(String[] args) {

        Auto bmw = new Auto(65, 30,"benzina");
        Auto audi = new Auto(70,20,"benzina");
        Auto alfa = new Auto(60,10,"diesel");

        Distributore esso = new DistributoreBenzina(0,1.69,"benzina");
        Distributore agip = new DistributoreBenzina(0,1.75,"diesel");


        esso.rifornisci(1000.0);
        agip.rifornisci(1000.0);

        //System.out.println("Nel deposito ci sono " + esso.deposito +" litri di benzina.");
        esso.depositoAttuale();
        agip.depositoAttuale();

        double benzinaVenduta = esso.vendi(20, bmw);
        double dieselVenduto = agip.vendi(50, alfa);
        System.out.printf("Hai comprato  %4.2f litri di benzina\n",benzinaVenduta);

        //System.out.printf("%4.2f litri\n",bmw.getCarburanteAttuale());
        bmw.Serbatoio();
        alfa.Serbatoio();

        esso.depositoAttuale();
        agip.depositoAttuale();
        //System.out.printf("Ora nel deposito ci sono %6.2f litri di benzina\n",esso.deposito);


        esso.aggiorna(1.80);//cambio prezzo benza
        agip.aggiorna(1.85);
        benzinaVenduta = esso.vendi(20,audi);
        dieselVenduto = agip.vendi(60,alfa);
        System.out.printf("Hai comprato  %4.2f litri di benzina\n",benzinaVenduta);
        System.out.printf("Hai comprato  %4.2f litri di diesel\n", dieselVenduto);

        audi.Serbatoio();
        alfa.Serbatoio();
        esso.depositoAttuale();
        agip.depositoAttuale();


    }
}
