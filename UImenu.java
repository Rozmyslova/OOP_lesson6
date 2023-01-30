import java.util.Scanner;

public class UImenu {
    public void mainMenu() {
        System.out.printf("Добро пожаловать в игру Крестики-нолики! \n");
        int choise;
        do {
            System.out.printf("Выберите, как вы хотите играть: \n");
            System.out.printf("1 - два игрока; \n");
            System.out.printf("2 - игрок VS бот \n");
            System.out.printf("Ваш выбор: ");
            Scanner sc = new Scanner(System.in);
            while (!sc.hasNextInt()){ 
                System.out.printf("Вы ввели не число! Введите 1 или 2. Ваш выбор: "); 
                sc.next(); 
            }
            choise = sc.nextInt();
            if (choise != 1 & choise != 2) {
                System.out.printf("Такого пункта нет! \n");
            }
        } while (choise <= 0 | choise >= 3);
        if (choise == 1) {
            GameTwoPlayers twoPlayers = new GameTwoPlayers();
            twoPlayers.gameTwoPlayers();;
        }
        else {
            GamePlayerVSBot playerVSBot = new GamePlayerVSBot();
            playerVSBot.gamePlayerVSBot();
        }
    }
}
