import java.util.Scanner;

class Student
{
    private String name;
    private int rollNo;                      
    private double marks, attendance;

    Student()
{
    name="";
    rollNo=0;                 
    marks=0.0;
    attendance=0.0;
}
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getRollNo()
    {
        return rollNo;
    }
    public void setRollNo(int rn)
    {
        
        rollNo=rn;
    }
    public double getMarks()
    {
        return marks;
    }
    public void setMarks(double m)
    {
        if(m<0){marks=0.0;}
        else{ marks=m;}
    }
    public double getAttendance()
    {
        return attendance;
    }
    public void setAttendance(double att)
    {
        attendance=att;
    
    }
}

class StudentTest 
{
public static void main(String args[]) 
    {
          Student ob1 = new Student();
          Student ob2 = new Student();
          Scanner sc = new Scanner(System.in);
    
          try { for (int i = 1; i <= 2; i++) 
        {
          System.out.println("Enter the name of Student"+i +":");
          String n = sc.nextLine();
          System.out.println("Enter Roll no. : ");
          int rn = sc.nextInt();
          if(rn<=0)
        {
           System.out.println("Invalid Input!(roll no is negative)");
           System.exit(0);
        }
          System.out.print("Enter Attendance(in percentage) : ");
          double att = sc.nextDouble();
          if(!(att>=0.0 && att<=100.0))
        {
          System.out.println("Invalid Input!(0.0<=percentage of attendence<=100.0)");
          System.exit(0);
        }
          System.out.print("Enter marks out of 100.0 : ");
          double m = sc.nextDouble();
          sc.nextLine();
          if (i == 1) 
        {
          ob1.setName(n);
          System.out.println("Name = " + ob1.getName());
          ob1.setRollNo(rn);
          System.out.println("Roll No. = " + ob1.getRollNo());
          ob1.setAttendance(att);
          System.out.println("Attendance = " + ob1.getAttendance());
          ob1.setMarks(m);
          System.out.println("Marks = " + ob1.getMarks());
          if (att > 75)
          {
            m = 1.1 * m;
            if (m > 100.0){
                m = 100.0;}
            ob1.setMarks(m);
            System.out.println("Marks after increment = " + ob1.getMarks());
          }
        }
          if (i == 2) 
        {
          ob2.setName(n);
          System.out.println("Name = " + ob2.getName());
          ob2.setRollNo(rn);
          System.out.println("Roll No. = " + ob2.getRollNo());
          ob2.setAttendance(att);
          System.out.println("Attendance = " + ob2.getAttendance());
          ob2.setMarks(m);
          System.out.println("Marks = " + ob2.getMarks());
          if (att > 75) 
          {
          m = 1.1 * m;
          if (m > 100.0){
          m = 100.0;}
          ob2.setMarks(m);
          System.out.println("Marks after increment = " + ob2.getMarks());
          }
        }  
          System.out.println();
        }
        } catch (Exception e) {
          System.out.print("Exception = " + e);
        } 
          finally
        {
          sc.close();
        }
    }  
}








