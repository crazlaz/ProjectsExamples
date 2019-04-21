package com.ProjectSchool;

import java.util.List;

/**
 * going to be using arraylist so the list of students and
 * teachers can be changed whenever.
 *
 */

public class SchoolSystem {

    private List<Teacher>  teacher;
    private List<Student>  student;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    /**
     *  New school object (Student and Teachers) are created.
     */

    public SchoolSystem(List<Teacher> teachers , List<Student> student){
        this.teacher = teacher;
        this.student = student;

        totalMoneyEarned = 0;
        totalMoneySpent = 0;

    }





    public List<Teacher> getTeacher() {
        return teacher;
    }

    /**
     * adds a teacher to the school
     * @param teacher the teacher that is going to be added.
     */

    public void addTeacher(Teacher teacher) {
        teacher.add(teacher);

    }

    /**
     *  add student to the list (can also take away (once graduated))
     * @return
     */

    public List<Student> getStudent() {
        return student;
    }

    public void addStudent(Student student) {
        student.add(student);
    }

    /**
     *
     * @return returns the money earned by schools
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }


    /**
     *
     * @return returns the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent -= MoneySpent;
    }


}
