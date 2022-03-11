package com.q3;

import java.util.Scanner;

public class Main{
    public Hotel provideFood(int amount){
        if(amount>1000)
            return new TajHotel();
        else if(amount<1000 && amount>200)
            return new RoadSideHotel();
        else
            return null;
    }
    public static void main(String[] args){
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount :");
        int amount = sc.nextInt();
        Hotel hotel = obj.provideFood(amount);
        if(hotel==null)
            System.out.println("Please Enter a valid amount.");
        else if(hotel.toString()=="RoadSideHotel"){
            RoadSideHotel roadSideHotel = (RoadSideHotel) hotel;
            roadSideHotel.chickenBiryani();
            roadSideHotel.masalaDosa();
        }
        else{
            TajHotel tajHotel = (TajHotel) hotel;
            tajHotel.welcomeDrink();
            tajHotel.chickenBiryani();
            tajHotel.masalaDosa();
        }
    }
}

class TajHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Taj Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Taj Hotel");
    }

    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }

    public String toString(){
        return "TajHotel";
    }
}

class RoadSideHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Road Side Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Road Side Hotel");
    }

    public String toString(){
        return "RoadSideHotel";
    }
}