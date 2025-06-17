#!/bin/bash 
set -e
TESTCLASS=("$1")
shift

echo "Compiling..."
javac -cp ../lib/junit-platform-console-standalone-1.7.0-all.jar "$@"

echo "Running Tests..."
java -jar ../lib/junit-platform-console-standalone-1.7.0-all.jar -cp . --select-class $TESTCLASS --reports-dir reports

exit 0
