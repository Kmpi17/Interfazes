/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Juego {
    
    //"Base de datos" de los jugadores
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    
    //numeros ganadores de esta rifa
    int[] ganadores = new int[5];
    
    //Metodo para generar entre 5 y 15 jugadores aleatorios.
    public void CrearJugadores(){
        
        int n = (int)(Math.random()*11+5);
        
        for (int i = 0; i < n; i++) {
            jugadores.add(new Jugador("Random"));
        }        
    }
    
    //Añade un jugador aleatorio
    public void CrearJugador(String nombre){
        jugadores.add(new Jugador(nombre));        
    }
    
    //Añade un jugador por parametros
    public void IntroducirJugador(String nombre, int[] numeros){
        jugadores.add(new Jugador(nombre, numeros));
    }
    
    public void jugar (){
        //generar el premio total
        int bote = 10*jugadores.size();
        
        int aciertosTotales=0;
        
        //generar numeros ganadores
        for (int i = 0; i < ganadores.length; i++) {
            ganadores[i] = (int)(Math.random()*100+1);
        }
        
        //comprobar aciertos de los jugadores
        for (Jugador aux : jugadores) {
            for (int i = 0; i < aux.numeros.length; i++) {
                for (int j = 0; j < ganadores.length; j++) {
                    if (aux.numeros[i] == ganadores[j]) {
                        aux.aciertos++;
                        aciertosTotales++;
                    }
                }   
            }
        }
        
        //repartir el bote
        for (Jugador aux : jugadores) {
            aux.premio = aux.aciertos*bote/aciertosTotales;
        }
        
    }
    
    public String MostrarJugador(){
        //Nota: Primero tendria que buscar al jugador
        //En este caso, se que es el primero. 
        String respuesta ="";
        
        respuesta = "Nombre: "+jugadores.get(0).nombre+" Premio: "+jugadores.get(0).premio+"€";
        
        return respuesta;
    }
    
    
    public void MostrarResultados(){
        for (Jugador aux : jugadores) {
            System.out.print("\nNombre: "+aux.nombre+".\n  Numeros: {");
            for (int i = 0; i < aux.numeros.length; i++) {
                System.out.print(aux.numeros[i]);
                if (i<aux.numeros.length-1) {
                    System.out.print(" ");
                }
            }
            System.out.println("} ");
            System.out.println("  Aciertos: "+aux.aciertos);
            System.out.println("  Premio: "+aux.premio+"€");
        }
    }
}
