
package coursemanagmentsystem;
import java.io.Serializable;
public class OfflineCourse extends Course implements Serializable {


    // Attributes
    private String Location;

    // Constructor
    public OfflineCourse(String courseID, String courseName, String Location) {
        super(courseID, courseName);
        this.Location = Location;
    }

    // Method to calculate price
    public double calculatePrice() {
        double price = 0;
        if (Location.equalsIgnoreCase("Home"))
            price = 300;
        else if (Location.equalsIgnoreCase("Academy"))
            price = 250;

        return price;
    }
public String getLocation(){
return Location;
}


    // Method to generate string representation of OfflineCourse
    public String toString() {
        return super.toString() + "\n" + "Location at: " + Location + "\n" + "Price: " + calculatePrice();
    }

}