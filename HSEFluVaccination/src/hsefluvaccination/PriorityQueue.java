/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hsefluvaccination;

import java.util.*;

/**
 *
 * @author abdul.nafey18
 */
public class PriorityQueue implements PQInterface {

    private ArrayList<PQElement> thePQueue;

    public PriorityQueue() {
        thePQueue = new ArrayList<PQElement>();
    }

    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    public int size() {
        return thePQueue.size();
    }

    //Here a new element with a given key is added along with element information which is added as well 
    public void enqueue(int sAge, Object person, boolean sMedicalCondition) {
        int iIndex;

        iIndex = findInsertP(sAge, sMedicalCondition);
        PQElement newElement = new PQElement(iIndex, (Person) person);
        newElement.setiKey(iIndex);
        int findInsertF;
        findInsertF = findInsertPosition(iIndex);

        if (iIndex == size()) {
            thePQueue.add(newElement);
        } else {
            thePQueue.add(findInsertF, newElement);
        }
    }
    //According to the priorirty provided it'll find the position where the new element will be added to the list in that order
        public int findInsertPosition(int iNewKey) {
        boolean bFound = false;
        int iPosition = 0;
        PQElement curElement;
        while (iPosition < thePQueue.size() && !bFound) {
            curElement = thePQueue.get(iPosition);
            if (curElement.getiKey() > iNewKey) {
                iPosition = iPosition + 1;
            } else {
                bFound = true;
            }
        }
        return iPosition;
    }
    //Based on Age Input, this rule will calculate priority
    public int findInsertP(int sAge, boolean sMedicalCondition) {
        int getP = 0;
         
            if (sAge >= 90) {
                getP = 10;
            } else if (sAge >= 80) {
                getP = 9;
            } else if (sAge >= 70) {
                getP = 8;
            } else if (sAge >= 65 && sAge <= 69) {
                getP = 7;
            } else if (sAge >= 55 && sAge <= 64) {
                getP = 5;
            } else if (sAge >= 45 && sAge <= 54) {
                getP = 4;
            } else if (sAge >= 30 && sAge <= 44) {
                getP = 3;
            } else if (sAge >= 18 && sAge <= 64 && sMedicalCondition == true) {
                getP = 6;
            } else if (sAge >= 18 && sAge <= 29) {
                getP = 2;
            } else {
                getP = 1;
            }
        
        return getP;
    }

    //This will remove the first element on the list, which has the highest priority
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    public String printPQueue() {
        String printString = new String();
        PQElement curElement;
        for (int iCount = 0; iCount < thePQueue.size(); iCount++) {
            curElement = thePQueue.get(iCount);
            printString = printString.concat(curElement.printPerson() + " , Priority = "+ curElement.getiKey() + "\n");
        }
        return printString;
    }
}
