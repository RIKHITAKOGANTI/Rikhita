//Program to calculate whether a given number is Happy Number or not.

import java.io.*;
import java.util.Scanner;
class HappyNumber {
public static void main(String args[]) {
int n,re,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
n=s.nextInt();
while(sum!=1)
{
sum=0;
while(n>0)
{
re=n%10;
sum=sum+(re*re);
n=n/10;
}
if(sum==1){
System.out.println("Happy number");
break;
}
if(sum==4)
{
System.out.println("Unhappy number");
break;
}
n=sum;
}
}
}

