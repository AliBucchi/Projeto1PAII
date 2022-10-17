import java.util.Random;
import java.util.Scanner;
//Classe Para gerar e adivinhar um número

public class adivinha {
    public static void num_adivinha() {
        String user_val;
        int palpite = 0;
        int sorteado;
        int tentativas = 0;

        Scanner entrada = new Scanner(System.in);

        Random geradorDeAleatorios = new Random();

        //Gerar um número de 1 a 1000
        sorteado = geradorDeAleatorios.nextInt(1000) + 1;
        System.out.println("Número entre 1 e 1000 sorteado!");

        do {
            System.out.printf("\n-----------------\n");
            System.out.println("Número de tentativas: " + tentativas);

            //Pedir e verificar Input do utilizador
            do{
                System.out.print("Qual seu palpite: ");
                user_val = entrada.nextLine();
            }while(menu.check_int(user_val) == 0);
            palpite = Integer.parseInt(user_val);
            tentativas++;

            //Informar o utilizador da diferença entre o número gerado e o número introduzido
            if (palpite > sorteado) {
                System.out.println("Palpite muito alto");
            } else {
                System.out.println("Palpite muito baixo");
            }

        } while (palpite != sorteado);

        //Informar o Utilizador que acertou
        System.out.println("Voce venceu!");
        System.out.println("O número era: " + sorteado);
        System.out.println("Você tentou " + tentativas + " vezes");
    }
}
