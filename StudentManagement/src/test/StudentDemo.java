package test;

import bean.Student;
import jdk.nashorn.internal.parser.JSONParser;
import service.StudentManagementSystem;

public class StudentDemo {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        int m1[] = {100,98,99,95};
        int m2[] = {98,97,97,96};
        int m3[] = {90,98,99,95};
        int m4[] = {99,98,99,95};

        Student s1 = new Student(1001,"Anu","Thanjavur","EEE",m1);
        Student s2 = new Student(1002,"Rev","Trichy","History",m2);
        Student s3 = new Student(1003,"Hiranmai","Chennai","ECE",m3);
        Student s4 = new Student(1004,"Venkat","Singapore","CSE",m4);

        System.out.println(s1.getName()+"is added to DB ? "+sms.addStudent(s1));
        System.out.println(s2.getName()+"is added to DB ? "+sms.addStudent(s2));
        System.out.println(s3.getName()+"is added to DB ? "+sms.addStudent(s3));
        System.out.println(s4.getName()+"is added to DB ? "+sms.addStudent(s4));

        sms.listStudents();

        Student s5 = new Student(1003,"vino","Papanasam","EEEE",m3);
        try{
        System.out.println(s5.getName()+"Is updated ? "+sms.updateStudent(s5.getRollNo(),s5));



    }
}
