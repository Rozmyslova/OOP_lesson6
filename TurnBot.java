import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class TurnBot {
    private static boolean checkCell(String element) {
        return !(Objects.equals(element, "X") | Objects.equals(element, "O"));
    }


    private boolean checkBotT = false;
    public void checkBotTurn(String[] field, String symbol){
        if ((field[1].equals(field[2]) & (field[0] != "X" & field[0] != "O")) || (field[4].equals(field[8]) & (field[0] != "X" & field[0] != "O")) || (field[3].equals(field[6]) & (field[0] != "X" & field[0] != "O"))) {
            field[0] = symbol;
        }
        else if ((field[0].equals(field[2]) & (field[1] != "X" & field[1] != "O"))  || (field[4].equals(field[7]) & (field[1] != "X" & field[1] != "O")) ) {
            field[1] = symbol;
        }
        else if ((field[1].equals(field[0]) & (field[2] != "X" & field[2] != "O"))  || (field[4].equals(field[6]) & (field[2] != "X" & field[2] != "O"))  || (field[5].equals(field[8]) & (field[2] != "X" & field[2] != "O")) ) {
            field[2] = symbol;
        }
        else if ((field[0].equals(field[6]) & (field[3] != "X" & field[3] != "O"))  || (field[4].equals(field[5]) & (field[3] != "X" & field[3] != "O")) ) {
            field[3] = symbol;
        }
        else if ((field[0].equals(field[8]) & (field[4] != "X" & field[4] != "O"))  || (field[1].equals(field[7]) & (field[4] != "X" & field[4] != "O"))  || (field[2].equals(field[6]) & (field[4] != "X" & field[4] != "O"))  || (field[2].equals(field[6]) & (field[4] != "X" & field[4] != "O"))  || (field[5].equals(field[3]) & (field[4] != "X" || field[4] != "O")) ) {
            field[4] = symbol;
        }
        else if ((field[8].equals(field[2]) & (field[5] != "X" & field[5] != "O"))  || (field[4].equals(field[3]) & (field[5] != "X" & field[5] != "O")) ) {
            field[5] = symbol;
        }
        else if ((field[0].equals(field[3]) & (field[6] != "X" & field[6] != "O"))  || (field[4].equals(field[2]) & (field[6] != "X" & field[6] != "O"))  || (field[7].equals(field[8]) & (field[6] != "X" & field[6] != "O")) ) {
            field[6] = symbol;
        }
        else if ((field[6].equals(field[8]) & (field[7] != "X" & field[7] != "O"))  || (field[4].equals(field[1]) & (field[7] != "X" & field[7] != "O")) ) {
            field[7] = symbol;
        }
        else if ((field[0].equals(field[4]) & (field[8] != "X" & field[8] != "O"))  || (field[2].equals(field[5]) & (field[8] != "X" & field[8] != "O"))  || (field[6].equals(field[7]) & (field[8] != "X" & field[8] != "O")) ) {
            field[8] = symbol;
        }
        else {
            do {
                int cell = ThreadLocalRandom.current().nextInt(0, 9);
                String element = field[cell];
                    if (!checkCell(element)){
                        System.out.println();
                    }
                    else {
                        field[cell] = symbol;
                        checkBotT = true;
                    }
            } while (!checkBotT); 
        } 
    }
}

