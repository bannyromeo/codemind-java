import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double r,a;
        r=sc.nextDouble();
        a=3.14*r*r;
        System.out.printf("%.2f",a);
    }
}