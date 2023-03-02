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
        System.out.println("Ismetles?(I/N)");
        String valasz = sc.next();
        int db = 0;
        
        
        for(int i = 2; i <= 4; i++){
            for(int j = 2; j <= 4; j++){
                for(int k = 2; k <= 4; k++){
                    if(valasz.equals("n")&& (i == j || i == k || j == k)){
                        continue;
                    }
                    else{
                        System.out.printf("%d%d%d\n", i, j, k);
                        db++;
                    }
                    
                }
            }
        }
        
        System.out.printf("Permutacio: %d", db);
        
    }
    
    
}
