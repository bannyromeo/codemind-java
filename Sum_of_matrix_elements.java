import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][];
        int i,j,r,c,sum=0;
        r=sc.nextInt();
        c=sc.nextInt();
        a=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
    }
}