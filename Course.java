public class Course{
   
   private String courseName;
   private boolean takenStatus;
   private int credit;
   
   public Course(){
      this("",false,0);}
      
   public Course(String courseName, boolean takenStatus, int credit){
      this.courseName = courseName;
      this.takenStatus = takenStatus;
      this.credit = credit;}
   
   public Course(String courseName){
      this.courseName = courseName;
      this.takenStatus = false;
      this.credit = 0;}
  
   public String getCourseName(){
      return courseName;}
      
   public boolean getTakenStatus(){
      return takenStatus;}
   
   public int getCredit(){
      return credit;}
      
   public void setCourseName(String courseName){
      this.courseName = courseName;}
      
   public void setTakenStatus(boolean takenStatus){
      this.takenStatus = takenStatus;} 
   
   public void setCredit(int credit){
      this.credit = credit;}
      
   }