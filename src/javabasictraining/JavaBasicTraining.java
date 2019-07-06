/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasictraining;

/**
 *
 * @author marlow
 */
public class JavaBasicTraining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intVariable = 99;
        byte byteVariable = 10;
        double doubleVariable = 5.5;
        String stringVariable = "Hello Marlow";
        boolean booleanVariable = false;
        Object[] objArray = new Object[]{intVariable, byteVariable, doubleVariable, stringVariable, booleanVariable};

        for (Object eachObj : objArray) {
            System.out.println(eachObj.toString());
        }

    }

}
