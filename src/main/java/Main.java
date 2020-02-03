import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        DOMConfigurator.configure("log4j.xml");
        logger.debug("some debug message");
        logger.info("some info message");
        logger.warn("some warn message");
        logger.error("some error message");
    }

}
