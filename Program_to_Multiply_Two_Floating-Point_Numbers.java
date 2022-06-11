import java.util.Scanner;
class multiply
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,p;
        a=sc.nextDouble();
        b=sc.nextDouble();
        p=a*b;
        System.out.printf("%.2f",p);
    }
}