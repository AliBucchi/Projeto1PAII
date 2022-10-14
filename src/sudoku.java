import java.util.*;
import java.util.Random;

public class sudoku {
    public static void game(){
        int[][] position = new int[9][9];
        int i = 0, k = 0, j = 0;
        Random pos_gen = new Random();

        for(i = 0; i < 9; i++){
            for(k = 0; k < 9; k++){
                position[i][k] = pos_gen.nextInt(10);
            }
        }


        //comparar com linha
        for(i = 0; i < 9; i++){
            for(k = 0; k < 9; k++){
                for(j = k+1; j < 9; j++){
                    if(position[i][j] == position[i][k]){
                        position[i][j] = 0;
                    }
                }
            }
        }

        System.out.println("X  1 2 3 4 5 6 7 8 9");

        //comparar com coluna
        for(i = 0; i < 9; i++){

            System.out.print(i+1 + "| ");

            for(k = 0; k < 9; k++){
                for(j = i+1; j < 9; j++){
                    if(position[j][k] == position[i][k]){
                        position[j][k] = 0;
                    }
                }

                System.out.print(position[i][k] + " ");
            }
            System.out.println(" ");
        }


    }
}
