/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sad_trello;

import java.util.Scanner;

public class SAD_Trello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public static void HowMany() {
        ImAClass cls = new ImAClass();
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("Please enter how many times you would like to loop: ");
            int amt = scn.nextInt(); 

            System.out.print("\n");

            for (int i = 0; i < amt; i++) {
                cls.ToString();
            }
        } catch (Exception e) {
            System.out.println("Not a number");
            System.exit(0);
        }
    }
}
