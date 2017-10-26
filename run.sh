#!/bin/bash
mvn -q clean compile

for day in $(ls -1 | grep "day"); do
    mvn -q exec:java -pl $day
done