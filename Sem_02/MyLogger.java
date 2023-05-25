package Sem_02;

import java.io.IOException;
import java.util.logging.*;

public class MyLogger {
    public static void main(String[] args) {
        try {

            Logger LOG = Logger.getLogger(MyLogger.class.getName());

            FileHandler fh = new FileHandler("mylog.log");

            LOG.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);

            LOG.setUseParentHandlers(false);

            LOG.log(Level.INFO, "Message");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
