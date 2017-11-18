package benchmark;

import com.twmacinta.util.MD5;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class AdventCoins {

    public static final String ZEROS = "000000";
    public static final String INPUT = "bgvyzdsv";

    @Benchmark
    public long ApacheDigestUtilsLoop() {
        for (long i = 0; ; i += 1) {
            if (DigestUtils.md5Hex(INPUT + i).startsWith(ZEROS))
                return i;
        }
    }

    @Benchmark
    public long ApacheDigestUtilsIntStreamParallel() {
        return IntStream.iterate(0, i -> i + 1)
                .parallel()
                .takeWhile(i -> !DigestUtils.md5Hex(INPUT + i).startsWith(ZEROS))
                .count();
    }

    @Benchmark
    public long ApacheDigestUtilsStreamParallel() {
        return Stream.iterate(0, i -> i + 1)
                .parallel()
                .takeWhile(i -> !DigestUtils.md5Hex(INPUT + i).startsWith(ZEROS))
                .count();
    }

    @Benchmark
    public long ApacheDigestUtilsIntStream() {
        return IntStream.iterate(0, i -> i + 1)
                .takeWhile(i -> !DigestUtils.md5Hex(INPUT + i).startsWith(ZEROS))
                .count();
    }

    @Benchmark
    public long JdkDigestLoop() throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        for (long i = 0; ; i += 1) {
            if (Hex.encodeHexString(md5.digest((INPUT + i).getBytes())).startsWith(ZEROS))
                return i;
        }
    }

    @Benchmark
    public long JdkDigestStream() throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return Stream.iterate(0, i -> i +1)
                .takeWhile(i -> !Hex.encodeHexString(md5.digest((INPUT + i).getBytes())).startsWith(ZEROS))
                .count();
    }

    @Benchmark
    public long JdkDigestIntStream() throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return IntStream.iterate(0, i -> i +1)
                .takeWhile(i -> !Hex.encodeHexString(md5.digest((INPUT + i).getBytes())).startsWith(ZEROS))
                .count();
    }

    @Benchmark
    public long FastMD5Loop() throws UnsupportedEncodingException {
        MD5 md5 = new MD5();
        for (long i = 0; ; i += 1) {
            md5.Update((INPUT + i), null);
            if (md5.asHex().startsWith(ZEROS))
                return i;
        }
    }

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(AdventCoins.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
