import java.util.*;
import java.util.ArrayList;
public class Runner2{

   public static void main (String []args){
      ListOfCourses database = new ListOfCourses();
         database.addCourse(new Course("CS 110",false)); // required
         database.addCourse(new Course("CS 112", false));
         database.addCourse(new Course("CS 211", false));
         database.addCourse(new Course("CS 262", false));
         database.addCourse(new Course("CS 306", false));
         database.addCourse(new Course("CS 310", false));
         database.addCourse(new Course("CS 330", false));
         database.addCourse(new Course("CS 367", false));
         database.addCourse(new Course("CS 471", false));
         database.addCourse(new Course("CS 483", false));
         database.addCourse(new Course("MATH 113", false)); // math
         database.addCourse(new Course("MATH 114", false));
         database.addCourse(new Course("MATH 213", false));
         database.addCourse(new Course("MATH 125", false));
         database.addCourse(new Course("MATH 203", false));
         database.addCourse(new Course("STAT 344", false));
         database.addCourse(new Course("CS 455", false)); // electives 1
         database.addCourse(new Course("CS 468", false));
         database.addCourse(new Course("CS 475", false));
      
      System.out.println("This program is a tool to help you find what classes you can take this upcoming semester. Let's get started!");
      System.out.println("Enter all of the classes you have taken/are expected to pass in the following fashion: \"Department Symbol\"" + " " +  "\"Course Number\"");
      System.out.println("\t\t\t Like so: CS 211");
      System.out.println("Click enter following each course name. type \"STOP\" when you have no more classes to add");
      
      Scanner scanCourseNames = new Scanner(System.in);
      String course = scanCourseNames.nextLine();   
      ListOfCourses listTaken = new ListOfCourses();
   
      while (!(course.equalsIgnoreCase("stop"))){
         listTaken.addCourse(new Course (course));
         course = scanCourseNames.nextLine();} 
      System.out.println();
      
      int indexOfPreReq;
      for(int i = 0; i < listTaken.size(); i++)
         if(database.indexOf(listTaken.get(i)) > 0){
            indexOfPreReq = database.indexOf(listTaken.get(i));
            database.get(indexOfPreReq).setTakenStatus(true);}  
            
      database.display();
  
      }}
   
  