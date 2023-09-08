/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.tortila.ui;

import java.util.Scanner;
import mx.itson.tortilla.negocio.Operacion;

/**
 *
 * @author gerar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        System.out.println("escriba el enunciado a seprar");
        
        Scanner scanner = new Scanner(System.in);
        String enunciado = scanner.nextLine();
        
        String[] resultado = new Operacion().separar(enunciado);
        
        for(String s : resultado){
            System.out.println(s);
            
        }
        }
        
        
    }
   
