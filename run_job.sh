export PATH=/home/cymoser/.sdkman/candidates/sbt/current/bin:/home/cymoser/.vscode-server/cli/servers/Stable-f1a4fb101478ce6ec82fe9627c43efbf9e98c813/server/bin/remote-cli:/home/cymoser/.sdkman/candidates/maven/current/bin:/home/cymoser/.sdkman/candidates/kotlin/current/bin:/home/cymoser/.sdkman/candidates/groovy/current/bin:/home/cymoser/.vscode-server/cli/servers/Stable-f1e16e1e6214d7c44d078b1f0607b2388f29d729/server/bin/remote-cli:/home/cymoser/.cabal/bin:/home/cymoser/.ghcup/bin:/home/cymoser/.sdkman/candidates/scala/current/bin:/home/cymoser/.sdkman/candidates/java/current/bin:/home/cymoser/.cargo/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin:/home/cymoser/bin:/local/home/cymoser/thalia-popl-eval/.local/bin
cd /local/home/cymoser/Ikaros

log="/local/home/cymoser/Ikaros/logs/$1_$2_log.txt"

if [ -e $log ]
then
    echo "exists"
    cat $log
else
    touch $log
fi

cr="cargo run --release -- language $1 oracle $2"

compiler="scalac"

if [[ "$1" == "java" ]]; then
    compiler="javac"
fi

if [[ "$1" == "haskell" ]]; then
    compiler="ghc"
fi


oracle="Z3"

if [[ "$2" == "construction" ]]; then
    oracle="Construction"
fi

if [[ "$2" == "mutation" ]]; then
    oracle="Mutation"
fi

time_path="/local/home/cymoser/Ikaros/out/Programs/$oracle/$compiler/time.txt"

cur_runtime=0

if [ -e $time_path ]
then
    echo "exists"
    cur_runtime=$(cat $time_path)
else
    touch $time_path
fi

start_time=$(date +%s)
new_runtime=0  # Total accumulated runtime

while [ "$new_runtime" -lt $((12 * 3600)) ]; do
    remaining_time=$((12 * 3600 - new_runtime))  # Calculate remaining time

    # Run the command for the remaining time or timeout at 12h
    timeout "$remaining_time"s $cr 2>&1 | tee -a "$log"
    exit_status=$?  # Capture the exit status of the previous command

    end_time=$(date +%s)
    elapsed_time=$((end_time - start_time))  # Calculate the time spent in this iteration
    new_runtime=$((new_runtime + elapsed_time))  # Accumulate runtime

    cur_runtime=$((cur_runtime + elapsed_time))

    # Save the accumulated runtime to the time file
    echo "$cur_runtime" > "$time_path"

    # Exit if total runtime has reached 12 hours
    if [ "$new_runtime" -ge $((12 * 3600)) ]; then
        echo "Reached a total runtime of 12 hours. ($elapsed_time seconds)"
        break
    fi

    # If the command succeeded, prepare for the next iteration
    if [ $exit_status -eq 0 ]; then
        echo "Command completed successfully. Continuing to the next iteration."
    else
        echo "Command failed with exit code $exit_status. Retrying..."
    fi

    # Reset start time for the next iteration
    start_time=$(date +%s)
done

# Final message
echo "Script execution finished after 12 hours of runtime."