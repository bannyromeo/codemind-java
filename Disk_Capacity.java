import java.util.Scanner;
class capacity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,cap;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        cap=1024*a*b*c;
        System.out.println(+cap);
    }
}