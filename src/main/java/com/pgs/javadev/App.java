package com.pgs.javadev;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args) {
        XmasTreeCreator creator =  new XmasTreeCreator();
        Scanner userScanner = new Scanner(System.in);
        String text = "";
        int levels = 0;
       // System.out.print("Jakiego znaku chcesz uzyc? \n");
        int length = 0;
        while (length != 1) {
            System.out.print("Jakiego znaku chcesz uzyc? \n");
            text = userScanner.nextLine();
            length = text.length();
            if  (length > 1 ) {
                System.out.println("Za długie");
                length = text.length();
            }
            else {
                System.out.println("OK");
                length = 1;
            }

        }

        while (levels  <= 0)  {
         System.out.print("Ile poziomow ma miec Twoja wyopasiona choinka? \n");
            String levelString = userScanner.nextLine();
            try{
                levels = Integer.valueOf(levelString);
                if(levels < 1) {
                    System.out.println("Minimalina ilość poziomów to 1");
                }
            } catch (NumberFormatException ex) {
                System.out.println("To nie jest odpowiednia liczba");

            }
/*
            if ((userScanner.hasNextInt()) ) {
                levels = userScanner.nextInt();
                if (levels  < 1) {
                    System.out.println("Minimalina ilość poziomów to 1");
                }
            }
            else {
                System.out.println("To nie jest odpowiednia liczba");
                userScanner.next();
            }*/
        }



        System.out.println(creator.createXmasTree(text, levels));
    }

}
