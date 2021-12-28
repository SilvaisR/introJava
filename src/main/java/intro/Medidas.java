// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas


// 3 - classe
public class Medidas {
    // 3.1 - atributos - caracteristicas

    // 3.2 - métodos e funções
    public static void main(String[] args){
        System.out.println("Bom dia!!!");
        System.out.println("Vamos calcular áreas! ");

        calcularAreaModoCurto();
        calcularAreaModoExtenso();

    }

    public static void calcularAreaModoExtenso() {
        // Calculando tamanho de uma área, exemplo: tamanho de uma sala ou de tapete.
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 6;

        System.out.println("Cálculo de área modo extenso: ");

        resultado = largura * comprimento;
        System.out.println("Para largura de " + largura + " E comprimento de "+ comprimento
                + " O resultado será: " + resultado + " m²");

    }

    public static void calcularAreaModoCurto() {

        System.out.println("Cálculo de área modo curto: ");
        int largura = 4;
        int comprimento = 3;
        System.out.println("A área é de: " + largura*comprimento);
    }
}
