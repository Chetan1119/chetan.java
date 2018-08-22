import java.util.Scanner;
 

public class Armstrong

{
   
public static void main(String args[])
   
{
      
int n, sum = 0, temp, rem, c = 0;
 
 
 Scanner s = new Scanner(System.in);
      
System.out.println("Input a number");      
      
n = s.nextInt();
 
      
temp = n;
 
      
while (temp != 0) 
{
         
c++;
         
temp = temp/10;
      
}
 
      
temp = n;
 
      
while (temp != 0) 
{
        
 rem = temp%10;
         
sum = sum + power(rem,c);
         
temp = temp/10;
      
}
 
      
if (n == sum)
         
System.out.println(n + " is an Armstrong number.");
      
else
         
System.out.println(n + " is not an Armstrong number.");         
   
}
 
   
static int power(int n, int r) 
{
      
int c, p = 1;
 
      
for (c = 1; c <= r; c++) 
         
p = p*n;
 
      
return p;   
   
}

}
