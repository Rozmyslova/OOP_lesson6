public class GamePlayerVSBot {
    public void gamePlayerVSBot(){
        System.out.printf("Игрок, ");
        PlayerName name = new PlayerName();
        String player = name.playerName();
       
        System.out.printf(player + ", вы играете X, бот играет O. Начнем игру! \n");
        String [] game_field;
        for (String s : game_field = new String[]{String.valueOf('1'), String.valueOf('2'), String.valueOf('3'), String.valueOf('4'), String.valueOf('5'), String.valueOf('6'), String.valueOf('7'), String.valueOf('8'), String.valueOf('9')}) {
        }
        FillGameField fillGame = new FillGameField();
        fillGame.fillField(game_field);

        String bot = "Bot";
        String playerSymbol;
        int turn = 1;
        while (turn < 10) {
            if (turn % 2 != 0) {
                System.out.println();
                System.out.printf(player + ", твой ход \n");
                playerSymbol = "X";
                CorrectElement correctEl = new CorrectElement();
                correctEl.correctEnter(game_field, playerSymbol);
                fillGame.fillField(game_field);
            }
            else {
                System.out.println();
                System.out.print("Ход бота \n");
                playerSymbol = "O";
                TurnBot turnBot = new TurnBot();
                turnBot.checkBotTurn(game_field, playerSymbol);
                fillGame.fillField(game_field);
            }
            if (turn > 4) {
                CorrectWin correctWin = new CorrectWin();
                if (correctWin.correctWin(game_field)){
                    if (playerSymbol == "X"){
                        System.out.println();
                        System.out.printf(player + ", вы выиграли! \n");
                        break;
                    }
                    else {
                        System.out.println();
                        System.out.print("Победил бот! \n");
                        break;
                    }
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
