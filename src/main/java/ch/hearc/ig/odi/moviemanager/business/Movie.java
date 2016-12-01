package ch.hearc.ig.odi.moviemanager.business;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maxime.beck
 */
public class Movie {
    private Long id;
    private String name;
    private String producer;
    private List<Person> persons;

    public Movie(Long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        persons = new ArrayList();
    }

    public Movie(Long id, String name, String producer, List<Person> persons) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.persons = persons;
    }    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }        
}
