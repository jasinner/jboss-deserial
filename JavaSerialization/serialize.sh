#!/bin/bash
javac -sourcepath src/ -d bin/ -cp bin/ src/SerializeExample.java
java -cp bin/ SerializeExample
