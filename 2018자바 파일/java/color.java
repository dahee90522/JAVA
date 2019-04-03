
package org.seban;


import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;


public class color
{
    public static void main( String[] args )
    {
        AnsiConsole.systemInstall( );
        System.out.println( ansi( ).eraseScreen( ).fg( RED ).a( "³ª´Â" ).fg( GREEN ).a( "´ÂÈå´ÙÈñ" ).reset( ) );

        //System.out.println( ansi( ).eraseScreen( ).render( "@|red Hello|@ @|green World|@" ) );
    }
}