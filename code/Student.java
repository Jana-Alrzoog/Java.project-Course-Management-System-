
package coursemanagmentsystem;

import java.io.*;
import javax.swing.JOptionPane;


public class Student implements Serializable{

//Attributes:
private int studentId;
private String name;
private int numberOfCourses;  
Course[] coursesList; 
//------------------------------------------Methods:
public Student(int studentId, String name){
this.studentId=studentId;
this.name=name;
coursesList=new Course[3];
}
//------------------------------------------
public boolean addCourse(Course course) { 
if (numberOfCourses < coursesList.length) { 
coursesList[numberOfCourses] = course;           
numberOfCourses++; 
return true;         
} 
else{
throw new CourseLimitExceededException("The maximum number of courses allowed has been reached");
}
} 
//
public int getStudentId(){
return studentId;
}
//------------------------------------------
public String getName(){
return name;
}
//------------------------------------------

public String toString(){
return "ID: "+studentId+", Name: "+name;
}
//////////////////////////////////////
//

public void save(String filename)throws IOException{
File out = new File(filename);
FileOutputStream fos=new FileOutputStream(out);
ObjectOutputStream file =new ObjectOutputStream(fos);

file.writeInt(numberOfCourses);

for(int j=0;j<numberOfCourses;j++){
file.writeObject(coursesList[j]);
}
file.close();
JOptionPane.showMessageDialog(null, "Save all infromation is done");
}

public boolean load(String fileName)throws IOException,ClassNotFoundException{
File o = new File(fileName);

    if(! o.exists()){
      return false;  
    }
    
    
FileInputStream fis  = new FileInputStream(o);
ObjectInputStream i = new ObjectInputStream(fis);


int size=i.readInt();

Course[]list=new Course[size];
for(int j=0;j<list.length;j++)
coursesList[j] = (Course) i.readObject();
i.close();
return true;
}
public Course[] getAllCourses() {          
return coursesList; 
}



public boolean removeCourse(String courseID) { 
for (int i = 0; i < numberOfCourses; i++) { 
if (coursesList[i].getCourseID().equals(courseID)) {                   

for (int j = i; j < numberOfCourses - 1; j++) {           
coursesList[j] = coursesList[j + 1]; 
} 

 coursesList[numberOfCourses - 1] = null; 
 numberOfCourses--;  
JOptionPane.showMessageDialog(null,"Course "+courseID+" removed succefully");
return true;  
} 
} 
JOptionPane.showMessageDialog(null,"Course "+courseID+" not found.");
return false;
//
} 
public int getNumOfOnlineCourses(){
int count=0;
for(int i=0;i<numberOfCourses;i++){
if(coursesList[i] instanceof OnlineCourse){
count++;
}
}
return count;
}

//-------------------------------------
public int getNumOfOfflineCourses(){
int count=0;
for(int i=0;i<numberOfCourses;i++){
if(coursesList[i] instanceof OfflineCourse){
count++;
}
}
return count;
}
public Course searchCourse(String courseID) {         
for (int i = 0; i < numberOfCourses; i++) {             
  if (coursesList[i].getCourseID().equals(courseID)) {         
return coursesList[i]; 
} 
} 
  return null; 
} 
}







