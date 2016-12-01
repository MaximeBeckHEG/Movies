package ch.hearc.ig.odi.moviemanager.business;

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
    public void addMovie(Movie movie) {
        // TODO implement
        throw new UnsupportedOperationException();
    }
    
    public void removeMovie(Movie movie) {
        // TODO implement
        throw new UnsupportedOperationException();
    }
}