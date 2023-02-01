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
public class UnitLoader {
    
    private List<Unit> units;
    
    public UnitLoader(){
        createRecords();
    }
    
     public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }
    
    private void createRecords(){
        units = new ArrayList<>();
        Unit one = new Unit();
        one.setUnitCode("1134");
        one.setLevelNo("Level 1");
        one.setUnitName("Introduction to Databases");
        units.add(one);
        Unit two = new Unit();
        two.setUnitCode("1135");
        two.setLevelNo("Level 2");
        two.setUnitName("Client Server Networks");
        units.add(two);
        Unit three = new Unit();
        three.setUnitCode("1136");
        three.setLevelNo("Level 3");
        three.setUnitName("Advanced Java");
        units.add(three);
    }
    
}
