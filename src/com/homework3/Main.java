package com.homework3;

import java.util.*;

import com.homework3.basic.Book;
import com.homework3.basic.Student;
import com.homework3.util.DataUtil;
import com.homework3.basic.BookField;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number of task:");
        Scanner scanner = new Scanner(System.in);
        String inputTask = scanner.nextLine();

        switch (inputTask) {
            case ("1"):
                List<Book> books1 = DataUtil.generateOfLinkedList(20);

                System.out.println("***********Collection before removing**********");
                DataUtil.printCollections(books1);
                System.out.println("\n");
                System.out.println("Remove element: " + books1.remove(7) + "\n");
                System.out.println("**********Collection after removing**********");
                DataUtil.printCollections(books1);
                break;
            case ("2"):
                Set<Book> books2 = DataUtil.generateOfHashSet(25);

                System.out.println("***********Collection before sorting**********");
                DataUtil.printCollections(books2);
                System.out.println("______Vowels Name_____");
                DataUtil.searchVowelsName(books2);
                break;
            case ("3"):
                Set<Book> books3 = DataUtil.generateOfHashSet(25);

                System.out.println("**************Sorted HashSet by AuthorName: ");
                DataUtil.sortHashSetWithParams(books3, BookField.BOOKAUTHORNAME);

                System.out.println("**************Sorted HashSet by AuthorSurname: ");
                DataUtil.sortHashSetWithParams(books3, BookField.BOOKAUTHORSURNAME);

                System.out.println("**************Sorted HashSet by AuthorSecondName: ");
                DataUtil.sortHashSetWithParams(books3, BookField.BOOKAUTHORSECONDNAME);
                break;
            case ("4"):
                System.out.println("***********Collection before removing**********");
                Set<Student> students = DataUtil.generateOfTreeSet(20);
                DataUtil.printCollections(students);

                System.out.println("***********************");
                System.out.println("TreeSet after removing: ");
                System.out.println("***********************");

                DataUtil.deleteStudent(students);
                DataUtil.printCollections(students);
            default:
                System.out.println("Task is not found. Try again.");
                break;
        }
    }
}
