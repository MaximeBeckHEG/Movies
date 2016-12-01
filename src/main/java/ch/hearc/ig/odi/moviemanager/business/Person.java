package ch.hearc.ig.odi.moviemanager.business;

import ch.hearc.ig.odi.moviemanager.exception.InvalidParameterException;
import ch.hearc.ig.odi.moviemanager.exception.NullParameterException;
import ch.hearc.ig.odi.moviemanager.exception.UniqueException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author maxime.beck
 */
public class Person {

    private Long id;
    private String firstName;
    private String lastName;
    private List<Movie> movies;

    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new ArrayList();
    }

    public Person(Long id, String firstName, String lastName, List<Movie> movies) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = movies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    // Méthodes
    public void addMovie(Movie movie) throws NullParameterException, UniqueException {
        if (movie == null)
            throw new NullParameterException();
        
        if (this.movies.contains(movie) || movie.getPersons().contains(this))
            throw new UniqueException();
        
        this.movies.add(movie);
    }

    public void removeMovie(Movie movie) throws NullParameterException, InvalidParameterException {
        if (movie == null)
            throw new NullParameterException();

        if (!this.movies.contains(movie) || !movie.getPersons().contains(this))
            throw new InvalidParameterException();
            
        this.movies.remove(movie);
    }
}
