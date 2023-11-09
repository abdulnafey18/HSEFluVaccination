/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hsefluvaccination;

/**
 *
 * @author abdul.nafey18
 */
public class PQElement {

    private int iKey;
    private Person person;

    public PQElement(int iKey, Person person) {
        this.iKey = iKey;
        this.person = person;
    }

    public int getiKey() {
        return iKey;
    }

    public Person getPerson() {
        return person;
    }

    public void setiKey(int iKey) {
        this.iKey = iKey;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String printPerson() {
        String sMessage;
        sMessage = "Name = " + person.getsName() + " , Medical Condition = " + person.getsMedicalCondition() + " , Age = " + person.getsAge();
        return sMessage;
    }
}
