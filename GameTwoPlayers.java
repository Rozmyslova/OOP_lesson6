public class GameTwoPlayers {
    public void gameTwoPlayers(){

        System.out.print("Первый игрок, ");
        PlayerName name1 = new PlayerName();
        String firstPlayer = name1.playerName();
        System.out.printf("Первый игрок - " + firstPlayer);
        System.out.println();
        System.out.print("Второй игрок, ");
        PlayerName name2 = new PlayerName();
        String secondPlayer = name2.playerName();
        System.out.printf("Второй игрок - " + secondPlayer);
        System.out.println();

        System.out.printf(firstPlayer + ", вы играете X, " + secondPlayer + ", вы играете O. Начнем игру! \n");

        String [] game_field;
        for (String s : game_field = new String[]{String.valueOf('1'), String.valueOf('2'), String.valueOf('3'), String.valueOf('4'), String.valueOf('5'), String.valueOf('6'), String.valueOf('7'), String.valueOf('8'), String.valueOf('9')}) {
        }
        FillGameField fillGame = new FillGameField();
        fillGame.fillField(game_field);

        String player;
        int turn = 1;
        while (turn < 10) {
            if (turn % 2 != 0) {
                System.out.println();
                System.out.printf(firstPlayer + ", твой ход \n");
                player = firstPlayer;
                String playerSymbol = "X";
                CorrectElement correctEl = new CorrectElement();
                correctEl.correctEnter(game_field, playerSymbol);
                fillGame.fillField(game_field);
            }
            else {
                System.out.println();
                System.out.printf(secondPlayer + ", твой ход \n");
                player = secondPlayer;
                String playerSymbol = "O";
                CorrectElement correctEl = new CorrectElement();
                correctEl.correctEnter(game_field, playerSymbol);
                fillGame.fillField(game_field);
            }
            if (turn > 4) {
                CorrectWin correctWin = new CorrectWin();
                if (correctWin.correctWin(game_field)){
                    System.out.println();
                    System.out.printf(player + ", вы выиграли! \n");
                    break;
                }  
            }
            if (turn == 9){
                System.out.println();
                System.out.print("Победила дружба! \n");
            }
            turn++;
        }
    }  
}

