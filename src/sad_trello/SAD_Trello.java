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
    public void HowMany(Object string) {
        int amt = 0;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Please enter how many times you would like to loop: ");
        try {
            amt = scn.nextInt();
        } catch (Exception e) {
            System.out.println("Not a digit");
            System.exit(0);
        } 
        
        System.out.print("\n");
        
        for (int i = 0; i < amt; i++) {
            System.out.println(string.toString());
        }
    }
}
