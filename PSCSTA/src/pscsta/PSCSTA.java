
package pscsta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PSCSTA {
    
    public static void main(String[] args) throws FileNotFoundException {
        //bopScotch();
        //ttt();
        nomopoly();
    }
    
    public static void bopScotch() throws FileNotFoundException{
        Scanner scan = new Scanner(new File("bopscotch.dat"));
        int NOL = scan.nextInt();
        for (int i = 0; i < NOL; i++) {
            int size = scan.nextInt();
            int blocks = (size - 2) / 3;
            int leftOver = (size - 2) % 3;
            System.out.println("/ " + size + " \\");
            while (leftOver > 0) {
                size--;
                System.out.println(" [" + (size) + "]");
                leftOver--;
            }
            for (int j = 0; j < blocks; j++) {
                size--;
                System.out.println("[" + (size - 1) + "]" + "[" + size + "]");
                size -= 2;
                System.out.println(" [" + size + "] ");
            }
            System.out.println("\\ " + 1 + " /" + "\n");
        }
    }
    
    public static void ttt() {
        System.out.println("\\/ * \\/ * /\\");
        System.out.println("/\\ * /\\ * \\/");
        System.out.println("************");
    }
    
    public static void nomopoly() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("nomopoly.dat"));
        int NOL = scan.nextInt();
        for (int i = 0; i < NOL; i++) {
            String name = scan.next();
            String name2 = scan.next();
            double price = scan.nextDouble();
            int places = scan.nextInt();
            for (int j = 0; j < places; j++) {
                price += (price * 1.25);
            }
            System.out.println("If someone lands on " + name + " " + name2 + ", they will owe $" + price);
        }
    }
    
}
