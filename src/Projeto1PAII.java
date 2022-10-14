import java.util.*;
import java.util.Random;


public class Projeto1PAII {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Option;

        System.out.println("Escolha uma das opções de jogos a seguir: ");

        System.out.println("Digite 1 para: Desenho dos padrões");
        System.out.println("Digite 2 para: Jogo do Adivinha");
        System.out.println("Digite 3 para: Sudoku simplificado");
        System.out.println("Digite 4 para: Encerrar e sair dos jogo");

        System.out.print("Escolha a sua opção: ");
        Option = ler.nextInt();

        switch (Option) {
            case 1:
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
            break;

            case 2:
                int palpite = 0;
                int sorteado;
                int tentativas = 0;

                Scanner entrada = new Scanner(System.in);

                Random geradorDeAleatorios = new Random();

                sorteado = geradorDeAleatorios.nextInt(1000) + 1;
                System.out.println("Número entre 1 e 1000 sorteado!");

                do {
                    System.out.printf("\n-----------------\n");
                    System.out.println("Número de tentativas: " + tentativas);

                    System.out.print("Qual seu palpite: ");
                    palpite = entrada.nextInt();
                    tentativas++;

                    if (palpite > sorteado) {
                        System.out.println("Palpite muito alto");
                    } else {
                        System.out.println("Palpite muito baixo");
                    }

                } while (palpite != sorteado);

                if (palpite == sorteado) {
                    System.out.println("Voce venceu!");
                    System.out.println("O número era: " + sorteado);
                    System.out.println("Você tentou " + tentativas + " vezes");
                }
                break;

        }
    }
}


