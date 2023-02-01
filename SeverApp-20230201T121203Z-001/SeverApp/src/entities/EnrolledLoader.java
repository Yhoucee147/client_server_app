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
public class EnrolledLoader {
    
    private List<EnrolledUnit> enUnits;
    
    public EnrolledLoader(){
        addRecords();
    }
    
     public List<EnrolledUnit> getEnUnits() {
        return enUnits;
    }

    public void setEnUnits(List<EnrolledUnit> enUnits) {
        this.enUnits = enUnits;
    }
    
     private void addRecords(){
        enUnits = new ArrayList<>();
        List<String> stud1Units = new ArrayList<>();
        stud1Units.add("1134");
        stud1Units.add("1135");
        EnrolledUnit stud1 = new EnrolledUnit();
        stud1.setStudentId("1001");
        stud1.setUnitCode(stud1Units);
        enUnits.add(stud1);
        List<String> stud2Units = new ArrayList<>();
        stud2Units.add("1135");
        stud2Units.add("1136");
        EnrolledUnit stud2 = new EnrolledUnit();
        stud2.setStudentId("1002");
        stud2.setUnitCode(stud2Units);
        enUnits.add(stud2);
        List<String> stud3Units = new ArrayList<>();
        stud3Units.add("1134");
        stud3Units.add("1136");
        EnrolledUnit stud3 = new EnrolledUnit();
        stud3.setStudentId("1003");
        stud3.setUnitCode(stud3Units);
        enUnits.add(stud3);
    }

    
}
