/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0068;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author VICTUS
 */
public class ManageStudent {

    public void inputStudentInformation(List<Student> student) {
        
        while (true) {
            GetInput getData = new GetInput();
            String name = getData.getString("Name: ");
            String classes = getData.getString("Classes: ");
            float mark = getData.getFloat("Mark: ");
            student.add(new Student(name, mark, classes));
            if (!getData.getYesNo()) {
                break;
            }
        }
    }

    public List<Student> sortStudent(List<Student> students) {
        Collections.sort(students);
        return students;
    }

    public void display(List<Student> students) {
        int i = 1;
        for (Student student : students) {
            System.out.println("-------------Student " + i + "-------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Classes: " + student.getClasses());
            System.out.println("Mark: " + student.getMark());
        }
    }
}
