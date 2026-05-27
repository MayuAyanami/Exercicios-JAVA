package func_vetor;

import java.util.Scanner;

public class Candyshop {
    // metodos sem static pertencem a objetos !!
    static int[] vendas = new int[5];
    static int indice = 0; // controla vetor vendas

    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // MENU INICIAL
        int opcaoMenu;
        do {
            System.out.println("CANDY SHOP MENU\n");
            System.out.println("1 - Registrar venda");
            System.out.println("2 - Total de vendas");
            System.out.println("3 - Análise de dados");
            System.out.println("4 - Sair");
            opcaoMenu = teclado.nextInt();

            switch (opcaoMenu) {
                case 1:
                    registrarVenda();
                    break;
                case 2:
                    totalVendas();
                    break;
                case 3:

                case 4:
                    System.out.println("FIM!");
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcaoMenu != 4);
    }


    // REGISTRO DE VENDAS
    public static void registrarVenda() {

        int codigo;

        // verifica espaço no vetor
        if (indice == vendas.length) {
            System.out.println("Limite de vendas atingido.");
            return; // encerra metodo
        }

        do {
            System.out.println("1 - Brigadeiro tradicional");
            System.out.println("2 - Brigadeiro branco de côco");
            System.out.println("3 - Brigadeiro de nozes");
            System.out.println("Código do produto:");
            codigo = teclado.nextInt();

            // verifica codigo
            if (codigo < 1 || codigo > 3)
                System.out.println("Codigo inválido!");

        } while (codigo < 1 || codigo > 3);

        vendas[indice] = codigo;
        indice++;
        System.out.println("Venda registrada!");
    }


    // TOTAL DE VENDAS
    public static void totalVendas () {

        double totalVendas = 0;
        for (int i = 0; i < indice; i++) {

            totalVendas += cardapio(vendas[i]) * 10;

        }
        System.out.println("Total de vendas: R$ " + totalVendas);
    }

    // CARDAPIO - preço
    public static double cardapio (int codigo) {

        switch (codigo) {

            case 1:
                return 2.0;

            case 2:
                return 2.0;

            case 3:
                return 3.5;

            default:
                return 0;
        }

    }
}
