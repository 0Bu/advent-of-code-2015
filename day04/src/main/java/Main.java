import org.apache.commons.codec.digest.DigestUtils;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.format("Day04/1 MD5 hash of bgvyzdsv and %d starts with five zeroes%n",
                IntStream.iterate(0, i -> i + 1)
                        .takeWhile(i -> !DigestUtils.md5Hex("bgvyzdsv" + i).startsWith("00000"))
                        .count());

        System.out.format("Day04/2 MD5 hash of bgvyzdsv and %d starts with six zeroes%n",
                IntStream.iterate(0, i -> i + 1)
                        .takeWhile(i -> !DigestUtils.md5Hex("bgvyzdsv" + i).startsWith("000000"))
                        .count());
    }

}
