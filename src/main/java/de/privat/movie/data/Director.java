package de.privat.movie.data;

import javax.persistence.*;

/**
 * Contains the director from Movie
 */
@Entity
public class Director {

    @Id
    @OneToMany
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;


    public  Director (String firstName, String lastName){
        this.firstName = firstName;
        this.firstName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}
