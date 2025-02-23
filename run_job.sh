mkdir -p "$(pwd)/logs"
log="$(pwd)/logs/$1_$2_logs.txt"

if [ -e $log ]
then
    echo "exists"
    cat $log
else
    touch $log
fi

cr="cargo run --release -- language $1 oracle $2"

compiler="scalac"

if [ "$1" = "java" ]; then
    compiler="javac"
fi

if [ "$1" = "haskell" ]; then
    compiler="ghc"
fi


oracle="Z3"

if [ "$2" = "construction" ]; then
    oracle="Construction"
fi

if [ "$2" = "mutation" ]; then
    oracle="Mutation"
fi

time_path="$(pwd)/out/Programs/$oracle/$compiler/time.txt"

cur_runtime=0

if [ -z $time_path ]; then
    echo "exists"
    cur_runtime=$(cat $time_path)
else
    touch $time_path
fi

start_time=$(date +%s)
new_runtime=0  # Total accumulated runtime

while [ "$new_runtime" -lt 60 ]; do
    remaining_time=$((60 - new_runtime))  # Calculate remaining time

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
    if [ "$new_runtime" -ge 60 ]; then
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
