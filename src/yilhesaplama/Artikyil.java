package yilhesaplama;

import java.util.Scanner;

public class Artikyil {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int year;
        boolean artikyil;
        System.out.println("Yılı giriniz:");
        year= input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    artikyil = true;
                }else{
                    artikyil = false;
                }
            }else {
                artikyil = true;
            }
        } else{
            artikyil = false;
        }

        if (artikyil){
            System.out.println(year + " yılı bir artık yıldır !");
        }else{
            System.out.println(year + " yılı bir artık yıl değildir !");
        }
    }
}

