import java.util.*;
//Classe Principal

public class Projeto1PAII {

    public static void main(String[] args) {
        int Option = 0;
        Scanner ler = new Scanner(System.in);
        do {
            Option = menu.menu_principal();

            switch (Option) {
                case 1:
                    padrao.desenho_padrao();
                    break;

                case 2:
                    adivinha.num_adivinha();
                    break;

                case 3:
                    sudoku.game();
                    break;
            }
        } while (Option != 4 );
    }
}


