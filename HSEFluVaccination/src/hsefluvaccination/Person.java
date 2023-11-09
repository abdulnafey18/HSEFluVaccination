/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hsefluvaccination;

/**
 *
 * @author abdul.nafey18
 */
public class Person {
    private String sName;
    private Boolean sMedicalCondition;
    private Integer sAge;

    public Person() {
        sName = new String();
        boolean sMedicalCondition = true;
    }

    public void setsName(String sInName) {
        sName = sInName;
    }
    
    public void setsAge(Integer sInAge) {
        sAge = sInAge;
    }

    public String getsName() {
        return sName;
    }

    public Boolean getsMedicalCondition() {
        return sMedicalCondition;
    }

    public void setsMedicalCondition(Boolean sMedicalCondition) {
        this.sMedicalCondition = sMedicalCondition;
    }
    
    public Integer getsAge() {
        return sAge;
    }
}
