/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uchenna
 */
public class StudentLoader{
    
    private List<Student> students;
    
    public StudentLoader(){
        createRecords();
    }
  
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
     private void createRecords(){
        students = new ArrayList<>();
        Student stud1 = new Student();
        stud1.setStudentID("1001");
        stud1.setName("Rita");
        stud1.setAddress("57 wallstreet New York");
        stud1.setEmail("rita@gmail.com");
        students.add(stud1);
        Student stud2 = new Student();
        stud2.setStudentID("1002");
        stud2.setName("Rit2");
        stud2.setAddress("53 ghandi avenue New Delhi");
        stud2.setEmail("ritu@gmail.com");
        students.add(stud2);
        Student stud3 = new Student();
        stud3.setStudentID("1003");
        stud3.setName("Ada");
        stud3.setAddress("107 broadstreet Lagos");
        stud3.setEmail("ada@yahoo.com");
        students.add(stud3);
    }

}
