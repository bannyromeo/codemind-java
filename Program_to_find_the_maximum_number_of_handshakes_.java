import java.util.Scanner;
class handshake
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,h;
        a=sc.nextInt();
        h=a*(a-1)/2;
        System.out.println(+h);
    }
}