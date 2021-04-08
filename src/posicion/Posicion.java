/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posicion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Flor Melanni Infante
 */
public class Posicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        int numero;
        int tamaño[];
        boolean num = false;
        
        tamaño = new int [10];
        for(int i=0; i<10; i++){
        System.out.print("Ingresar los numeros: ");
        tamaño[i] = sc.nextInt();
        }
        System.out.print("Cual numero deceas buscar: ");
        numero = sc.nextInt();
        int i = 0;
         
        while(i<10 && tamaño[i]<numero ){
            i++;
        }
        if(i==10){
        System.out.print("El numero no se ha encontrado: -1");
        }
        else{
        if(tamaño[i]==numero){
        System.out.print("El numero se ha encontrado en la posicion: " + i);
        }
        }
    }
    
}
