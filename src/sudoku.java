import java.util.*;
import java.util.Random;

public class sudoku {

    public static void game(){
        //declaração de variáveis
        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> valid_nums = new ArrayList<Integer>();

        int[][] position = new int[9][9];
        int[] possible_val = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String CheckInput;

        int i = 0, k = 0, j = 0, h = 0;
        int Linha = 0, Coluna = 0, valid_pos = 0, numcheck = 0, Valor_Cell = 0, total_cell = 0;

        int ans = 1, read_ans = 0, ans_check = 0;



        Random pos_gen = new Random();

        for(i = 0; i < 9; i++){
            for(k = 0; k < 9; k++){
                position[i][k] = pos_gen.nextInt(10);
            }
        }

        //Corrigir e apresentar o Sudoku
        System.out.println("X  1 2 3 4 5 6 7 8 9");

        for(i = 0; i < 9; i++){
            System.out.print(i+1 + "| ");
            for(k = 0; k < 9; k++){
                //comparar com Linha
                for(j = k+1; j < 9; j++){
                    if(position[i][j] == position[i][k]){
                        position[i][j] = 0;
                    }
                }
                //comparar com Coluna
                for(j = i+1; j < 9; j++){
                    if(position[j][k] == position[i][k]){
                        position[j][k] = 0;
                    }
                }
                System.out.print(position[i][k] + " ");
                if(position[i][k] == 0){
                    total_cell++;
                }
            }
            System.out.println(" ");
        }

        while(ans == 1){
            valid_pos = 0;
            //selecionar posição na matriz
            do{
                System.out.println("Selecione uma posição no jogo:");

                do{
                    do{
                        System.out.println("Linha (1 -> 9): ");
                        CheckInput = ler.nextLine();
                    }while(menu.check_int(CheckInput) == 0);

                    Linha = Integer.parseInt(CheckInput)-1;

                }while(Linha < 0 || Linha > 8);

                do{
                    do{
                        System.out.println("Coluna (1 -> 9): ");
                        CheckInput = ler.nextLine();
                    }while(menu.check_int(CheckInput) == 0);

                    Coluna = Integer.parseInt(CheckInput)-1;
                }while(Coluna < 0 || Coluna > 8);


                if(position[Linha][Coluna] == 0){
                    valid_pos = 1;
                }
                else{
                    System.out.println("A posição selecionada já está ocupada");
                }

            }while(valid_pos == 0);

            //definir/redefinir numeros válidos
            valid_nums.clear();
            h = 0;
            while(h != 9){
                h++;
                valid_nums.add(h);
            }

            //mostrar números disponíveis
            for(i = 0; i < 9; i++){
                for(k = 0; k < 9; k++){

                    //comparar com Linha
                    for(j = k+1; j < 9; j++){

                        if(position[i][Coluna] != 0){

                            for(h = 0; h < valid_nums.size(); h++){
                                if (valid_nums.get(h) == position[i][Coluna]){
                                    numcheck = 1;
                                    break;
                                }

                            }
                            if(numcheck == 1){
                                valid_nums.remove(h);
                            }
                            numcheck = 0;

                        }
                    }

                    //comparar com Coluna
                    for(j = i+1; j < 9; j++){

                        if(position[Linha][k] != 0){
                            for(h = 0; h < valid_nums.size(); h++){

                                if (valid_nums.get(h) == position[Linha][k]){
                                    numcheck = 1;
                                    break;
                                }

                            }
                            if(numcheck != 0){
                                valid_nums.remove(h);
                            }
                            numcheck = 0;

                        }
                    }
                }
            }

            numcheck = 0;

            if(valid_nums.size() == 0){
                System.out.println("Não existem números disponíveis");
            }
            else{
                System.out.println("Os numeros disponiveis são: " + valid_nums);
                total_cell--;

                while (numcheck == 0){
                    do{
                        System.out.println("Introduza um destes " + valid_nums.size() + " valores: ");
                        CheckInput = ler.nextLine();
                    }while(menu.check_int(CheckInput) == 0);

                    Valor_Cell = Integer.parseInt(CheckInput);

                    for(h = 0; h < valid_nums.size(); h++){
                        if(Valor_Cell == valid_nums.get(h)){
                            numcheck = 1;
                            break;
                        }
                    }
                    if(numcheck == 0){
                        System.out.println("O valor introduzido não é válido");
                    }
                }
                position[Linha][Coluna] = Valor_Cell;

                System.out.println("X  1 2 3 4 5 6 7 8 9");

                for(i = 0; i < 9; i++){
                    System.out.print(i+1 + "| ");
                    for(k = 0; k < 9; k++){
                        System.out.print(position[i][k] + " ");
                    }
                    System.out.println(" ");
                }
            }

            //verificar se o utilizador deseja continuar
            if(total_cell == 0){
                ans_check = 1;
                System.out.println("Já não é possível modificar nehuma posição.");
            }
            else{
                ans_check = 0;
            }

            while(ans_check == 0) {

                do {
                    System.out.println("\nPara terminar, introduza o número 0.\nPara continuar introduza o nuúmero 1: ");
                    CheckInput = ler.nextLine();
                } while (menu.check_int(CheckInput) == 0);

                read_ans = Integer.parseInt(CheckInput);
                if (read_ans == 0 || read_ans == 1) {
                    ans = read_ans;
                    ans_check = 1;
                }
            }
        }
    }
}


