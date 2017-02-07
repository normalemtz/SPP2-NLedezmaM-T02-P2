/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.t02.p2;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class SPP2NLedezmaMT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Norma Alejandra Ledezma Martinez A01411460 (IIS)
        // Variables
        Scanner tecl = new Scanner (System.in);
        int valinf,valsup;
        
        //Datos
        System.out.println("Introduzca el valor inferior");
        valinf=tecl.nextInt();
        System.out.println("Introduzca el valor superior");
        valsup=tecl.nextInt();
        
        //Operaciones
        if (valinf%2==0){
            System.out.println("El valor inferior es un número par");
            } if (valinf%3==0){
            System.out.println("El valor inferior es divisble entre 3");
                } if (valinf%5==0){
            System.out.println("El valor inferior es divisble entre 5");
                    }
        
        if (valsup%2==0){
            System.out.println("El valor superior es un número par");
            } if (valsup%3==0){
            System.out.println("El valor superior es divisble entre 3");
                } if (valsup%5==0){
            System.out.println("El valor superior es divisble entre 5 \n");
                }
        
        System.out.println("Los números entre los valores son: ");        
        while (valinf<valsup){
            System.out.println(valinf);
            valinf = valinf+1;
        }   System.out.println(valsup); 
        
          
        
    }
    
}
