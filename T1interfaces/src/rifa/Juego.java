/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa;

import java.util.Arrays;

/**
 *
 * @author FP
 */
public class Juego {
    int [] cartonR = new int[90]; 
    int [] carton = new int [5];
    int [] cartonJ =new int [15];
    int jugadores=(int)(Math.random()*10)+4;
    int dinero=10*jugadores;
    
    
    
    
    
    public int[] cartonAleatorio(){
        
        
        for (int i = 0; i < carton.length; i++) {
            carton[i]=(int)(Math.random()*100+1);
            System.out.println(carton[i]);
            System.out.println("");
        }
        return carton;
        
    }
    
    
}
         
    
    