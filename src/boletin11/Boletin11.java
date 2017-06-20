/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author propa
 */
public class Boletin11 {

    public static void metodo(){
        Scanner sc = new Scanner(System.in);
   String s;
System.out.print("Introduzca texto: "
        + "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .");
s = sc.nextLine();} 

    private Timer timer = new Timer(); 
    private int segundos=0;

    //Clase interna que funciona como contador
    class Contador extends TimerTask {
        public void run() {
            segundos++;
     System.out.println("segundo: " + segundos);
        }
    }
    
    public static void main(String[] args) {
        
         metodo();
    }
    
}
