
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FP
 */
public class Juego {

    int [] numeroGenerados=new int[5];
    int [] numerosUsuario=new int[5];
    int[] numeroGanador = new int[5];
    int [] numerosAparecidos= new int [100];
    int totalCoincidencias=0;
    int costeCarton=0;
    int cantidadJugadores;
    int aciertoJugador=0;
    int bote=(cantidadJugadores+1)*10;
    int[] numerosJugador1 = new int[5];
    int[] numerosJugador2 = new int[5];
    int[] numerosJugador3 = new int[5];
    int[] numerosJugador4 = new int[5];
    int[] numerosJugador5 = new int[5];
    int[] numerosJugador6 = new int[5];
    int[] numerosJugador7 = new int[5];
    int[] numerosJugador8 = new int[5];
    int[] numerosJugador9 = new int[5];
    int[] numerosJugador10 = new int[5];
    int[] numerosJugador11 = new int[5];
    int[] numerosJugador12 = new int[5];
    int[] numerosJugador13 = new int[5];
    int[] numerosJugador14 = new int[5];
    
 
    

public String generarNumerosAleatorios() {
    int[] numerosGenerados = new int[5];
    int contador = 0;

    while (contador < 5) {
        int aleatorio = (int) (Math.random() * 100);
        boolean existe = false;
        for (int i = 0; i < contador; i++) {
            if (numerosGenerados[i] == aleatorio) {
                existe = true;
                break;
            }
        }
        
        if (!existe) {
            numerosGenerados[contador] = aleatorio;
            contador++;
        }
    }

   
    String numeroGenerado = "";
    for (int i = 0; i < numerosGenerados.length; i++) {
        numeroGenerado += numerosGenerados[i];
        if (i < numerosGenerados.length - 1) {
            numeroGenerado += ",";
        }
    }

   return numeroGenerado;
}


public void procesarNumerosIngresados(String numero) {
    String[] partes = numero.split(",");
    int[] numeros = new int[partes.length];

    for (int i = 0; i < partes.length; i++) {
        numeros[i] = Integer.parseInt(partes[i].trim()); 
    }

}




public String mostarNumeroGanador(){
    
  
 String numeroGanador = "";
    
    for (int i = 0; i < 5; i++) {
        int numeroAleatorio = (int) (Math.random() * 100); 
        
        numeroGanador += numeroAleatorio;       
     
        if (i < 4) {
            numeroGanador += ",";
        }
    }
    
    return numeroGanador;
}


public void generarNumeroGanador() {
    String numeroGanadorStr = generarNumerosAleatorios();
    String[] partes = numeroGanadorStr.split(",");
    for (int i = 0; i < partes.length; i++) {
        numeroGanador[i] = Integer.parseInt(partes[i].trim());
    }
}


public void elegirNumero( JTextField cuadroTextoElegir){
    
    String numeroIngresado=cuadroTextoElegir.getText();
    String[] numerosString = numeroIngresado.split(",");
    int[] numeros = new int[numerosString.length];
    
   
    for (int i = 0; i < numerosString.length; i++) {
        numeros[i] = Integer.parseInt(numerosString[i].trim());
        
    }
  
    
      
}



public int compararNumeros(){
    int coincidencias = 0;

    for (int i = 0; i < numeroGenerados.length; i++) {
        for (int j = 0; j < numerosUsuario.length; j++) {
            if (numeroGenerados[i] == numerosUsuario[j]) {
                coincidencias++;
                break; 
            }
        }
    }

    
    aciertoJugador+=coincidencias;
    return coincidencias; 
}



    

    
    
      public void generarJugadores(){
        int cantidadJugadores = (int) (Math.random() * 10) + 5; 
        generarNumeroGanador(); 

        for (int i = 0; i < cantidadJugadores; i++) {
            int[] numerosJugador = new int[5]; 
            int contador = 0;

            while (contador < 5) {
                int aleatorio = (int) (Math.random() * 100);
                boolean existe = false;

                for (int j = 0; j < contador; j++) {
                    if (numerosJugador[j] == aleatorio) {
                        existe = true;
                        break;
                    }
                }

                if (!existe) {
                    numerosJugador[contador] = aleatorio;
                    contador++;
                }
            }

           
            switch (i) {
                case 0: numerosJugador1 = numerosJugador; break;
                case 1: numerosJugador2 = numerosJugador; break;
                case 2: numerosJugador3 = numerosJugador; break;
                case 3: numerosJugador4 = numerosJugador; break;
                case 4: numerosJugador5 = numerosJugador; break;
                case 5: numerosJugador6 = numerosJugador; break;
                case 6: numerosJugador7 = numerosJugador; break;
                case 7: numerosJugador8 = numerosJugador; break;
                case 8: numerosJugador9 = numerosJugador; break;
                case 9: numerosJugador10 = numerosJugador; break;
                case 10: numerosJugador11 = numerosJugador; break;
                case 11: numerosJugador12 = numerosJugador; break;
                case 12: numerosJugador13 = numerosJugador; break;
                case 13: numerosJugador14 = numerosJugador; break;
                default: break; 
                
            }
             compararConNumeroGanador(numerosJugador);
        }
        
      }
      
      
      public void compararNumerosUsuario() {
    for (int i = 0; i < numerosUsuario.length; i++) {
        for (int j = 0; j < numeroGanador.length; j++) {
            if (numerosUsuario[i] == numeroGanador[j]) {
                aciertoJugador++;
                break;
            }
        }
    }
}
      
      
      
  public void compararConNumeroGanador(int[] numerosJugador) {
        int coincidencias = 0;
        for (int numJugador : numerosJugador) {
            for (int numGanador : numeroGanador) {
                if (numJugador == numGanador) {
                    coincidencias++;
                    break; 
                }
            }
        }
        totalCoincidencias += coincidencias; 
    }
    
  
public String CalcularGanacias() {
    if (totalCoincidencias > 0) {
        double ganancias = (aciertoJugador * bote / totalCoincidencias);
        return String.valueOf(ganancias);
        
       
    } else {
        return "No hay ganancias";
    }
}
    
    
    
}



