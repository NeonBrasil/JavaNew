/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22221005.pkg6lab2;

import java.util.Scanner;

/**
 *
 * @author unifccicarelli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();

        System.out.println("Digite o lado 1: ");
        int lado1 = input.nextInt();
        
        System.out.println("Digite o lado 2: ");
        int lado2 = input.nextInt();
        ret1.setLado1(lado1);
        ret1.setLado2(lado2);
        
        System.out.println(ret1.getLado1());
        System.out.println(ret1.getLado2());
        
        int area = ret1.area();
        System.out.println("Area: " + area);
        System.out.println("perimetro é igual a " + ret1.perimetro());
        
    }
    
}
