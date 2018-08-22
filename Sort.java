class Sort_Array
{
public static void main(String args[])
{
int[] a={1,1,1,1,0,0,1,0};
int i,j,t;
for(i=0;i<8;i++)
{
for(j=i;j<8;j++)
{
  if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
for(i=0;i<8;i++)
{
System.out.print(a[i]+" ");
}
}
}
