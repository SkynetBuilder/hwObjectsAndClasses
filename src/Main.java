public class Main {
    public static void main(String[] args) {
        Author fyodorDostoevsky = new Author("Фёдор", "Достоевский");
        Author levTolstoy = new Author("Лев", "Толстой");
        Book crimeAndPunishment = new Book("Преступление и наказание", fyodorDostoevsky, 1866);
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);
        Book idiot = new Book("Идиот", fyodorDostoevsky, 1869);
        warAndPeace.setYearOfPublishing(1869);
    }
}