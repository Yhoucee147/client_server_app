/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;

/**
 *
 * @author uchenna
 */
public class EnrolledUnit {
    
    private String studentId;
    private List<String> unitCode;
    

    public EnrolledUnit(){
        
    }
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<String> getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(List<String> unitCode) {
        this.unitCode = unitCode;
    }
    
    @Override
    public String toString() {
        return "EnrolledUnit{" + "studentId=" + studentId + ", unitCode=" + unitCode.toString() + '}';
    }
 
   
    
}
