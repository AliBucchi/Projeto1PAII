import java.util.*;
//Classe para o Menu

public class menu {
    public static int menu_principal() {
        Scanner ler = new Scanner(System.in);
        String choice;

        System.out.println("\n\nEscolha uma das opções de jogos a seguir: ");

        System.out.println("Digite 1 para: Desenho dos padrões");
        System.out.println("Digite 2 para: Jogo do Adivinha");
        System.out.println("Digite 3 para: Sudoku simplificado");
        System.out.println("Digite 4 para: Encerrar e sair dos jogo");

        do{
            System.out.print("Escolha a sua opção: ");
            choice = ler.nextLine();
        }while(check_int(choice) == 0);

        return Integer.parseInt(choice);
    }

    public static int check_int(String arg){

        try
        {
            Integer.parseInt(arg);
            return 1;
        }
        catch (NumberFormatException e)
        {
            return 0;
        }
    }
}
