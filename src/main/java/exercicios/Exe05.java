package exercicios;
// Faça um programa que leia um número pelo teclado e mostre seu antecessor e seu sucessor.

import java.util.Scanner;

public class Exe05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos pegar um número que você digitar e vamos mostrar seu sucessor e seu antecessor, vamos começar!");
        System.out.print("Digite um número inteiro: ");
        String opcao = scanner.next();
        int opcaoInt = Integer.parseInt(opcao);
        System.out.println();
        System.out.println("O número que você digitou foi: " + opcao + " O seu antecessor é: " +
                (opcaoInt - 1) + " e seu sucessor é: " + (opcaoInt + 1));
    }

}
