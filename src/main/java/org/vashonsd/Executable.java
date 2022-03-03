package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;

public interface Executable {

    void start(InputStream is, PrintStream ps);

    String getName();

    String getDescription();

    String getAuthor();
}
