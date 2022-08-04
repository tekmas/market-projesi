package market_projesi;

import javax.swing.*;
import java.util.Scanner;

import static market_projesi.Depo.*;

public class Javamarket {

    public static void main(String[] args) {
        String devamMi = "";
        if (devamMi.equalsIgnoreCase("devam"));
        {
            do {
                alısverislist();
                urunsec_miktarhesapla();
                Scanner scan = new Scanner(System.in);
                System.out.println("alışverişe devam edecek misiniz?(cevabınız evet ise e, hayır ise h'ye basınız)");
                devamMi = scan.next();
            }
            while (devamMi.equalsIgnoreCase("e"));
        }
        if (devamMi.equalsIgnoreCase("h"))
            odeme();
    }
}

