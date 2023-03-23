package com.vominh.app.netlive.service;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface CLibrary extends Library {
    CLibrary INSTANCE =  Native.load("c", CLibrary.class);

    int atol(String s);
}

// Alternative 2: direct-mapped class (uses a concrete class rather than an
// interface, with a slight variation in method
// declarations).
//public class CLibrary {
//    static {
//        Native.register("c");
//    }
//}
