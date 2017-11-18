# MD5 Microbenchmarking with [JMH](http://openjdk.java.net/projects/code-tools/jmh/)
- [Apache Commons](https://commons.apache.org), [DigestUtils](https://commons.apache.org/proper/commons-codec/apidocs/org/apache/commons/codec/digest/DigestUtils.html)
- [Fast MD5](http://www.twmacinta.com/myjava/fast_md5.php)
- [JDK 9, MessageDigest](https://docs.oracle.com/javase/9/docs/api/java/security/MessageDigest.html)

# Hardware
```
Model Name: MacBook Pro
Model Identifier: MacBookPro11,1
Processor Name: Intel Core i5
Processor Speed: 2,6 GHz
Number of Processors: 1
Total Number of Cores: 2
L2 Cache (per Core): 256 KB
L3 Cache: 3 MB
Memory: 16 GB
```

# Outcome
```
# JMH version: 1.19
# VM version: JDK 9, VM 9+181
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op

Benchmark                                       Mode  Cnt    Score     Error  Units
AdventCoins.ApacheDigestUtilsIntStream          avgt    5  506,803 ±  26,695  ms/op
AdventCoins.ApacheDigestUtilsIntStreamParallel  avgt    5  324,265 ± 146,811  ms/op
AdventCoins.ApacheDigestUtilsLoop               avgt    5  485,435 ±   9,454  ms/op
AdventCoins.ApacheDigestUtilsStreamParallel     avgt    5  352,457 ± 355,035  ms/op
AdventCoins.FastMD5Loop                         avgt    5  841,946 ±  50,189  ms/op
AdventCoins.JdkDigestIntStream                  avgt    5  368,507 ±   8,491  ms/op
AdventCoins.JdkDigestLoop                       avgt    5  360,256 ±  16,671  ms/op
AdventCoins.JdkDigestStream                     avgt    5  379,345 ±  12,117  ms/op
```