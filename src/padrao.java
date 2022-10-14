import java.util.Scanner;
//Classe Para desenhar o Padrão

public class padrao {
    public static void desenho_padrao() {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nDesenho dos padrões\n");
        int tamanhoPadrao;
        int i, j, k;

        System.out.println("Escolha o tamanho do padrão a ser criado com um numero entre 1 e 10: ");
        tamanhoPadrao = ler.nextInt();

        System.out.println("Padrão A");
        for (i = 1; i <= tamanhoPadrao; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPadrão B");
        for (i = 1; i <= tamanhoPadrao; i++) {
            for (j = 1; j <= (tamanhoPadrao + 1) - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPadrão C");
        for (i = 1; i <= tamanhoPadrao; i++) {
            for (j = i; j < tamanhoPadrao; j++) {
                System.out.print("  ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
