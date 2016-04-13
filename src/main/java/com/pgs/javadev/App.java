package com.pgs.javadev;
import java.util.Scanner;


public class App {
    public static void main( String[] args) {
        XmasTreeCreator creator =  new XmasTreeCreator();
        Scanner userScanner = new Scanner(System.in);
        String text = "";
        int levels = 0;
        int length = 0;
        int growDir = 0;
        while (length != 1) {
            System.out.print("Jakiego znaku chcesz uzyc do rysowania? \n");
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
         System.out.print("Ile poziomow ma miec Twoja wypasiona choinka? \n");
            String levelString = userScanner.nextLine();
            try{
                levels = Integer.valueOf(levelString);
                if(levels < 1) {
                    System.out.println("Minimalina ilość poziomów to 1");
                }
            } catch (NumberFormatException ex) {
              System.out.println("To nie jest odpowiednia liczba");
            }
        }

        while (growDir == 0)  {
            System.out.print("W którą stronę rośnie Twoja choinka? \n" + "1 - góra \n" + "2 - dół \n" + "3 - prawo \n" + "4 - lewo \n");
            String levelString = userScanner.nextLine();
            try{
                growDir = Integer.valueOf(levelString);
                if(growDir < 0 || growDir > 4) {
                    System.out.println("Wybierz wartość od 1 do 4");
                    growDir = 0;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Podaj liczbę od 1 do 4");

            }
        }

        System.out.println(creator.createXmasTree(text, levels, growDir));
    }

}
