
package coursemanagmentsystem;
import java.io.Serializable;
public class OnlineCourse extends Course implements Serializable {


//Attributes:
private String Platform;
//------------------------------------------Methods:
public OnlineCourse (String courseID,String courseName, String Platform)
{
super(courseID,courseName);
this.Platform = Platform;

}
//------------------------------------------

public double calculatePrice()
{
double price = 0;
if(Platform.equalsIgnoreCase("Zoom"))
price = 150;
else
if(Platform.equalsIgnoreCase("MicrosoftTeams"))
price = 100;

return price;
}

//------------------------------------------
public String getPlatform(){
return Platform;
}


public String toString()
{
return super.toString() + "\n"+ "Platform used: "+ Platform + "\n"+ "Price: " + calculatePrice();

}
}

