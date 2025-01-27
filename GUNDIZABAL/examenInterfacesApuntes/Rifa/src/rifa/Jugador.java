/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa;

/**
 *
 * @author gonza
 */
public class Jugador {
    String nombre;
    int[] numeros = new int[5];
    int aciertos;
    double premio;

    public Jugador() {
    }
    
    //constructor aleatorio a partir del nombre
    public Jugador(String nombre) {
        this.nombre = nombre;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*100+1);
        }
        aciertos = 0;
        premio = 0;
    }
    
    //Constructor con nombre y numeros
    public Jugador(String name, int[] num){
        nombre = name;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = num[i];
        }
        aciertos = 0;
        premio = 0;
    }
    
    
}
