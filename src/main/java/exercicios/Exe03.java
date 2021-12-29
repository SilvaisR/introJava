package exercicios;
// Crie um programa que leia dois números e mostre a soma entre eles.
import java.util.Scanner;
public class Exe03 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos fazer a soma entre dois números");
        System.out.print("Digite o 1° número: ");
        String n1 = scanner.next();
        System.out.println();
        System.out.print("Digite o 2° número: ");
        String n2 = scanner.next();

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);

        System.out.println();
        System.out.println("A soma entre os dois número é: " + (num1+num2));

    }

}
