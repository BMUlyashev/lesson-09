package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Дмитрий", "Воронин");
        Author author2 = new Author("Сергей", "Лукьяненко");
        Author author3 = new Author("Сергей", "Лукьяненко");

        Book firstBook = new Book("Трон Торна", author1, 2003);
        Book secondBook = new Book("Холодные берега", author2, 2004);
        Book thirdBook = new Book("Java. Руководство для начинающих", new Author("Герберт", "Шилдт"), 2018);
        Book foursBook = new Book("Трон Торна", author1, 2007);

        firstBook.setYearPublication(2015);

        System.out.println(firstBook.getAuthor());
        System.out.println(secondBook);
        System.out.println(author3.equals(author2));
        System.out.println(firstBook.equals(foursBook));

    }
}
