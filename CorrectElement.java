import java.util.Objects;
import java.util.Scanner;

public class CorrectElement {
    private static boolean checkCell(String element) {
        return !(Objects.equals(element, "X") | Objects.equals(element, "O"));
    }

    private int cell;
    private boolean checkEnter = false;
    public void correctEnter(String[] field, String symbol){
        do {
            System.out.println("Введите номер ячейки на игровом поле, куда вы хотите поставить символ: ");
            Scanner sc = new Scanner(System.in);
            while (!sc.hasNextInt()){
                System.out.print("Вы ввели не число! Введите цифру от 1 до 9. Ваш выбор: ");
                sc.next();
            }
            cell = sc.nextInt();
            if (cell < 1 | cell > 9) {
                System.out.print("Такой ячейки нет \n");
            }
            else {
                String element = field[cell - 1];
                if (!checkCell(element)){
                    System.out.print("Эта ячейка занята. Выберете другую.");
                }
                else {
                    field[cell - 1] = symbol;
                    checkEnter = true;
                }
            }
        } while (!checkEnter);
    }

    public int getCell() {
        return cell;
    }
    public void setCell(int cell) {
        this.cell = cell;
    }
    public boolean isCheckEnter() {
        return checkEnter;
    }
    public void setCheckEnter(boolean checkEnter) {
        this.checkEnter = checkEnter;
    }
}
