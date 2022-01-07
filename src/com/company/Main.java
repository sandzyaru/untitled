package com.company;

public class Main {
    public static void main(String[] args) {
        Printable [] phones = {createObjects("Iphone"),createObjects("Samsung"),createObjects("Xiaomi")};
        for (Printable printable:phones){
            printable.print();
        }
    }

    public static Printable createObjects(String Phone){

          switch (Phone) {
            case ("Iphone"):
                Iphone iphone = new Iphone("Iphone 11", 1500, 3);
                return iphone;
            case ("Samsung"):
                Samsung samsung = new Samsung("Samsung Galaxy A6+", 1300, 2);
                return samsung;
                case ("Xiaomi"):
                Xiaomi xiaomi= new Xiaomi("Poco 6", 1600, 4);
                return xiaomi;


        }
        return null;

    }


        }
