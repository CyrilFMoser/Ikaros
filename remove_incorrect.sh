for FILE in out/Programs/Z3/javac/inexhaustive/false_positive/*.java;
do
    out=$(javac $FILE -Xmaxerrs 1000 2>&1 >/dev/null | grep switch)
    echo $FILE
    if [[ -n $out ]]
        then
                rm $FILE
    fi
done 
