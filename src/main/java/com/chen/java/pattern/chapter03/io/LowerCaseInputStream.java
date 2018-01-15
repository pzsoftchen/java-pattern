package com.chen.java.pattern.chapter03.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * LowerCaseInputStream
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.io
 * @date 2018/1/15/17:59
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }


    @Override
    public int read() throws IOException {
        int c =  super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int res = super.read(b, off, len);
        for (int i = off; i < res + off; i ++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return res;
    }
}
