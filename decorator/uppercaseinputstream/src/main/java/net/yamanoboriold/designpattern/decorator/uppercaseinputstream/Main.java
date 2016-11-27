package net.yamanoboriold.designpattern.decorator.uppercaseinputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class Main {

    public static void main(final String[] args) {
        if (args.length == 0) {
            try {
                readAndUpperOut(System.in);
            } catch (IOException e) {
                throw new Error(e);
            }
        } else {
            for (String filename : args) {
                try {
                    readAndUpperOut(new FileInputStream(filename));
                } catch (IOException e) {
                    throw new Error(e);
                }
            }
        }
    }

    private static void readAndUpperOut(InputStream input) throws IOException {
        try (InputStream in = new UpperCaseInputStream(input)) {
            byte[] buf = new byte[8192];
            int len = 0;
            while ((len = in.read(buf)) != -1) {
                byte[] s = new byte[len];
                System.arraycopy(buf, 0, s, 0, len);
                System.out.println(new String(s));
            }
        }
    }
}
