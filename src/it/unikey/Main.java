package it.unikey;

public class Main {

    public static void main(String[] args) {
        /*Progettare una classe di nome DistributoreBenzina, per rappresentare un
distributore di carburante per automobili. Tale classe prevede due variabili
d'istanza. La prima variabile d'istanza e' chiamata deposito
e contiene il quantitativo di benzina disponibile al distributore. La seconda
variabile d'istanza e' chiamata euroPerLitro e rappresenta
il prezzo della benzina, espresso in euro per litro.
La quantita' iniziale di benzina disponibile e' zero. La
classe deve inoltre implementare i seguenti metodi. Un metodo
rifornisci che rifornisce il distributore di
benzina. Un metodo vendi che vende una
quantita' di benzina corrispondente all'ammontare di euro pagatoInfine, un metodo definito
aggiorna che aggiorna il prezzo della benzina.
il distributore abbia due pompe, una di benzina verde ed una di
gasolio. Ciascun tipo di carburante ha il suo costo per litro. Conseguentemente,
dovrete raddoppiare il metodo rifornisci: dovrete avere un metodo per rifornire
la benzina verde ed un metodo per rifornire il gasolio. Tale metodo rifornisce l'automobile specificata come parametro
esplicito nel modo appropriato (verde oppure gasolio).
*/

        Auto bmw = new Auto(65, 30,"benzina");
        Distributore esso = new DistributoreBenzina(0,1.69,"benzina");

        esso.rifornisci(1000.0);

        //System.out.println("Nel deposito ci sono " + esso.deposito +" litri di benzina.");
        System.out.printf("Hai comprato  %4.2f litri di benzina\n",esso.vendi(20,bmw));

       // System.out.printf("%4.2f",bmw.getCarburanteAttuale() + "litri");

        //System.out.printf("Ora nel deposito ci sono %6.2f litri di benzina\n",esso.deposito);
        //System.out.println("Ora nel deposito ci sono " + esso.deposito +" litri di benzina.");

        esso.aggiorna(1.80);

        /*System.out.printf("%6.2f \n", esso.vendi(20,bmw));
        System.out.printf("Ora nel deposito ci sono %6.2f litri di benzina\n ",esso.deposito);
        System.out.println("Nel serbatoio auto ci sono %4.2f litri " + bmw.getCarburanteAttuale());*/

        bmw.Serbatoio();


    }
}
