package Singleton;

public class Logger {
    private static Logger logger;
    private static String logFile = "Это лог файл\n\n";
    public static synchronized Logger getLogger(){
        if(logger == null){
            logger = new Logger();
        }

        return logger;
    }

    private Logger(){

    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
