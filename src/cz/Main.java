package cz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Z binární do desítkový");
        System.out.println("2.z desítkový do binární");
        System.out.println("3.z desítkový do šestnáctkový");
        System.out.println("4.z šestnáctkový do desítkový");
        System.out.println();
        System.out.println("Vyberte si operaci:");
        String vyber = sc.nextLine();
        int vysledek;
        String vstup;
        switch(vyber){
            case "1":
                System.out.println("Zadejte cislo v BIN");
                vstup = sc.nextLine();
                vysledek = Integer.parseInt(vstup,2);
                System.out.println("V desítkové to je:" + vysledek);
                break;
            case "2":
                System.out.println("Zadejte cislo v DEC");
                System.out.println("V binarním to je:" + Integer.toBinaryString(Integer.parseInt(sc.nextLine())));
                break;
            case "3":
                break;
            case "4":
                break;

        }
    }
}
