package func_vetor;

import java.util.Scanner;

public class Brownie {
    public static void main(String[] args) {

        double[] semestre1 = new double[6];
        double[] semestre2 = new double[6];
        Scanner teclado = new Scanner(System.in);

        // lucro do semestre 1
        for (int i = 0; i < semestre1.length; i++) {

            System.out.println("Lucro do mês " + (i + 1) + ": ");
            // valor armazenado no vetor
            semestre1[i] = teclado.nextDouble();
        }


        // lucro do semestre 2
        for (int i = 0; i < semestre2.length; i++) {

            System.out.println("Lucro do mês " + (i + 7));
            // valor armazenado no vetor
            semestre2[i] = teclado.nextDouble();
        }

        // saida de dados
        analisarVendas(semestre1, semestre2);
        System.out.println();
    }

    public static void analisarVendas(double[] s1, double[] s2) {

        double soma1 = 0, soma2 = 0;
        int mesesSemLucro = 0;

        // soma do semestre 1
        for (int i = 0; i < s1.length; i++) {
            soma1 += s1[i];

            // soma de meses sem lucro
            if (s1[i] <= 0)
                mesesSemLucro++;
        }

        // soma do semestre 2
        for (int i = 0; i < s2.length; i++) {
            soma2 += s2[i];

            if (s2[i] <= 0)
                mesesSemLucro++;

        }

        // saida
        System.out.printf("Media do semestre 1: %.1f\n",(soma1/6));
        System.out.printf("Media do semestre 2: %.1f\n",(soma2/6));
        System.out.printf("Media anual: %.1f\n",((soma1 + soma2)/12));
        System.out.printf("Meses sem lucro: %d\n", mesesSemLucro);

        if (mesesSemLucro > 3)
            System.out.printf("Mude o ramo do negócio!");
    }

}