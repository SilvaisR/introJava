package exercicios;

import java.util.Scanner;

// Faça um programa que leia algo pelo teclado e descubra seu tipo primitivo e todas as informações possíveis sobre ele.

public class Exe04 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite algo na tela pra descobrir seu tipo primitivo: ");
        String algo = input.next();
        System.out.println();
        System.out.println(((Object)algo).getClass().getSimpleName());
        System.out.println();
        System.out.println("Acabei de perceber que o Java não é uma linguagem de tipagem dinâmica\n" +
                "então neste caso este exercício será bem mais complicado de se realizar corretamente do que no Python.");
    }

}
