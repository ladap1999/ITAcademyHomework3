package com.homework3;

import com.homework3.basic.Book;
import com.homework3.basic.BookField;
import com.homework3.basic.Student;
import com.homework3.util.BookUtil;

import java.util.List;
import java.util.Set;

public class TaskRunner {
    public static void runProject(String inputTask){
        switch (inputTask) {
            case ("1"):
                List<Book> books1 = BookUtil.generateOfLinkedList(20);

                System.out.println("***********Collection before removing**********");
                BookUtil.printCollections(books1);
                System.out.println("\n");
                System.out.println("Remove element: " + books1.remove(7) + "\n");
                System.out.println("**********Collection after removing**********");
                BookUtil.printCollections(books1);
                break;
            case ("2"):
                Set<Book> books2 = BookUtil.generateOfHashSet(25);

                System.out.println("***********Collection before sorting**********");
                BookUtil.printCollections(books2);
                System.out.println("______Vowels Name_____");
                BookUtil.searchVowelsName(books2);
                break;
            case ("3"):
                Set<Book> books3 = BookUtil.generateOfHashSet(25);

                System.out.println("**************Sorted HashSet by AuthorName: ");
                BookUtil.sortHashSetWithParams(books3, BookField.BOOKAUTHORNAME);

                System.out.println("**************Sorted HashSet by AuthorSurname: ");
                BookUtil.sortHashSetWithParams(books3, BookField.BOOKAUTHORSURNAME);

                System.out.println("**************Sorted HashSet by AuthorSecondName: ");
                BookUtil.sortHashSetWithParams(books3, BookField.BOOKAUTHORSECONDNAME);
                break;
            case ("4"):
                System.out.println("***********Collection before removing**********");
                Set<Student> students = BookUtil.generateOfTreeSet(20);
                BookUtil.printCollections(students);

                System.out.println("***********************");
                System.out.println("TreeSet after removing: ");
                System.out.println("***********************");

                BookUtil.deleteStudent(students);
                BookUtil.printCollections(students);
            default:
                System.out.println("Task is not found. Try again.");
                break;
        }
    }
}

