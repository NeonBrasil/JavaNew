/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparar;
import java.util.ArrayList;

/**
 *
 * @author unifccicarelli
 */
public class Comparar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        ArrayList<String> cores2 = new ArrayList<>();

        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Roxo");
        cores2.add("Vermelho");
        cores2.add("Preto");
        cores2.add("Roxo");
        cores2.add("Amarelo");
        
        boolean igualdade = cores.equals(cores2);
        
        if (igualdade){
            System.out.println("As listas são identicas");
            
        } else{
            System.out.println("As listas são diferentes");
        }

               
        // TODO code application logic here
    }
    
}
