/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.binita.filehandling.controller;

import com.binita.filehandling.entity.Student;
import com.binita.filehandlling.dao.StudentDAO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Bini
 */
public class StudentController {

    private Scanner input;
    StudentDAO studentDAO;

    public StudentController(Scanner input, StudentDAO studentDAO) {
        this.input = input;
        this.studentDAO = studentDAO;
    }

    private void menu() {

        System.out.println("1.add student");
        System.out.println("2.delete student");
        System.out.println("3.search student by id");
        System.out.println("4.show all student detail");
        System.out.println("5.write to file");
        System.out.println("6.exit");
        System.out.println("7.enter your choice from[1-5]");
    }

    private void add() {
        Student s = new Student();
        System.out.println("enter id:");
        s.setId(input.nextInt());
        System.out.println("enter name");
        s.setName(input.next());
        System.out.println("enter address");
        s.setAddress(input.next());
        System.out.println("enter level");
        s.setLevel(input.nextInt());
        System.out.println("enter status");
        s.setStatus(input.nextBoolean());
        studentDAO.insert(s);
        System.out.println("do you want to add more?[y/n]");
        if (input.next().equalsIgnoreCase("y")) {
            add();
        }
    }

    private void showAll() {
        studentDAO.getAll().forEach(s -> {

            System.out.println("id:" + s.getId());
            System.out.println("name:" + s.getName());
            System.out.println("address:" + s.getAddress());
            System.out.println("level:" + s.getLevel());
            System.out.println("status:" + s.isStatus());
        });

    }

    private void delete() {

        System.out.println("Are you sure you want to delete?" + "");
        if (input.next().equalsIgnoreCase("y")) {
            System.out.println("write id that you want to delete");
        }

        studentDAO.delete(input.nextInt());

        System.out.println("deleted successfully");

    }

    private void searchById() {

        System.out.println("enter id which you want to search?");

        Student students = studentDAO.getById(input.nextInt());

        if (students != null) {
            System.out.println("searched data");
            System.out.println("id" + students.getId());
            System.out.println("name" + students.getName());
            System.out.println("level" + students.getLevel());
            System.out.println("address" + students.getAddress());
        }
    }

    private void writeToFile() throws IOException {

        FileWriter writer = new FileWriter("C:/users/bini/Desktop/file1.txt");
        studentDAO.getAll().forEach((Student s) -> {
            try {
                writer.write(s.getId() + "" + s.getName() + "" + s.getAddress() + "" + s.getLevel() + "" + s.isStatus());
                 System.out.println(" written succefully");
                writer.close();
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());

            }
        });

    }

    public void process() throws IOException {
        while (true) {
            menu();
            int ch = input.nextInt();
            switch (ch) {

                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    searchById();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    writeToFile();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }

    }
}
