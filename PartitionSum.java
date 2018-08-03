/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class PartitionSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int number=sc.nextInt();
        int[] ab=new int[2];
        ab[0]=sc.nextInt();
        ab[1]=sc.nextInt();
        boolean possible=false;
        
        if(number%2==0 && number>ab[0] && number>ab[1])
            possible=sumToN(ab,number/2);
        
        System.out.println("Output : ");
        if(possible)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
    private static boolean sumToN(int[]ab,int sum)
    {
        int count[]=new int[sum + 1];
        count[0]=1;
        for(int i=1;i<=sum;i++)
            for(int j=0;j<ab.length;j++)
                if(i>=ab[j])
                {
                    count[i]+=count[i - ab[j]];
                }
        return count[sum]>0;  
    }
}
