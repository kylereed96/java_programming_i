
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o != null && this.getClass() != o.getClass()) return false;
        Book b = (Book) o;
        return this.name.equals(b.name) && this.publicationYear == b.publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

}
