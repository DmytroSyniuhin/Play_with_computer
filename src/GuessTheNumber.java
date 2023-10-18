import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 11);
        System.out.println("Вам потрібно вгадати число від 0 до 10 включно, яке загадав комп'ютер. У Вас на це 3 спроби");
        System.out.println("Спроба №1:");

        Scanner scanner = new Scanner(System.in);
        int scannerName1 = scanner.nextInt();

        if (scannerName1 == randomNumber) {
            System.out.println("Ви вгадали з першого разу! Неймовірно!");
        } else {
            System.out.println("На жаль Ви не вгадали. Спробуйте ще раз:");
            int scannerName2 = scanner.nextInt();
            if (scannerName2 == randomNumber) {
                System.out.println("Вам це вдалося! Вітаю!");
            } else {
                System.out.println("Шкода, але знову не вірно( Проте, Ви маєте ще одну спробу:");
                int scannerName3 = scanner.nextInt();
                if (scannerName3 == randomNumber) {
                    System.out.println("З третьої спроби, але Ви зробили це! Вітаю!");
                } else {
                    System.out.println("Знову промахнулися. Число, яке загадав комп'ютер було " + randomNumber);
                }


            }
        }
    }
}