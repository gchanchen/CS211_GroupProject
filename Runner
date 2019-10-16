import java.util.*;
public class Runner{

   public static void main (String []args){
   
      System.out.println("This program is a tool to help you find what classes you can take this upcoming semester. Let's get started!");
      System.out.println("Enter all of the classes you have taken/are expected to pass in the following fashion: \"Department Symbol\"" + " " +  "\"Course Number\"");
      System.out.println("\t\t\t Like so: CS 211");
      System.out.println("Click enter following each course name. type \"STOP\" when you have no more classes to add");
      
      Scanner scanCourseNames = new Scanner(System.in);
      String course = scanCourseNames.nextLine();
      
      ListOfCourses a = new ListOfCourses();
      Course c;
      
      while (!(course.equals("stop"))){
         c = new Course(course, true);
         a.addCourse(c);
         course=scanCourseNames.nextLine();} 
      System.out.println();
      
      Database z = new Database();
      ArrayList <Course> f = z.getDatabase();
      
      // ListOfCourses canTake = new ListOfCourses();
      Course y;
      
      for (int i = 0; i < a.getList().size(); i++){
         y = a.getList().get(i);
         if (f.indexOf(y) >= 0)
            f.get(i).setTakenStatus(true);}
           
      for (int i = 0; i < f.size(); i++){
         System.out.print(f.get(i).getCourseName() + " ");
         System.out.println(f.get(i).getTakenStatus());}}
      
      }
   
  
