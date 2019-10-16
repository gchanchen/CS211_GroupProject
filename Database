import java.util.ArrayList;

public class Database{
   public static ArrayList <Course> preReq = new ArrayList <Course>();
   {{
  
   // REQUIRED CS
   preReq.add(new Course("CS 110", false));
   preReq.add(new Course("CS 112", false));
   preReq.add(new Course("CS 211", false));
   preReq.add(new Course("CS 262", false));
   preReq.add(new Course("CS 306", false));
   preReq.add(new Course("CS 310", false));
   preReq.add(new Course("CS 330", false));
   preReq.add(new Course("CS 367", false));
   preReq.add(new Course("CS 471", false));
   preReq.add(new Course("CS 483", false));
   
   // REQUIRED MATH
   preReq.add(new Course("MATH 113", false));
   preReq.add(new Course("MATH 114", false));
   preReq.add(new Course("MATH 213", false));
   preReq.add(new Course("MATH 125", false));
   preReq.add(new Course("MATH 203", false));
   preReq.add(new Course("STAT 344", false));
   
   // ELECTIVES 1
   preReq.add(new Course("CS 455", false));
   preReq.add(new Course("CS 468", false));
   preReq.add(new Course("CS 475", false));
   
   }};
   
   public ArrayList<Course> getDatabase(){
      return preReq;}
      
   public void changeStatus(Course c, boolean b){
      int i = preReq.indexOf(c);
      preReq.get(i).setTakenStatus(b);
      System.out.println("set");}      
   
   public void display(){
      for (int i = 0; i < preReq.size(); i++){
         System.out.print(preReq.get(i).getCourseName() + " ");
         System.out.println(preReq.get(i).getTakenStatus());}}
   }
