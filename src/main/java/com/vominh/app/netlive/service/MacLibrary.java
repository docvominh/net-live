package com.vominh.app.netlive.service;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface MacLibrary extends Library {
    MacLibrary INSTANCE = Native.load("m", MacLibrary.class);

    void ifconfig();

}
