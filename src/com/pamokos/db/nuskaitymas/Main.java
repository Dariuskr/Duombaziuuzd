package com.pamokos.db.nuskaitymas;

public class Main {

    public static void main(String[] args) {
        papildomos aktoriai = new papildomos();
        aktoriai.Pasisveikinimas();
        while (true) {
            aktoriai.Paklausimas();
            aktoriai.Pasirinkimas();



        }
    }
}
