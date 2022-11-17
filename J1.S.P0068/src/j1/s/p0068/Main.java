/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0068;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VICTUS
 */
public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        ManageStudent manager = new ManageStudent();
        System.out.println("====== Collection Sort Program ======");
        System.out.println("Please input student information");
        //Step 1: user input student informations
        manager.inputStudentInformation(student);
        //Step 2: sort the student list by name
        student = manager.sortStudent(student);
        //Step 3: display the sorted student list
        manager.display(student);
    }
    
}
