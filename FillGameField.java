public class FillGameField {
    public void fillField(String[] game_field){

        for (int i = 0; true; i++){
            System.out.print(" " + game_field[i * 3] + " " + "|" + " " + game_field[i * 3 + 1]+ " "+ "|"+ " " + game_field[i * 3 + 2]);
            if (i == 2){
                break;
            }
            System.out.println();
            System.out.println(" " + "__________");
        } 
    }
}
