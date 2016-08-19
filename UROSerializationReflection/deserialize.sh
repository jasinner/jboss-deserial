#!/bin/bash
javac -sourcepath src/ -d bin/ -cp bin/ src/DeserializeUROExample.java
java -cp bin/ DeserializeUROExample
