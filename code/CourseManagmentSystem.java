
package coursemanagmentsystem;

import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;
public class CourseManagmentSystem {
public static void main(String[]args) throws IOException{

   MyFrame1 mainFrame = new MyFrame1() ;
   
 mainFrame.setVisible(true);
  /*
Scanner input = new Scanner(System.in);
Website website = new Website(3);
JOptionPane.showMessageDialog( null,"Welcome to the Academy!");
 String name = JOptionPane.showInputDialog("Please enter your name:");
 int ID = Integer.parseInt(JOptionPane.showInputDialog("Please enter your ID:"));
 Student s1 = new Student(ID, name);


int choice=0;
int count = 0;
Course Math;
Course Science;
Course English;
do{
//handling input

try {
choice = Integer.parseInt(JOptionPane.showInputDialog(
"Please enter the number of the action you'd like to perform: \n" +
 "1. Add Course\n" +
"2. Remove Course\n" +
"3. Search Course\n" +
"4. Calculate Price\n" +
"5. View number of online and offline courses\n" +
"6. Exit\n" +
"Enter your choice:"));
} catch (NumberFormatException e) {
JOptionPane.showMessageDialog(null, "Invalid choice format. Please enter a valid integer.");
}

count++;
int courseType;
switch(choice){
case 1:

String courseChoice = JOptionPane.showInputDialog(null,
"What course would you like to register in?\n1. Math\n2. Science\n3. English");

int choice2 = Integer.parseInt(courseChoice);
 count++;

switch (choice2) {
 case 1:
String attendChoice = JOptionPane.showInputDialog(null,
"How would you like to attend?\n1. Online\n2. Offline\nEnter your choice:");
courseType = Integer.parseInt(attendChoice);
if (courseType == 1) {
String platform = JOptionPane.showInputDialog(null,
"Would you like to use MicrosoftTeams or Zoom?");
try {
Course c1 = new OnlineCourse("1111", "Math", platform);
 website.addCourse(c1);
if (c1.addStudent(s1))
JOptionPane.showMessageDialog(null,
"Added Successfully! Your course ID is 1111 ");
} catch (CourseLimitExceededException e) {
 JOptionPane.showMessageDialog(null,
"The maximum number of courses allowed has been reached");
}
} else if (courseType == 2) {
 String location = JOptionPane.showInputDialog(null,
 "Would you like to attend at Home or Academy?");
try {
Course c2 = new OfflineCourse("1112", "Math", location);
 website.addCourse(c2);
if (c2.addStudent(s1))
JOptionPane.showMessageDialog(null,
"Added Successfully! Your course ID is 1112 ");
 } catch (CourseLimitExceededException e) {
 JOptionPane.showMessageDialog(null,"The maximum number of courses allowed has been reached");
}
} else {
   JOptionPane.showMessageDialog(null, "Invalid choice.");
}
 break;

}
 break;
case 2:
String removeID = JOptionPane.showInputDialog(null, "Enter the course ID to remove:");
website.removeCourse(removeID);
 break;
case 3:
 String searchID = JOptionPane.showInputDialog(null, "Enter the course ID to search:");
Course foundCourse = website.searchCourse(searchID);
if (foundCourse != null) {
JOptionPane.showMessageDialog(null, "Course Found: " + foundCourse);
} else {
 JOptionPane.showMessageDialog(null, "Course Not Found");
}
                    break;
 case 4:
String idForCalculate = JOptionPane.showInputDialog(null,
"Enter the course ID to calculate price:");
Course calculateCourse = website.searchCourse(idForCalculate);
if (calculateCourse != null) {
JOptionPane.showMessageDialog(null, "Price is: " + calculateCourse.calculatePrice());
} else {
 JOptionPane.showMessageDialog(null, "Course not found");
 }
  break;                  
case 5:
int numOfOnlineCourses = website.getNumOfOnlineCourses();
int numOfOfflineCourses = website.getNumOfOfflineCourses();
  JOptionPane.showMessageDialog(null,
"Number of online courses: " + numOfOnlineCourses + "\nNumber of offline courses: "
+ numOfOfflineCourses);
 break;

 case 6:
JOptionPane.showMessageDialog(null, "Exiting........");
break;

default:
JOptionPane.showMessageDialog(null, "Invalid choice, try again");
 }

}
while(choice !=6);
*/
}
}

