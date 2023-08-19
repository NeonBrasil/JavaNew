/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;
import java.util.Scanner;

/**
 *
 * @author unifccicarelli
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();
        System.out.println("Digite o modelo: ");
        String modelo = input.next();
        System.out.println("Digite o preço: ");
        float preco = input.nextFloat();
        System.out.println("Digite o tamanho: ");
        float tamanho = input.nextFloat();
        System.out.println("Digite o canal que deseja assistir: ");
        int canal;
        do {
            System.out.println("1- Notícias bacanas 2- Propaganda e comida"
                    + " 3- Documentários e filmes: ");
            canal = input.nextInt();
            if (canal == 1){
                System.out.println("Você está assistindo noticias muito"
                        + "do bacanas: ");
            } else if(canal ==2){
                System.out.println("Você está vendo propaganda muito boas"
                        + "e comidas saborosas");
            }else if(canal == 3){
                System.out.println("Definitivamente um dos filmes já"
                        + "feitos");

            }else{
                System.out.println("Canal estática... Escolha outro: ");
            }
        } while (canal < 1 || canal > 3);
        
        
        
         System.out.println("Digite o volume do canal: ");
         int volume = input.nextInt();
         
         System.out.println("1- deixar tv ligada 0- desligar: ");
         boolean ligada = input.nextBoolean();
         if(ligada){
             System.out.println("Tv permaneceu ligada ");
             
         }
         else{ System.out.println("Desligada");
        
         }
        
        
        
    }
}
    

