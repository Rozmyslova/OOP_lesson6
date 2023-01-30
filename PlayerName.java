import java.util.Scanner;

public class PlayerName {
    public String playerName(){
        System.out.printf("как вас называть? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }
} 



