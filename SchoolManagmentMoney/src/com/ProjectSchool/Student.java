package com.ProjectSchool;

public class Student {

    public Object payFees;
    private int id;
    private String name;
    private int grade;    //subject to change for those who do bad xD
    private int FeesPaid; //subject to change
    private int FeesTotal;

    /**   Create a new student by inititaling id, name ,grade
     *    Fee's paid  - 0 if student has not paid nothing
     *    Fee's total - total number of fee to paid
     *
     *
     */


    public Student(int id, String name, int grade) {

        //every student pays $$$ to enter the school

        FeesPaid = 0;
        FeesTotal = 3000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    /**
     * Used to update students grade
     * @param grade grade is new grade that will be added in to the sutdents
     */

    public void setgrade(int grade) {
        this.grade = grade;

    }



    /**
     * The school revcieved amount --- will be subjected from total
     * @param fees   update the amound paid and will show fee total:
     */

    public void payFees(int fees){

        FeesPaid =+ fees;

        SchoolSystem.updateTotalMoneyEarned(FeesPaid);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return FeesPaid;
    }

    public int getFeesTotal() {
        return FeesTotal;
    }


    //returns the reamining fees

    public int getFees() {

      return  FeesTotal - FeesPaid;
    }


    public void add(Student student) {
    }
}
