public class Course{
   
   private String courseName;
   private boolean takenStatus;
   
   public Course(){
      this("",false);}
      
   public Course(String courseName, boolean takenStatus){
      this.courseName = courseName;
      this.takenStatus = takenStatus;}
  
   public String getCourseName(){
      return courseName;}
      
   public boolean getTakenStatus(){
      return takenStatus;}
      
   public void setCourseName(String courseName){
      this.courseName = courseName;}
      
   public void setTakenStatus(boolean takenStatus){
      this.takenStatus = takenStatus;} 
   }
