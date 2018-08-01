package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class QuasiPalindrome {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String number=String.valueOf(sc.nextInt());
        boolean quasiPalindrome=false;
        for(int i=0;i<=trailingZeros(number)-leadingZeros(number);i++)
        {
            if(isPalindrome(number))
            {
                quasiPalindrome=true;
                break;
            }
            number="0"+number;
        }
        if(quasiPalindrome)
            System.out.println("Output :\nyes");
        else
            System.out.println("Output :\nno");
    }
    private static boolean isPalindrome(String number)
    {
        return number.equalsIgnoreCase((new StringBuilder(number).reverse()).toString());
    }
    private static int trailingZeros(String number)
    {
        String reverse=(new StringBuilder(number).reverse()).toString();
        return leadingZeros(reverse);
    }
    private static int leadingZeros(String number)
    {
        int count=0;
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)!='0')
                break;
            count++;
        }
        return count;
    }
}