public class Car 
{
    private double speed,regularPrice;
    private String color;
    Car(double s,double p,String c)
    {
        this.speed=s;
        this.regularPrice=p;
        this.color=c;
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
        this.weight=w;
    }
    public double getSaleprice()
    {
        if(weight>=2300)
            return super.getSalePrice()*0.9;
        else
            return super.getSalePrice()*0.8;
    }
}
