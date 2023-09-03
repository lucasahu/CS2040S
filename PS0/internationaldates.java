package PS0;

public class internationaldates {
    static void getFormat(String date) {
        String[] dateNumbers = date.split("/", 0);

        String firstSlot = dateNumbers[0];
        String secondSlot = dateNumbers[1];

        Integer firstNum = Integer.parseInt(firstSlot);
        Integer secondNum = Integer.parseInt(secondSlot);
        if ((firstNum > 12) && (secondNum < 12)) {
            System.out.println("EU");
        } else if ((firstNum < 12) && (secondNum > 12)) {
            System.out.println("US");
        } else {
            System.out.println("either");
        }
    }

    public static void main(String[] args) {
        getFormat("25/03/2023");
        getFormat("04/02/2023");
        getFormat("07/23/1972");
    }
}
