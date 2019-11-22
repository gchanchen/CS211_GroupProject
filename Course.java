public class Course{
   
   private String courseName;
   private int credit;
   private String [] preReqs;
      
   public Course(String courseName, int credit, String [] preReqs){
      this.courseName = courseName;
      this.credit = credit;
      this.preReqs = preReqs;}
   
   public String getCourseName(){
      return courseName;}
   
   public int getCredit(){
      return credit;} 
   
   public String[] getPreReqs(){
      return preReqs;}
      
   }
