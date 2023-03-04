package Singleton;

import Singleton.Logger;

public class Runner {
    public static void main(String[] args) {
        Logger.getLogger().addLogInfo("First Log");
        Logger.getLogger().addLogInfo("Second Log");
        Logger.getLogger().addLogInfo("Third Log");
        Logger.getLogger().addLogInfo("Fourth Log");

        Logger.getLogger().showLogFile();
    }
}
