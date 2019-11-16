public class Course{
   
   private String courseName;
   private int credit;
      
   public Course(String courseName, int credit){
      this.courseName = courseName;
      this.credit = credit;}
   
   public String getCourseName(){
      return courseName;}
   
   public int getCredit(){
      return credit;} 
   
   public void setCredit(int credit){
      this.credit = credit;}
      
   }
