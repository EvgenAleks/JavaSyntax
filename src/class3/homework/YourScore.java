package class3.homework;

import java.util.Scanner;

public class YourScore {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Сколько у Вас пятёрок?");
        int score = input.nextInt();

        if (score >=3){
            System.out.println("Вы отличник!");
        }else if (score == 2){
            System.out.println("Вы хорошист!");
        }else if (score ==1){
            System.out.println("Вы троечник!");
        }else if (score ==0){
            System.out.println("Учитесь лучше!");
        }
    }
}
