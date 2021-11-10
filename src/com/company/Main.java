package com.company;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {



        float y = 100;
        float x;
        int o;
        while (y>0){
            for (int i =0; i<=y;){
                System.out.println("Vloz peniaze ");
                Scanner xa = new Scanner(System.in);
                x = xa.nextFloat();
                System.out.println("Vyber si cislo 1/2");
                Scanner ya = new Scanner(System.in);
                o = ya.nextInt();
                if(y>=x) {
                    y = y - x;
                }else{
                    System.out.println("Nemas dostatok penazi ");
                }
                Random rand = new Random();
                int upperbound = 2;
                int int_random = rand.nextInt(upperbound);
                if (int_random == o){
                    y = y +(2*x);
                }
                System.out.println("Zostatok :"+ y);

            }if(y==0){
                System.out.println("Nemas dostatok penazi ");
            }
        }}}