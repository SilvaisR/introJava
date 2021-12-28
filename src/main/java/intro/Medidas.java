// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

import java.util.Scanner;



// 3 - classe
public class Medidas {
    // 3.1 - atributos - caracteristicas

    // 3.2 - métodos e funções


    public static void main(String[] args) {

        // Usando o método scanner para poder ler um valor do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("De 1 à 12, qual é sua escolha?   ");

        String opcao = scanner.next();

        switch (opcao){
            case "1":
                System.out.println("Janeiro");
                break;
            case "2":
                System.out.println("Fevereiro");
                break;
            case "3":
                System.out.println("Março");
                break;
            case "4":
                System.out.println("Maio");
                break;
            case "5":
                System.out.println("Abril");
                break;
            case "6":
                System.out.println("Junho");
                break;
            case "7":
                System.out.println("Julho");
                break;
            case "8":
                System.out.println("Agosto");
                break;
            case "9":
                System.out.println("Setembro");
                break;
            case "10":
                System.out.println("Outubro");
                break;
            case "11":
                System.out.println("Novembro");
                break;
            case "12":
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }

    }


//    public static void ifSimples() {
//            String msg = "curto";
//
//            if (msg == "curto") {
//                calcularAreaModoCurto();
//            } else {
//                calcularAreaModoExtenso();
//            }
//        }
//
//    public static void calcularAreaModoExtenso() {
//        // Calculando tamanho de uma área, exemplo: tamanho de uma sala ou de tapete.
//        int largura;
//        int comprimento;
//        int resultado;
//
//        largura = 5;
//        comprimento = 6;
//
//        System.out.println("Cálculo de área modo extenso: ");
//
//        resultado = largura * comprimento;
//        System.out.println("Para largura de " + largura + " E comprimento de "+ comprimento
//                + " O resultado será: " + resultado + " m²");
//
//    }

//    public static void calcularAreaModoCurto() {
//
//        System.out.println("Cálculo de área modo curto: ");
//        int largura = 4;
//        int comprimento = 3;
//        System.out.println("A área é de: " + largura*comprimento);
//    }
}
