//If statement Else and If 20 pts Angel Chuang
public class ElseAndIf
{
    public static void main( String[] args )
    {
        int people = 30;
        int cars = 40;
        int buses = 15;

        if ( cars > people )
        {
            System.out.println( "We should take the cars." );
        }
        else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
        else //else is use to specify a block of code to be executed if the same condition is false.
        //it make no difference if this else part is removed, since cars > people is true and it will only execute the if part.
        {
            System.out.println( "We can't decide." );
        }
        if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars ) //else if is use to specify a new condition to test if the first condition is false. 
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}
		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

    }
}
