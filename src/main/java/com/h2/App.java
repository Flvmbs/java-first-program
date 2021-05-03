package com.h2;

/**
* Hello World!!
*
*/
public class App
{
    public static void main( string[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static int doubleTheNumber(int number) {
        // do it on module02
        // todo: fix the implementation
        // return -1;
        return 2 * number;
    }
    
    private static int add(int[] numbers) {
        var sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
           
                         
