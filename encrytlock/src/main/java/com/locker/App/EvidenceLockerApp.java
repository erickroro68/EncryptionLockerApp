package com.locker.App;
import java.util.Scanner;
public class EvidenceLockerApp {
    
        // this class will be our app classthat handles our menu starting up our steps
    
        // from other classes where we made new objects to use

    public static void main(String[] args) {
            Scanner inputText = new Scanner(System.in);

            boolean scanning = true;

            while(scanning) {
            
            System.out.println("=== Evidence Locker ===");
            System.out.println("1. Add Evidence");
            System.out.println("2. View Evidence");
            System.out.println("3. Confirm Evidence");
            System.out.println("4. Delete Evidence");
            System.out.println("5. Check Expired Evidence");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");


            String userChoice = inputText.nextLine();
                switch(userChoice){
                    case "1":
                        System.out.println("1) Add Evidence");
                        break;
                    case "2":
                        System.out.println("2) View Evidence");
                        break;
                    case "3":
                        System.out.println("3) Confirm The Selected Document");
                        break;
                    case "4":
                        System.out.println("4) Delete the Selected Evidence ( Document )");
                        break;
                    case "5":
                        System.out.println("5) Checking the current selected evidence (document(s))");
                        break;
                    case "0":
                        scanning = false;
                        System.out.println("Stopped Scanning...");
                    default:
                        System.out.println("Pick A Valid Option");
                        break;
                }
                



            }
        
    }
}
