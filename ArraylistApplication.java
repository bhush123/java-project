import java.util.*;



class student
{
   private int id;
   private String name;
   private int marks;
   
   public student()                   //right click ->source action -> generate default constuctr
   {
   }

   public student(int id, String name, int marks)         //right click ->source action ->generate argument constructor
   {
    this.id = id;
    this.name = name;
    this.marks = marks;
}

   public int getId() {                           //right click ->source action->generate setter getter
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getMarks() {
      return marks;
   }

   public void setMarks(int marks) {
      this.marks = marks;
   }



}





public class ArraylistApplication
{
    public static void main(String args[])   
    { 
      student s1=new student(1, "Bhushan", 100);            //user defined objects
      student s2=new student(2, "Divyani", 90);            
      student s3=new student(3, "Bhushan", 80);

         ArrayList al=new ArrayList();                                    // ArrayList collection 
         
         al.add(s1);                                                  //user defined objects stored in collection
         al.add(s2);
         al.add(s3);
       
         for(Object obj:al)               //for each method for data fetching from collection
         {                                 
                                       
            student s=(student)obj;    //we have to (cast)convert object class into student class here then we will get data from collection.
                                       //data fetches from collection in the form of object class.but here if we want fetch data from collectin then we have to convert object class into student class.
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks());
            

         }

         // Iterator i=al.iterator();            //this is the Iterator method for  data fetching from collection

         // while(i.hasNext())
         // {
         //    Object obj=i.next();
         //     student s=(student)obj;

         //    System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks());
         // }
         
   }
}



// public class ArraylistExxmple2
// {
//     public static void main(String args[])   
//     {
//          ArrayList al=new ArrayList();
         
//          al.add(new student(1, "Bhushan", 100));
//          al.add(new student(2, "Divyani", 90));
//          al.add(new student(3, "Bhushan", 80));
       
//          for(Object obj:al)
//          {
//             student s=(student)obj;

//             System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks());
            

//          }

            



         
//    }
// }
