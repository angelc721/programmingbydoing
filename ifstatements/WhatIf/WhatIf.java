//If Statements What If 15 pts Angel Chuang
public class WhatIf
{
    public static void main( String[] args )
    {
        int people = 20;
        int cats = 20;
        int dogs = 15;
        if ( people < cats )  //if the statement in if is true, it will execute the code under it.
        {   //curly bracrs are use around statements when they are part of a control structure, such as if statement. The braces also makes it easier to add statements and prevent bugs.
            System.out.println( "Too many cats! The world is doomed!");
        }
        if ( people > cats )
        {
            System.out.println( "Not many cats! The world is saved!");
        }
        if ( people < dogs )
        {
            System.out.println( "The world is drooled on!" );
        }
        if ( people > dogs )
        {
            System.out.println( "The world is dry!" );
        }
        dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
    }

}