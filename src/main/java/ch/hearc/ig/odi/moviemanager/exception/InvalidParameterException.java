package ch.hearc.ig.odi.moviemanager.exception;

/**
 * @author maxime.beck
 */
public class InvalidParameterException extends Exception {

    public InvalidParameterException() {
    }
    
    public InvalidParameterException (String message) {
        super(message);
    }
}
