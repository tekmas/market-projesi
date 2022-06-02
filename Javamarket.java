package market_projesi;

import java.util.Scanner;

import static market_projesi.Depo.*;

public class Javamarket {

    public static void main(String[] args) {
        String devam = "";
        do {
            alısverislist();
            urunsec_miktarhesapla();
            Scanner scan = new Scanner(System.in);
            System.out.println("alışverişe devam edecekseniz 'devam' yazın");
            devam = scan.next();
        }
        while (devam.equalsIgnoreCase("devam"));
        odeme();
    }
}

