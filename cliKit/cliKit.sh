#!/bin/bash
compilePackage() {
    local packageName="$1"

    cd src/
    javac -d . "$packageName"/*.java
    cd ..
}

compileMain() {
    cd src/
    javac Main.java
    cd ..
}

executeMain() {
    cd src/
    java Main
    cd .. 
}

if [ "$1" = "-p" ]; then

    if [ "$#" != 2 ]; then
        echo "Package name expected"
    else
        compilePackage "$2"
        exit 0
    fi

elif [ "$1" = "-c" ]; then
    compileMain
    exit 0

elif [ "$1" = "-e" ]; then
    executeMain
    exit 0 
elif [ "$1" = "-ce" ]; then
    compileMain
    executeMain
    exit 0
else
    echo "First CLA not supported"
    exit 0
fi
