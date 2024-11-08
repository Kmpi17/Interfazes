/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Juego {
    
    
    int [] numGanadores = new int[5];
    int bote=20;
    
   
    
    public void jugar(int num1,int num2,int num3 ,int num4 ,int num5){
      
        int [] numUsuario={num1,num2,num3,num4,num5};
        
        for (int i = 0; i < numGanadores.length; i++) {
            int ran=(int)(Math.random()*99);
            numGanadores[i]=ran;
        }
        
        int contador=0;
        
        for (int i = 0; i <numGanadores.length; i++) {
            for (int j = 0; j <numUsuario.length; j++) {
                if (numGanadores[i]==numUsuario[j]) {
                    contador++;
                }
            }
        }
        
         bote=(contador*10)-10;
        
        
    }
    
        public String mostrarNumerosGanadores(){
            String mostrarNum="";
            for (int i = 0; i < numGanadores.length; i++) {
            mostrarNum += numGanadores[i] + " ";
            }
            return mostrarNum.toString();
        }
        
        public String mostrarBote(){
           String boteTexto=String.valueOf(bote);
           return boteTexto;
        }
}
