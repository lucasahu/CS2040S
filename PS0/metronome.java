package PS0;

public class metronome {
    static void revolutions(double ticks) {
        double result = ticks / 4;
        System.out.println(result);
    }

    public static void main(String[] args) {
        revolutions(16);
        revolutions(99);
    }
}
