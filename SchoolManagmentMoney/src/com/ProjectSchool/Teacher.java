package com.ProjectSchool;

public class Teacher {

    /**
     * @parm id - Id of the
     * @parma String = name of the teacher
     * @parma Salary - amount of money a person will  get
     */

    private int id;
    private String name;
    private int Salary;
    private int salaryEarned;

    public Teacher(int id, String name, int Salary) {


        this.id = id;
        this.name = name;
        this.Salary = Salary;
        this.salaryEarned = 0;

    }


    public int getid() {
        return id;
    }

    public String getName() {

        return name;
    }

    public int getSalary() {

        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }


    public void add(Teacher teacher) {
    }

    /**
     * Adds to salary
     *
     * @param salary removes money from MHS money earned section
     */

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        SchoolSystem.updateTotalMoneySpent(salary);



    }
}
