#!/bin/bash

file="tempprog.scala"
touch temp.txt
scalac $file 2> temp.txt
python3 "/mnt/g/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/unreachable.py"
