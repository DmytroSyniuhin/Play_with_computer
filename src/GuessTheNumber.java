import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 11);
        int count = 1;

        System.out.println("Вам потрібно відгадати загадане комп'ютером число від 0 до 10 включно. Ви маєте на це 3 спроби.");


        for (int i = 0; i < 3; i++) {
            System.out.println("Спроба № " + count);
            count++;

            int scanInt = scanner.nextInt();

            if (randomNumber == scanInt) {
                System.out.println("Вітаю, Вам вдалося вгадати загадене число!");

                break;
            }
            System.out.println("На жаль, Ви не вгадали.");
        }
        System.out.println("Комп'ютер загадав число " + randomNumber + ".");
    }
}