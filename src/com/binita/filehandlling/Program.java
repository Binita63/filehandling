/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.binita.filehandlling;

import com.binita.filehandling.controller.StudentController;
import com.binita.filehandlling.dao.StudentDAO;
import com.binita.filehandlling.dao.impl.StudentDAOImpl;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Bini
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StudentDAO studentDAO=new StudentDAOImpl();
        Scanner input=new Scanner(System.in);
        
       StudentController sc=new StudentController(input, studentDAO);
       sc.process();
    }
    
}
