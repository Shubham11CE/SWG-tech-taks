import java.util.Scanner;

class Car 
{
    double speed,regularPrice;
    String color;
    Car(double s,double p,String c)
    {
        speed=s;
        regularPrice=p;
        color=c;
    }
    public double getSalePrice()
    {
        return regularPrice;
    }
}
class Truck extends Car
{
    double weight;
    Truck(double s,double p,double w,String c)
    {
        super(s,p,c);
        weight=w;
    }
    public double getSaleprice()
    {
        if(weight>2300)
        {double r=super.getSalePrice()*0.9;
            return r;}
        else{double r=super.getSalePrice()*0.8;
            return r;}
    }
}
public class Shubham
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed of the Truck : ");
        double sp=sc.nextDouble();
        System.out.println("Enter the regular price of the Truck : ");
        double pr=sc.nextDouble();
        System.out.println("Enter the color of the Truck : ");
        String co=sc.next();
        System.out.println("Enter the weight of the Truck : ");
        double wt=sc.nextDouble();
        Truck obj=new Truck(sp,pr,wt,co);
        System.out.println("Color: "+co);
        System.out.println("Speed: "+sp);
        System.out.println("Weight: "+wt);
        System.out.println("Price after appropriate discount: "+obj.getSaleprice());
        sc.close();
    }
}
