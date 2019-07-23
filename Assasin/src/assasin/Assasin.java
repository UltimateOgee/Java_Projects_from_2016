
package assasin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Assasin {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("players.txt");
        Scanner s = new Scanner(f);
        players list = new players();
        while(s.hasNextLine()){
            list.add(s.nextLine());
        }
        
        System.out.println(list.toString());
        System.out.println(list.size);
        System.out.println(list.targetToString("Mitchell"));
        System.out.println(list.targetToString("Krishna"));
        System.out.println(list.targetToString("Bryan"));
    }
}
