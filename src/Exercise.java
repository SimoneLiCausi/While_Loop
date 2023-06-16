public class Exercise {

    public static void main(String[] args) {

        // Scrivi un ciclo while per il nostro bot di trading!
        //
        //Il bot sta attraversando una catastrofe finanziaria! Contiene 10.000 sterline britanniche.*
        //Vuole vendere tutto questo il prima possibile! Prima che lo stato della Gran Bretagna crolli, ma è un po' avido.
        //Venderà le sue sterline solo quando il tasso di cambio sarà maggiore di 1,15 (poundToEuro)
        //Nei giorni in cui vende, può vendere solo 1000 sterline per euro.
        //Scrivi un ciclo while
        //Usa il calcolo per il tasso di cambio qui sotto
        //1 + (Math.random() * 0.2);
        //Per ricalcolare la nostra tariffa ogni giorno (una volta per ciclo)
        //Stampa il numero di giorni necessari al nostro bot per vendere le sue sterline

      int botPounds = 10000;
      int maxPoundsToSellForOneDay = 1000;
      int days = 0;
      double minExchangeRateForSell = 1.15;

      while (botPounds > 0) {
          double exchangeRate = 1 + (Math.random() * 0.2);
          days++;

          if (exchangeRate >= minExchangeRateForSell ) {
              botPounds -= maxPoundsToSellForOneDay;
          }
        System.out.println("Days count: " + days + ". For sell all our pounds.");
          System.out.println("The exchange rate for the day " + days + " is: " + exchangeRate);
          System.out.println("Pounds remaining: " + botPounds);
          System.out.println(" ");
      }


        System.out.println("It tooks " + days + " days for sell all pounds. Congratulations !");




    }
}
