import java.util.Objects;

public class Book {
    private String name;
    public Author author;
    private int yearOfPublishing;

    public Book(String name, Author author, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
       return this.author;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    @Override
    public String toString() {
        return "\"" + name + "\", автор " + author.toString() + ", год выпуска " + yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublishing);
    }
}