package ch.hearc.ig.odi.moviemanager.exception;

/**
 * @author maxime.beck
 */
public class NullParameterException extends Exception {
    
    public NullParameterException() {
    }
    
    public NullParameterException (String message) {
        super(message);
    }
}
