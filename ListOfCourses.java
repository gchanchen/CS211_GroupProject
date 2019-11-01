import java.util.ArrayList;

public class ListOfCourses{

   public ArrayList <Course> list;
   
   public ListOfCourses(){
      list = new ArrayList <Course>();}
      
   public ArrayList<Course> getList(){
      return list;}      
      
   public void addCourse(Course c){
      list.add(c);}
      
   public void removeCourse(Course c){
      list.remove(c);}
   
   public Course get(int index){
      return list.get(index);}
   
   public int indexOf(Course c){
      for(int i = 0; i< list.size(); i++){
         if (list.get(i).getCourseName().equals(c.getCourseName()))
            return i;  }
      return -1;}
      
   public int size(){
      return list.size();}
      
   public void display(){
      for (int i = 0; i < list.size(); i++){
         System.out.print(list.get(i).getCourseName() + " ");
         System.out.println(list.get(i).getTakenStatus());}}
   }