package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Anagram 
{
    static boolean anagram;
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String testString=sc.next();
        String mainString="dhoni";
        System.out.println("Output : ");
        permuteAndCompare(testString,mainString,0,mainString.length()-1);
        if(anagram)
            System.out.println("yes");
        else
            System.out.println("no");
            
    }
    
    private static void permuteAndCompare(String testString,String mainString, int start, int end)
    {
        if (start == end)
        {
            if(mainString.equals(testString))
            {
                anagram=true;
            }
        }
        else
        {
            for (int i = start; i <= end && !anagram; i++)
            {
                mainString = swap(mainString,start,i);
                permuteAndCompare(testString,mainString, start+1, end);
                mainString = swap(mainString,start,i);
            }
        }
    }

    private static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
