package com.homework3.util;

import com.homework3.basic.Book;
import com.homework3.basic.Student;
import com.homework3.basic.BookField;

import java.util.*;

public class BookUtil {
    public static Book[] generateArray(int amountOfBooks) {
        String[] nameOfBooks = new String[]{"Hamlet", "A time to kill", "The sun also rises", "In cold blood", "The dark tower", "ABSALOM, ABSALOM!"};
        String[] authorName = new String[]{"Tomas", "Aleksandr", "Sergey", "Gugo", "James", "Robert"};
        String[] authorSurname = new String[]{"King", "Pyshkin", "Reeve", "Green", "Tolstoy", "Nabokov"};
        String[] authorSecondName = new String[]{"Viktorovich", "Petrov", "Alekseevich", "Yanovich", "Maksimovich", "Nikitovich"};
        int[] yearOfCreation = new int[]{1979, 1812, 1768, 1944, 1895, 1989};
        Book[] bookArray = new Book[amountOfBooks];
        Random random = new Random();

        for (int i = 0; i < amountOfBooks; i++) {
            if (i <= 6 && amountOfBooks > 6) {
                bookArray[i] = new Book(nameOfBooks[3], authorName[3], authorSurname[3], authorSecondName[3], yearOfCreation[3]);
            } else {
                bookArray[i] = new Book(
                        nameOfBooks[random.nextInt(nameOfBooks.length)],
                        authorName[random.nextInt(nameOfBooks.length)],
                        authorSurname[random.nextInt(nameOfBooks.length)],
                        authorSecondName[random.nextInt(nameOfBooks.length)],
                        yearOfCreation[random.nextInt(nameOfBooks.length)]);
            }
        }
        return bookArray;
    }

    public static LinkedList<Book> generateOfLinkedList(int amountOfBooks) {
        Book[] resultArray = generateArray(amountOfBooks);
        LinkedList<Book> books = new LinkedList<>();
        for (Book element : resultArray) {
            books.add(element);
        }
        return books;
    }

    public static HashSet<Book> generateOfHashSet(int amountOfBooks) {
        Book[] resultArray = generateArray(amountOfBooks);
        HashSet<Book> books = new HashSet<>();
        for (Book element : resultArray) {
            books.add(element);
        }
        return books;
    }

    public static void sortHashSetWithParams(Set<Book> books, BookField bookField) {
        List<Book> allBooks = new ArrayList<>(books);
        switch (bookField) {
            case BOOKAUTHORNAME:
                Comparator<Book> compareByAuthorName = new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getBookAuthorName().compareTo(o2.getBookAuthorName());
                    }
                };
                Collections.sort(allBooks, compareByAuthorName);
                BookUtil.printCollections(allBooks);
                break;
            case BOOKAUTHORSURNAME:
                Comparator<Book> compareByAuthorSurname = new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getBookAuthorSurname().compareTo(o2.getBookAuthorSurname());
                    }
                };
                Collections.sort(allBooks, compareByAuthorSurname);
                BookUtil.printCollections(allBooks);
                break;
            case BOOKAUTHORSECONDNAME:
                Comparator<Book> compareByAuthorSecondName = new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getBookAuthorSecondName().compareTo(o2.getBookAuthorSecondName());
                    }
                };
                Collections.sort(allBooks, compareByAuthorSecondName);
                BookUtil.printCollections(allBooks);
                break;
        }
    }

    public static Set<Student> generateOfTreeSet(int amountOfStudent) {
        String[] names = new String[]{"Ivan", "Petr", "Svetlana", "Kristina", "Ryslan", "Tom", "Maria", "Fedr", "Valentin", "Olga"};
        String[] surnames = new String[]{"Ivanov", "Popov", "Sedorov", "Kulesh", "Rubin", "Teshkevich", "Malech", "Fedorov", "Valevach", "Orlov"};
        int[] ages = new int[]{10, 11, 12};
        Random random = new Random();

        TreeSet<Student> students = new TreeSet<>();
        for (int i = 0; i < amountOfStudent; i++) {
            students.add(new Student(names[random.nextInt(names.length)],
                    surnames[random.nextInt(surnames.length)],
                    ages[random.nextInt(ages.length)]));
        }
        return students;
    }

    public static void deleteStudent(Set<Student> students) {
        Iterator<Student> it = students.iterator();
        int temp = 0;

        while (it.hasNext()) {
            Student element = it.next();
            if (temp % 2 != 0) {
                it.remove();
            }
            temp++;
        }
    }

    public static void searchVowelsName(Set<Book> books) {
        for (Book element : books) {
            if (element.getBookName().trim().substring(0, 1).matches("[AaEeUuIiOoYy]")) {
                System.out.println(element);
            }
        }
    }

    public static <T> void printCollections(Collection<T> books) {
        for (T element : books) {
            System.out.println(element);
        }
    }
}
