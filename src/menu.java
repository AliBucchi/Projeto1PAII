import java.util.*;
//Classe para o Menu

public class menu {
    public static int menu_principal() {
        Scanner ler = new Scanner(System.in);
        String choice;

        //Apresentar Menu
        System.out.println("\n\nEscolha uma das opções de jogos a seguir: ");

        System.out.println("Digite 1 para: Desenho dos padrões");
        System.out.println("Digite 2 para: Jogo do Adivinha");
        System.out.println("Digite 3 para: Sudoku simplificado");
        System.out.println("Digite 4 para: Encerrar e sair dos jogo");

        //Verificar se a escolha do utilizador é válida
        do{
            System.out.print("Escolha a sua opção: ");
            choice = ler.nextLine();
        }while(check_int(choice) == 0);

        //Retornar a escolha do utilizador
        return Integer.parseInt(choice);
    }

    //Função para verificar se uma string introduzida corresponde a um valor inteiro
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
