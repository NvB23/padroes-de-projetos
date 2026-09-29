package singleton;

public class LogService {
    private static LogService INSTANCE;

    private LogService(String log) {
        System.out.println(log);
    }

    public static LogService getInstance(String log) {
        if (INSTANCE == null) {
            INSTANCE = new LogService(log);
            return INSTANCE;
        }
        return INSTANCE;
    }
}
