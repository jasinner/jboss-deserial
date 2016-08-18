#!/bin/bash
javac -sourcepath src/ -d bin/ -cp bin/ src/SerializeUROExample.java
java -cp bin/ SerializeUROExample
