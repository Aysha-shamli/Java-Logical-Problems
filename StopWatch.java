package Day6;

import java.util.Scanner;

public class StopWatch {
    public long startTime = 0;
    public long endTime = 0;
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        Scanner sc = new Scanner(System.in);
        System.out.print("Press 's' to start the stopwatch: ");
        String input = sc.nextLine();

        if (input.equals("s")) {
            stopwatch.start();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Stopwatch started. Press 'e' to end the stopwatch: ");
        String input1 = scanner.nextLine();

        if (input1.equals("e")) {
            stopwatch.stop();
            long timeElapsed = stopwatch.endTime - stopwatch.startTime;
            System.out.println("Stopwatch stopped. Elapsed time: " + timeElapsed + " milliseconds");
        }
    }
}
