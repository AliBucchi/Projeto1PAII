import java.util.*;
//Classe Principal

public class Projeto1PAII {

    public static void main(String[] args) {
        int Option = 0;
        Scanner ler = new Scanner(System.in);
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

                default:
                    Option = 4;
            }
        } while (Option != 4 );
    }
}


