/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciklusok;

import java.util.Scanner;

/**
 *
 * @author szlan
 */
public class Szamok {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "latin2");
        System.out.println("Szeretne számismétlést kérni?");
        String valasz = sc.next();
        
        for(int i = 2; i <= 4; i++){
            for(int j = 2; j <= 4; j++){
                for(int k = 2; k <= 4; k++){
                    System.out.printf("%d%d%d\n", i, j, k);
                    
                }
            }
        }
        
        
        
    }
    
    
}
