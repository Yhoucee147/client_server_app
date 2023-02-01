/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package querrier;

import entities.EnrolledLoader;
import entities.EnrolledUnit;
import entities.Student;
import entities.StudentLoader;
import entities.Unit;
import entities.UnitLoader;
import java.util.List;

/**
 *
 * @author uchenna
 */
public class Querrier {
   
    public String checkEntities(String querryString){
        char first = querryString.charAt(0);
        
        String response = "No such entry";
        
        switch (first){
            case 's':
                String realStud = querryString.substring(1);
                StudentLoader stud = new StudentLoader();
                List<Student> studs = stud.getStudents();
                for (Student studd : studs){
                    String id = studd.getStudentID();
                    if(id.equals(realStud)){
                        System.out.println("Found");
                        response = studd.toString();
                    }
                }
                break;
            case 'u':
                String realUnit = querryString.substring(1);
                UnitLoader unit = new UnitLoader();
                List<Unit> units = unit.getUnits();
                for (Unit unitt: units){
                    String code = unitt.getUnitCode();
                    if(code.equals(realUnit)){
                        response = unitt.toString();
                    }
                }
                break;
            case 'e':
                String realEnroll = querryString.substring(1);
                EnrolledLoader enunit = new EnrolledLoader();
                List<EnrolledUnit> enunits = enunit.getEnUnits();
                for (EnrolledUnit enunitt: enunits){
                    String enrollID = enunitt.getStudentId();
                    if (enrollID.equals(realEnroll)){
                        response = enunitt.toString();
                    }
                }
                break;
        }
        
        return response;
    }
    
}
