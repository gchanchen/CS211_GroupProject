import java.util.ArrayList;

public class ListOfCourses{

   public ArrayList <Course> list;
   
   public ListOfCourses(){
      list = new ArrayList <Course>();}
      
   public ArrayList<Course> getList(){
      return list;}      
   
   public Course getCourse(int i){
      return list.get(i);}
      
   public void addCourse(Course c){
      list.add(c);}
   
   public void removeCourse(Course c){
      list.remove(c);}
   
   public void clear(){
      list.clear();}
         
   public int size(){
      return list.size();}
   
   public boolean contains(String name){
      for(Course x : list)
         if(name.equals(x.getCourseName()))
            return true;
      return false;}
         
   public String toString(){
      String str = "";
      for(Course c : list)
         str += c.getCourseName() + " [" + c.getCredit() + "]" + "\n";
         
      return str;}
   }
