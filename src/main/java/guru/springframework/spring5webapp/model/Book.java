package guru.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tile;

    private String isbn;

    @ManyToMany
    @JoinTable(name = "author_book",
            joinColumns = "book_id",
            inverseJoinColumns = "author_id")
    private Set<Author> authors;

    public Book(final String tile, final String isbn, final Set<Author> authors) {
        this.tile = tile;
        this.isbn = isbn;
        this.authors = authors;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(final String tile) {
        this.tile = tile;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(final String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(final Set<Author> authors) {
        this.authors = authors;
    }
}
