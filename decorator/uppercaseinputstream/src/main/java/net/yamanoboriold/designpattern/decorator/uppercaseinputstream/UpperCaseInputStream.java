package net.yamanoboriold.designpattern.decorator.uppercaseinputstream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {

    public UpperCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return c == -1 ? c : Character.toUpperCase(c);
    }

    @Override
    public int read(byte b[]) throws IOException {
        byte c[] = new byte[b.length];
        int total = in.read(c, 0, c.length);
        if (total != -1) {
            for (int i = 0; i < total; i++) {
                b[i] = (byte) Character.toUpperCase(c[i]);
            }
        }
        return total;
    }

    @Override
    public int read(byte b[], int off, int len) throws IOException {
        byte c[] = new byte[b.length];
        int total = in.read(c, off, len);
        if (total != -1) {
            for (int i = off; i < off + total; i++) {
                b[i] = (byte) Character.toUpperCase(c[i]);
            }
        }
        return total;
    }
}
