package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        int wynik = WyliczeniePozycjiWRankingu(1500);
        wyswietleniePozycjiWRankingu("Paweł", wynik);

    }

    public static void wyswietleniePozycjiWRankingu(String imie, int wynik) {
        System.out.println(imie + " zdobył pozycję nr "+ wynik + " w rankingu.");
    }

    public static int WyliczeniePozycjiWRankingu(int wynik) {

        if (wynik > 1000) {
            return 1;
        } else if (wynik > 500 && wynik < 1000 ) {
            return 2;
        } else if (wynik > 100 && wynik < 500) {
            return 3;
        } else if (wynik < 100) {
            return 4;
        }
        return -1;
    }
}

