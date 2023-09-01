/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heartratesvalues;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author unifccicarelli
 */
public class HeartRatesValues {

    /**
     * args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
/**
 * ligando o scanner para pegar os dados do user
 */
        System.out.print("Digite seu nome: ");
        String name = input.next();
        
        System.out.print("Digite seu sobrenome: ");
        String surname = input.next();

        
        System.out.print("Digite sua data de nascimento: ");
        System.out.print("Mês de nascimento: ");
        int mes = input.nextInt();
        System.out.print("Dia de nascimento: ");
        int dia = input.nextInt();
        System.out.print("Ano de nascimento: ");
        int ano = input.nextInt();
        
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();
        /**
         * aqui começam as contas de BPM
         */

        Period periodo = Period.between(dataNascimento, dataAtual);
        int idade = periodo.getYears();

        System.out.println("Você tem: " + idade + " anos");
        int resultado = 220 - idade;
        System.out.println("Sua frequência cardiaca máxima é de " + resultado + " BPM");
        /**
         *Resultados mostrados para o usúario
         */
        float cardAlv1 = (float) (resultado * 0.5);
        float cardAlv2 = (float) (resultado * 0.85);
        
        System.out.println("Sua frequência cardiaca alvo vai de " + cardAlv1 + " até " + cardAlv2 + " BPM's");

        
        input.close();
    }
    
}
