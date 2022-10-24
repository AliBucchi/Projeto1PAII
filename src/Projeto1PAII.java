import java.util.*;
//Classe Principal

public class Projeto1PAII {

    public static void main(String[] args) {
        int Option = 0;
        do {
            Option = menu.menu_principal();

            switch (Option) {

                //Desenho de um padrão
                case 1:
                    padrao.desenho_padrao();
                    break;
                //Adivinhar um número de 1 a 1000
                case 2:
                    adivinha.num_adivinha();
                    break;

                //Sudoku Simplificado
                case 3:
                    sudoku.game();
                    break;

                case 4:
                    System.out.println("Pressione ENTER para encerrar o programa");
                    try{System.in.read();}
                    catch(Exception e){}
                    break;

                default:
                    Option = 0;
                    System.out.println("\nPor favor, introduza um numero inteiro positivo entre 1 e 4");
            }
        } while (Option != 4 );
    }
}


