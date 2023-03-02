/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciklusok;

/**
 *
 * @author szlan
 */
public class Sarkany {
    
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        
        while(y <= 13){
            x = 0;
            while(x <= 20){
                x++;
                if((x*7)+(y*11) == 145){
                    System.out.printf("7 * %d + 11 * %d = 145 \n", x, y);
                }
            }
            y++;
        }
        
        
        
        
        
    }
    
    
}
