
package coursemanagmentsystem;

public class CourseLimitExceededException extends RuntimeException{

public CourseLimitExceededException(){
super("The maximum number of courses allowed has been reached");
}
//------
public CourseLimitExceededException(String message){
super(message);
}
}
