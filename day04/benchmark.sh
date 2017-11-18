if ! [ -x "$(command -v docker)" ]; then
  echo 'Error: docker is not installed.' >&2
  exit 1
fi

docker run --rm -it \
    -v `pwd`/..:"/aoc2015" \
    -w "/aoc2015" \
    maven:3-jdk-9-slim \
    bash -c "mvn -V -B clean package -pl day04 ; java -jar day04/target/benchmark.jar"
