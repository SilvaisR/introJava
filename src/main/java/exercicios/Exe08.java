package exercicios;
// Escreva um programa que leia um valor em métros, e o converta para centímetros e milímetros.

import java.util.Scanner;
public class Exe08 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos ler um valor em métros aqui.");
        System.out.println("Digite um valor: ");
        int num = Integer.parseInt(input.next());
        System.out.println("O valor digitado foi: " + num + "m");
        System.out.println("Convertido para centímetros fica: " + (num * 10) + "cm");
        System.out.println("Convertida para milímetros é: " + (num * 100) + "mm");

    }

}
