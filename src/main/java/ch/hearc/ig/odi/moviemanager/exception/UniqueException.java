package ch.hearc.ig.odi.moviemanager.exception;

/**
 * @author maxime.beck
 */
public class UniqueException extends Exception {

    public UniqueException() {
    }
    
    public UniqueException (String message) {
        super(message);
    }
}
