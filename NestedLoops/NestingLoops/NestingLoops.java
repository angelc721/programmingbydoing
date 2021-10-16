//Nested Loops Nesting Loops 20 pts Angel Chuang
public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++ ) 
            {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            System.out.println();
        }

        System.out.println("\n");

    }
}
//1. The variable that changes faster in CN is in the inner loop
//2. If the order of the loop changes ("c" loop is on the inside and the "n" loop is on the outside), the alphabets will change faster than thte numbers. 
//3. The output of AB jump to the next line after displaying the text. (the outputs show one by one vertically)
//4. When the number of the outer loop changes, its pair of numbers will display on the next line. (1-1 1-2 1-3
//                                                                                                 2-1 2-2 2-3)