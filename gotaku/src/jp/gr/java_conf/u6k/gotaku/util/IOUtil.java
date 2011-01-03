
package jp.gr.java_conf.u6k.gotaku.util;

import java.io.IOException;
import java.io.InputStream;

public final class IOUtil {

    private IOUtil() {
    }

    public static String readString(InputStream in, int length) throws IOException {
        byte[] d = new byte[length];

        int len = in.read(d);

        if (d.length != len) {
            throw new RuntimeException();
        }

        String s = new String(d, "Shift_JIS").trim();

        return s;
    }

    public static int readInt(InputStream in) throws IOException {
        long d1 = 0x000000ff & in.read();
        long d2 = 0x000000ff & in.read();

        long i = d2 << 8 | d1;

        return (int) i;
    }

    public static void readSkip(InputStream in, int length) throws IOException {
        in.skip(length);
    }

    /**
     * <p>
     * 入力ストリームから、問題データを読み込みます。
     * </p>
     * <p>
     * ごたく問題データは0x80でxor演算したデータになっているので、もう一度0x80でxor演算することで復号します。
     * </p>
     * 
     * @param in
     *            問題データを読み込む入力ストリーム。
     * @param length
     *            読み込むデータのバイト長。
     * @return 読み込んだ問題データ。トリミング済みです。
     * @throws IOException
     *             入力エラーが発生した場合。
     */
    public static String readQuestionString(InputStream in, int length) throws IOException {
        byte[] data = new byte[length];

        // 入力ストリームから問題データを読み込み、0x80でxor演算します。
        for (int i = 0; i < length; i++) {
            int d = in.read();

            data[i] = (byte) (d ^ 0x80 & 0xff);
        }

        // トリミングするため、データの末尾を探します。
        int len = 0;

        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] != -96) {
                len = i + 1;
                break;
            }
        }

        // データを文字列化します。
        String s = new String(data, 0, len, "Shift_JIS");

        return s;
    }

}
