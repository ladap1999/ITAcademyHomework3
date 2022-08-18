package com.homework3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number of task(1,2,3,4):");
        Scanner scanner = new Scanner(System.in);
        TaskRunner.runProject(scanner.nextLine());
    }
}
