package exercicios;
// Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas.
import java.util.Scanner;
public class Exe02 {

    public static void main(String[] args){

        System.out.print("Digite aqui seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        System.out.println("");
        System.out.println("Seja muito bem vindo " + nome);
    }

}
