



/*
  10-February-2023
*/


package com.jmboulos.ciphers.a5;

import java.util.BitSet;

public interface BaseLFSR {
    void initialize(BitSet sessionKey, BitSet frameCounter);
    boolean clock();
    int SESSION_KEY_LENGTH = 64;
    int FRAME_COUNTER_LENGTH = 22;
}
