package exercicios;

// Crie um algorítmo que leia um número do teclado e mostre na tela, o seu dobro, triplo e a raiz quadrada.

import java.util.Scanner;

public class Exe06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = Integer.parseInt(scanner.next());
        System.out.println();
        int dobro = num * 2;
        int triplo = num * 3;
        System.out.println("O número digitado foi: " + num + "\n" +
                "O seu dobro é: " + dobro + "\n" +
                "Seu triplo é: " + triplo + "\n" +
                "Sua raiz quadrada é: " + Math.sqrt(num));


    }

}
