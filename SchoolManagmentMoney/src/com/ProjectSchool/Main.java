package com.ProjectSchool;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        Teacher amairany = new Teacher(1,"Amirany" , 40500);
        Teacher carlos = new Teacher(2, "Carlos", 65000);
        Teacher john = new Teacher(3, "John", 56000);


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(amairany);
        teacherList.add(carlos);
        teacherList.add(john);



        Student jose = new Student(1, "Jose" ,4  );
        Student juliana = new Student(2, "Juliana" ,6  );
        Student armando = new Student(3, "Armando" ,12  );

        List<Student> studentList = new ArrayList<>();

        studentList.add(jose);
        studentList.add(juliana);
        studentList.add(armando);


        SchoolSystem mhs = new SchoolSystem(teacherList, studentList);

        jose.payFees(3000);
        juliana.payFees(600);

        System.out.println("MHS has earned a total $" + mhs.getTotalMoneyEarned());


        System.out.println(" $Salary Report Payout$ ");
        amairany.receiveSalary(amairany.getSalary());
        System.out.println("MHS has paid out 'salary' to: "+ amairany.getName()
        + "total amount recvied YTD: $" + mhs.getTotalMoneyEarned() );

        System.out.println("MHS has spent a total $" +mhs.getTotalMoneySpent());





    }

}


