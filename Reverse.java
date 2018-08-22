import java.util.Scanner;
class Reverse
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int rev=0,r;
		while(num>0)
		{
		r=num%10;
		rev=rev*10+r;
		num=num/10;
		}
		System.out.println("Reverse of entered number:");
		System.out.println(rev);

}
}
