package com.ademakkus;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        int gunSayisi;
       double yevmiye;
       double toplamYevmiye=0.0;
        int sayac;
       DecimalFormat tl=new DecimalFormat("#,##0.00 TL");
        String giris= JOptionPane.showInputDialog("Çalışacağı gün sayısını giriniz");
        gunSayisi=Integer.parseInt(giris);

        for (sayac = 0; sayac < gunSayisi; sayac++) {
            giris=JOptionPane.showInputDialog("Günlük yevmiyeyi giriniz"+sayac);
            yevmiye=Double.parseDouble(giris);
            toplamYevmiye+=yevmiye;

        }
        JOptionPane.showMessageDialog(null,"Çalıştığı gün sayısı : "+sayac+ " gün ,Toplam kazancı :"+tl.format(toplamYevmiye));
        System.exit(0);
    }
}
