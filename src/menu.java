import java.util.*;
//Classe para o Menu

public class menu {
    public static int menu_principal() {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n\nEscolha uma das opções de jogos a seguir: ");

        System.out.println("Digite 1 para: Desenho dos padrões");
        System.out.println("Digite 2 para: Jogo do Adivinha");
        System.out.println("Digite 3 para: Sudoku simplificado");
        System.out.println("Digite 4 para: Encerrar e sair dos jogo");

        System.out.print("Escolha a sua opção: ");
        return ler.nextInt();
    }
}
