/*
This code is my own work. I did not get any help from any online source such as chegg.com; from a classmate, or any other person other than the instructor for this course. I understand that getting outside help from this course other than from the instructor will result in a grade of 0 in this assignment and other disciplinary actions for academic dishonesty.
name: zak rule
class: CSET 3600
instructor: Dr. Oluoch
homework: 7
date: 031821
summary: Write a simple program that accepts as input: a student’s 
name, Rocket number, Major, GPA, and bi-weekly paycheck. The program
stores the input and retrieves them on demand.
 */
public class StudentInfo {

    private String name;
    private int rnum;
    private String major;
    private double gpa;
    private double paycheck;

    public String setName(String name){
        return name;
    }
    public String setRNum(int rnum){
        return "R0" + rnum;
    }
    public String setMajor(String major){
        return major;
    }
    public void setGPA(double gpa){
        if(gpa < 0.0 || gpa > 4.0){
            throw new IllegalArgumentException("GPA must be between 0 and 4.");
        }
        this.gpa = gpa;
    }
    public void setPaycheck(double paycheck){
        if(paycheck < 0.0){
            throw new IllegalArgumentException("you can't have a negative paycheck.");
        }
        this.paycheck = paycheck;
    }
}
