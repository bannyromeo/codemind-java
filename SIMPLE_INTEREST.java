import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r;
        float si;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        si=(p*t*r)/100;
        System.out.printf("%.0f",si);
    }
}