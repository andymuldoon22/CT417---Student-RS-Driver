/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycollege.student_rs_driver;

import com.mycollege.student_registration_system.Course;
import com.mycollege.student_registration_system.Module;
import com.mycollege.student_registration_system.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Andy
 */
public class main {
    
    
    
    public static void main(String [] args) throws ParseException{
        
        ArrayList<Student> StudentsInModule = new ArrayList<Student>();
        ArrayList<Student> StudentsInModule2 = new ArrayList<Student>();
        ArrayList<Student> StudentsInModule3 = new ArrayList<Student>();
        ArrayList<Student> StudentsInModule4 = new ArrayList<Student>();

        ArrayList<Module> ModulesInCourse = new ArrayList<Module>();
        ArrayList<Module> ModulesInCourse2 = new ArrayList<Module>();
        
        Student s1 = new Student("Andy", 22, 11111, "14/12/1994");
        Student s2 = new Student("Gary", 21, 11112, "01/01/1996");
        Student s3 = new Student("Conor", 22, 11113, "25/12/1994");
        Student s4 = new Student("Mark", 21, 11114, "21/02/1996");
        Student s5 = new Student("Jack", 22, 11115, "02/12/1994");
        Student s6 = new Student("Brian", 21, 11116, "31/07/1996");
        Student s7 = new Student("Luke", 22, 11117, "04/11/1994");
        Student s8 = new Student("Matthew", 21, 11118, "17/05/1996");
        Student s9 = new Student("John", 22, 11119, "04/01/1995");
        Student s10 = new Student("Eoin", 21, 11120, "11/09/1996");
        
        //Students in Module 1
        StudentsInModule.add(s1);
        StudentsInModule.add(s2);
        StudentsInModule.add(s3);
        StudentsInModule.add(s4);
        StudentsInModule.add(s5);
        
        //Students in Module 2
        StudentsInModule2.add(s1);
        StudentsInModule2.add(s2);
        StudentsInModule2.add(s3);
        StudentsInModule2.add(s4);
        StudentsInModule2.add(s5);
        
        //Students in Module 3
        StudentsInModule3.add(s6);
        StudentsInModule3.add(s7);
        StudentsInModule3.add(s8);
        StudentsInModule3.add(s9);
        StudentsInModule3.add(s10);
        
        //Students in Module 4
        StudentsInModule4.add(s6);
        StudentsInModule4.add(s7);
        StudentsInModule4.add(s8);
        StudentsInModule4.add(s9);
        StudentsInModule4.add(s10);

        
        Module m1 = new Module("Software Engineering III", "CT417", StudentsInModule);
        Module m2 = new Module("Cryptography", "CS402", StudentsInModule2);
        Module m3 = new Module("Software Engineering II", "CT5106", StudentsInModule3);
        Module m4 = new Module("Programming III", "CT326", StudentsInModule4);
        
        //Modules in Course 1
        ModulesInCourse.add(m1);
        ModulesInCourse.add(m2);
        
        //Modules in Course 2
        ModulesInCourse2.add(m3);
        ModulesInCourse2.add(m4);
        
        Date startdate = new GregorianCalendar(2017, Calendar.SEPTEMBER, 01).getTime();
        Date finishdate = new GregorianCalendar(2018, Calendar.MAY, 11).getTime();
        
        Course c1 = new Course("4BCT", ModulesInCourse, startdate, finishdate);
        Course c2 = new Course("3BCT", ModulesInCourse2, startdate, finishdate);
        
        
//        if (StudentsInModule.contains(s1))
//        System.out.println("Name: " + s1.getName() + ", Modules: " + m1.getModule() + ", Course: " + c1.getCourseName());
        
        c1.getModules();
        System.out.println("Course Name: " + c1.getCourseName());
        System.out.println("===================================");
        for (Module m : c1.getModules()){
        	System.out.println("Module Name: " + m.getModule());
        	System.out.println("Registered Students: ");
        	for (Student s : m.getStudents()){
        		System.out.println(s.getName());
        	}
        }
        
        System.out.println("Course Name: " + c2.getCourseName());
        System.out.println("===================================");
        for (Module m : c2.getModules()){
        	System.out.println("Module Name: " + m.getModule());
        	System.out.println("Registered Students: ");
        	for (Student s : m.getStudents()){
        		System.out.println(s.getName());
        	}
        }
    }

}
