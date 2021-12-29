package exercicios;
// Escreva um programa que leia três notas de um aluno e mostre sua média na tela.

import java.util.Scanner;
public class Exe07 {

    public static void main(String[] args){
        int n1, n2 , n3, resultado;
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos culcular a média do aluno, para isso precisamos das notas, você pode digita-as a seguir.");
        System.out.println("Nota 1: ");
        n1 = Integer.parseInt(input.next());
        System.out.println("Nota 2: ");
        n2 = Integer.parseInt(input.next());
        System.out.println("Nota 3:");
        n3 = Integer.parseInt(input.next());
        resultado = (n1+n2+n3)/3;
        System.out.println();
        System.out.println("A média do aluno foi de: " + resultado);
    }

}
