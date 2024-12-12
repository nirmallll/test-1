import java.lang.System;
import java.util.Scanner;
import java.util.IllegalFormatException;
import javax.security.sasl.SaslException;

public class PRJ14 {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        
        String red ="\u001B[31m";
        String green="\u001B[32m";
        String yellow="\u001B[33m";
        String blue="\u001B[34m";
        String reset="\u001B[0m";
        
        System.out.println("Select the Color R / B / G/ Y");
        String a = input.nextLine().toUpperCase();
       
 

        if (a.equals("R")) {
            System.out.println(red + "you Selected Red" + reset);
            
        }
        else if (a.equals("B")){
            System.out.println(blue + "you Selected Blue" + reset);
        }
        
        else if (a.equals("G")){
            System.out.println(green + "you Selected Green" + reset );
        }
        else if (a.equals("Y")){
            System.out.println(yellow + "you Selected Yellow" + reset );
        }

 else   {

    throw new IllegalArgumentException("INVALID Input: Please Enter Only R, G,B,or Y");
 }
    }
    
}
