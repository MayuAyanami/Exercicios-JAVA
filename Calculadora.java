import java.util.Scanner;

public class Calculadora {

    static double[] numeros = new double[2];

    public static void main (String[] args) {

        int opcaoMenu;
        double[] numeros = new double[2];

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("\n=== CALCULADORA JAVA ===\n");
            System.out.println("1 - Adição");
            System.out.println("2 - Multiplicação");
            System.out.println("3 - Divisão");
            System.out.println("4 - Sair");
            opcaoMenu = teclado.nextInt();

            switch (opcaoMenu) {

                case 1:
                    lerNumeros(numeros, teclado);
                    soma(numeros);
                    break;

                case 2:
                    lerNumeros(numeros, teclado);
                    multiplicacao(numeros);
                    break;

                case 3:
                    lerNumeros(numeros, teclado);
                    divisao(numeros);
                    break;

                case 4:
                    System.out.println("FIM !");
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
            }


        } while (opcaoMenu != 4);

    }

    public static void lerNumeros(double[] numeros, Scanner teclado) {

        System.out.println("Digite o primeiro número: ");
        numeros[0] = teclado.nextDouble();

        System.out.println("Digite o segundo número: ");
        numeros[1] = teclado.nextDouble();
    }
    public static void soma(double[] numeros) {

        double resultado = numeros[0] + numeros[1];

        System.out.println("Resultado: " + resultado);
    }

    public static void multiplicacao(double[] numeros) {

        double resultado = numeros[0] * numeros[1];

        System.out.println("Resultado: " + resultado);
    }

    public static void divisao(double[] numeros) {

        if (numeros[1] == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else {
            double resultado = numeros[0] / numeros[1];
            System.out.println("Resultado: " + resultado);
        }
    }
}
