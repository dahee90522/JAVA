
package org.seban;


import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;


public class color
{
    public static void main( String[] args )
    {
        AnsiConsole.systemInstall( );
        System.out.println( ansi( ).eraseScreen( ).fg( RED ).a( "����" ).fg( GREEN ).a( "�������" ).reset( ) );

        //System.out.println( ansi( ).eraseScreen( ).render( "@|red Hello|@ @|green World|@" ) );
    }
}