package school.mjc.stage0.loops.task1;

public class Main {
    private static int count = 0;

    public static void main(String[] args) {
        Main main = new Main();
        main.repeatIsBad();
    }

    public void repeatIsBad() {
        if (count < 20) {
            System.out.println("Writing the same code doesn't have much impact, and it's also time-consuming");
            count++;
            repeatIsBad();
        }
        count = 0; // Reset count for future calls (optional)
    }
}
