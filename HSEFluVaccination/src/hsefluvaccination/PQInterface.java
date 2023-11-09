/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hsefluvaccination;

/**
 *
 * @author abdul.nafey18
 */
public interface PQInterface {
    
    public void enqueue(int sAge, Object person, boolean sMedicalCondition);

    public int findInsertPosition(int iNewKey);
    
    public int findInsertP(int sAge, boolean sMedicalCondition);
    
    public int size();

    public boolean isEmpty();

    public Object dequeue();

    public String printPQueue();

}
