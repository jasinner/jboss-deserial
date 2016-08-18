#!/bin/bash
javac -sourcepath src/ -d bin/ -cp bin/ src/DeserializeExample.java 
java -cp bin/ DeserializeExample
