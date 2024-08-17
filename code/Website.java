
package coursemanagmentsystem;
 import java.io.*;
import javax.swing.JOptionPane;
public class Website implements Serializable{

         
// Attributes
private int websiteNum;  
// Constructor     
public Website( ) {          
websiteNum++;
}
// Methods
public int getwebsiteNum(){
return websiteNum;
}
public String toString(){
return "Website Number: "+ websiteNum;
}
}


 



