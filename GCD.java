/*
Given 2 numbers N,Q and an array of N integers, followed by Q queries each consisting of L,R. 
Find the GCD of numbers in [L,R].
Input Size : 1<=N<=100000
Example:
INPUT
5 2
1 2 3 4 5
1 2
4 5
OUTPUT
1
1  
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class GCD {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        int q=sc.nextInt();
        int[] gcd=new int[q];
        
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        
        for(int j=0;j<q;j++)
        {
            int pos1=sc.nextInt();
            int pos2=sc.nextInt();
            gcd[j]=gcd(array[pos1-1],array[pos2-1]);
        }
        System.out.println("Output :");
        for(int j=0;j<q;j++)
        {
            System.out.println(gcd[j]);
        } 
    }
    
    private static int gcd(int n1,int n2)
    {
        int gcd=1;
        for(int i=1;i<=n1&&i<=n2;i++)
        {
            if(n1%i==0 && n2%i==0)
                gcd=i;
        }
        return gcd;
    }
}
