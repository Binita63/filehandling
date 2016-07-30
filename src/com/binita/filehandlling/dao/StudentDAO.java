/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.binita.filehandlling.dao;

import com.binita.filehandling.entity.Student;
import java.util.List;

/**
 *
 * @author Bini
 */
public interface StudentDAO {
    boolean insert(Student s);
    boolean delete(int id);
    Student getById(int id);
    List <Student> getAll();

   
     
            
}
