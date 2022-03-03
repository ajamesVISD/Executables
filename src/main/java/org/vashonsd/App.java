package org.vashonsd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Executable e = new RockPaperScissors();
        Executable e = new Game();
        e.start(System.in, System.out);
    }
}
