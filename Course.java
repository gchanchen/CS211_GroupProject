public class Course{
   
   private String courseName;
   private int credit;
   private String [] preReqs;
      
   public Course(String courseName, int credit, String [] preReqs){
      this.courseName = courseName;
      this.credit = credit;
      this.preReqs = preReqs;}
   
   public Course(String courseName, int credit){
      this.courseName = courseName;
      this.credit = credit;
      this.preReqs = new String[0];}
   
   public String getCourseName(){
      return courseName;}
   
   public int getCredit(){
      return credit;} 
   
   public String[] getPreReqs(){
      return preReqs;}

      public boolean hasPreReqs(ListOfCourses hasTaken){
      for(int i = 0; i < preReqs.length; i++){
         if(!(preReqs[i].equals("none")) && !hasTaken.contains(preReqs[i]))
            return false;}
      return true;}
      
   }
