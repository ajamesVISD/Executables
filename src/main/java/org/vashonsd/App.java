package org.vashonsd;

/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Executable e = new MyRockPaperScissors();
        Executable e = new Game();
        e.start(System.in, System.out);
    }
}
