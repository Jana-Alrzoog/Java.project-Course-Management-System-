
package coursemanagmentsystem;

import java.io.Serializable;
 import java.io.*;
import javax.swing.JOptionPane;
public abstract class Course implements Serializable{
//Attributes:
protected String courseID;
protected String courseName;
private int numOfStudents;
Student[]studentList;
//------------------------------------------Methods:
public Course(String courseID,String courseName){
this.courseID=courseID;
this.courseName=courseName;
studentList=new Student[15];
numOfStudents=0;
}
//------------------------------------------
public abstract double calculatePrice();

//------------------------------------------
public boolean addStudent(Student c){
if(numOfStudents<studentList.length)
{
studentList[numOfStudents++]=c;
return true;
}
else
return false;
}


//------------------------------------------
public String toString(){
return "the courseID is:"+courseID+", courseName is:"+courseName;
}
//--------------------------------
public int getStudentCount(){
return numOfStudents;
}
//------------------------------------------Getters and setters:
public String getCourseID(){
return courseID;
}
//------------------------------------------
public String getCourseName(){
return courseName;
}
public int getnumOfStudents(){
    return numOfStudents;
}


//------------------------------------------



}
//end


