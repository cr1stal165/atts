package edu.csf.oop.java.chess.logging;

import edu.csf.oop.java.chess.Game.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

    public static Logger logger = LoggerFactory.getLogger(
            Main.class);

    public static void main(String[] args){
        logging();
    }

    public static void logging(){
        logger.info("INFO:");
        logger.debug("Message for debug level.");
        logger.error("Error: ");
        logger.trace("Trace: ");
        logger.warn("That Warning: ");
    }

}
