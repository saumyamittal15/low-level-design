package chainofresponsibilitypattern;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int ERROR = 3;
    public static int DEBUG = 2;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor logProcessor){
        this.nextLogProcessor = logProcessor;
    }

    public void log(int logLevel, String message){
        if(nextLogProcessor != null){
            nextLogProcessor.log(logLevel, message);
        }
    }
}
