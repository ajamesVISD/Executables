package org.vashonsd;

/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Executable e = new RPC();
        e.start(System.in, System.out);
    }
}
