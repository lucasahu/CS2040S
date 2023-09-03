package PS0;

public class addingtrouble {
    static void checkAdd(int a, int b, int c) {
        if (a + b == c) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
    }

    public static void main(String[] args) {
        checkAdd(2, 3, 5);
        checkAdd(1, 1, 3);
        checkAdd(-1, 1, 0);
    }
}
