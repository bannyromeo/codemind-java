import java.util.Scanner;
class indhu
{
    public void bp(int a,int b)
    {
        int i,j;
        for(i=a+b+1;i<1000;i++)
        {
            int count=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                   count++;
                }
     }
            if(count==0)
            {
               System.out.print(i-a-b);
               break;
            }
        }
    }
    public static void main(String ram[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        indhu n=new indhu();
        n.bp(a,b);
    }
}