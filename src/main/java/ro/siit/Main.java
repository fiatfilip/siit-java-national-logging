package ro.siit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) throws Exception{
        int noOfEx = 0;
        while(noOfEx < 100) {
            //try {
                ExceptionGenerator.generateException();
            /*} catch (Exception e) {
                noOfEx++;
                // System.out.println(e.getMessage());
                logger.debug(e);
            }*/
        }

        logger.error("Gata programul");
    }
}
