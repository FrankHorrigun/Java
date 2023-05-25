package Sem_02;

import java.util.logging.*;


public class Mylogger2 {
    public static void main(String[] args) {
        Logger LOG2 = Logger.getLogger(Mylogger2.class.getName());
        // LOG2.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        LOG2.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);

        LOG2.log(Level.INFO, "MESSAGE");
        
    }
}
