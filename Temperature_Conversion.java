import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double c,f;
        c=sc.nextDouble();
        f=32+(c*(1.8));
        System.out.printf("%.2f",f);
    }
}
