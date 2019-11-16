import java.util.ArrayList;

public class ListOfCourses{

   public ArrayList <Course> list;
   
   public ListOfCourses(){
      list = new ArrayList <Course>();}
      
   public ArrayList<Course> getList(){
      return list;}      
      
   public void addCourse(Course c){
      list.add(c);}
   
   //needed?   
   public void removeCourse(Course c){
      list.remove(c);}
      
   public int size(){
      return list.size();}
         
   public String toString(){
      String str = "";
      for(Course c : list)
         str += c.getCourseName() + " [" + c.getCredit() + "]" + "\n";
         
      return str;}
   }
