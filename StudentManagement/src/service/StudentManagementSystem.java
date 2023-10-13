package service;

import bean.Student;
import exception.StudentDoesntExist;
import util.StudentMgmtInterface;

import java.util.ArrayList;

public class StudentManagementSystem implements StudentMgmtInterface {

    private ArrayList<Student> StudentArray = new ArrayList<>(10);

    private static int c = 1;
    @Override
    public boolean addStudent(Student s) {
        if(c <=10)
        {
            StudentArray.add(s);
            c++;
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteStudent(long rollNo) throws StudentDoesntExist {
        for(Student i : StudentArray)
        {
            if(i.getRollNo() == rollNo)
            {
                StudentArray.remove(i);
                return true
            }
        }
        throw new StudentDoesntExist(String.valueOf(rollNo));
    }

    @Override
    public void listStudents() {
        for (Student i : StudentArray)
        {
            System.out.println(i);
        }
    }

    @Override
    public boolean updateStudent(long rollNo, Student std) throws StudentDoesntExist {
        int i=0;
        for(Student j : StudentArray)
        {
            if(j.getRollNo() == rollNo)
            {
              StudentArray.set(i,std);
            }
            i++;
        }
       throw new StudentDoesntExist(String.valueOf(rollNo));
    }

    @Override
    public Student findTopper() {
        int total[] = new int[10];
        int i =0;
        for(Student j : StudentArray)
        {
            int mar[] = j.getMarks();
            total[i] = 0;
            for(int m:mar)

        }
        return null;
    }
}
