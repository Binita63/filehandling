/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.binita.filehandlling.dao.impl;



import com.binita.filehandling.entity.Student;
import com.binita.filehandlling.dao.StudentDAO;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bini
 */
public  class StudentDAOImpl implements StudentDAO{
private List<Student> studentlist=new ArrayList<>();


    @Override
    public boolean insert(Student s) {
        return studentlist.add(s);
    }

    @Override
    public boolean delete(int id) {
       Student s= getById(id);
       if(s!=null){
      return studentlist.remove(s);
       }
       return false;
    }

    @Override
    public Student getById(int id) {
        for( Student s:studentlist )
        {
        if (s.getId()==id){
        return s;
        }
       
        }
         return null;
    }

    @Override
    public List<Student> getAll() {
       return studentlist;
    }

   
    

    
    

    

      

}

    
    

