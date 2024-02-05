public class shapes
{
    public double traingle(double h, double b)
    {   return(0.5*b*h);
        
    }
    public float rectangle(float l, float b)
    {
        return (l*b);
    }
    public double circle(double r)
    {
        return (3.142*r*r);
    }

    public int square(int a)
    {
        return (a*a);
    }
    public static void main(String[] args)
    { double res1;
        float res2;
        double res3;
        int res4;
        shapes s1=new shapes();
     res1=s1.traingle(3,6);
     System.out.println("the area of traingle is " +res1);
     res2=s1.rectangle(7,8);
     System.out.println("the area of rectangle is " +res2);
     res3=s1.circle(8);
     System.out.println("the area of circle is " +res3);
     res4=s1.square(8);
     System.out.println("the area of square is is " +res4);

    }


}