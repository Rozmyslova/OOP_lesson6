public class CorrectWin {

    private static boolean checkWinHorizontal(String[] field) {
        return field[0].equals(field[1]) && field[0].equals(field[2]) ||
                field[3].equals(field[4]) && field[3].equals(field[5]) ||
                field[6].equals(field[7]) && field[6].equals(field[8]);
    }
    
    private static boolean checkWinVertical(String[] field) {
        return field[0].equals(field[3]) && field[0].equals(field[6]) ||
                field[3].equals(field[4]) && field[3].equals(field[5]) ||
                field[6].equals(field[7]) && field[6].equals(field[8]); 
    }
    
    private static boolean checkWinDiagonals(String[] field) {
        return field[0].equals(field[4]) && field[0].equals(field[8]) ||
                field[2].equals(field[4]) && field[2].equals(field[6]);
    }
    
    public boolean correctWin(String[] field){
        if (checkWinDiagonals(field) || checkWinHorizontal(field) || checkWinVertical(field)){
            return true;
        }
        else {
            return false;
        }
    }
}

