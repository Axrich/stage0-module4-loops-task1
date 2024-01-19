package school.mjc.stage0.loops.task1;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.repeatIsBad(20);
    }

    public void repeatIsBad(int times) {
        if (times > 0) {
            System.out.println("Writing the same code doesn't have much impact, and it's also time-consuming");
            repeatIsBad(times - 1);
        }
    }
}
