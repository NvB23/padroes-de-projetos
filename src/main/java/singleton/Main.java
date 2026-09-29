package singleton;

public class Main {
    public static void main(String[] args) {
        LogService.getInstance("Log 1...");
        LogService.getInstance("Log 2...");
        LogService.getInstance("Log 3...");
    }
}
