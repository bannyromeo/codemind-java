import java.util.Scanner;
class indhu
{
    public int obe(int n,int arr[])
    {
        int i,count=0;
        for(i=1;i<n-1;i++)
        {
            /*first digit is even before and after digits 
            are odd*/
            if(arr[i]%2==0&&arr[i-1]%2==1&&arr[i+1]%2==1)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String ram[])
    {
        int n,i,res;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        indhu ar=new indhu();
        res=ar.obe(n,arr);
        System.out.print(res);
    }
}