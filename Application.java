package com.sweetshopmanagementsystem;

import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        System.out.println("Welcome To Sweet Shop");

        Modak modak = new Modak();
        modak.id = "m001";
        modak.price = 80;

        Chocolate chocolate = new Chocolate();
        chocolate.id = "c002";
        chocolate.price= 50;

        Laddu laddu = new Laddu();
        laddu.id ="l003";
        laddu.price= 90;

        Jalebi jalebi = new Jalebi();
        jalebi.id = "j004";
        jalebi.price =120;

        Shrikhand shrikhand = new Shrikhand();
        shrikhand.id = "s005";
        shrikhand.price = 100;

        Shrikhand shrikhand1 = new Shrikhand();
        shrikhand1.id = "s005";
        shrikhand1.price = 130;

        SweetRepository sweetRepository = new SweetRepository();
        sweetRepository.add(modak);
        sweetRepository.add(chocolate);
        sweetRepository.add(laddu);
        sweetRepository.add(jalebi);
        sweetRepository.add(shrikhand);
        sweetRepository.add(modak);
        sweetRepository.add(shrikhand1);

        Set sweetList = sweetRepository.getSweetList();
        UserInterface ui = new UserInterface();
        ui.print(sweetList);

        sweetRepository.delete(modak);
        sweetRepository.delete(chocolate);

        System.out.println("After deleting the remaining Sweet list : ");
        ui.print(sweetList);

        System.out.println("Diet Sweet : ");
        ui.printDietSweets(sweetList);

        System.out.println("Normal Sweet : ");
        ui.printNormalSweets(sweetList);
    }
}
