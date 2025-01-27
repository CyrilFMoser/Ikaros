import numpy as np
import pandas as pd
import os.path



methods = ["Construction","Mutation","Z3"]
compilers = ["scalac","ghc","javac"]

total_time = dict()

for method in methods:
    total_time[method]=dict()
    for compiler in compilers:
        cur_path = f"out/Programs/{method}/{compiler}/time.txt"
        print(cur_path)         
        seconds=0
        if os.path.isfile(cur_path):
            if os.path.getsize(cur_path)>0:
                seconds = int(np.loadtxt(cur_path))
        total_time[method][compiler] =  seconds 


total_progs = dict()

for method in methods:
    total_progs[method] = dict()
    for compiler in compilers:
        cur_path = f"out/Programs/{method}/{compiler}/stats.txt"
        if os.path.getsize(cur_path)>0:
            num_progs = int(np.loadtxt(cur_path))
        else:
            num_progs = 0
        total_progs[method][compiler] = num_progs

reduction_stats = dict()

for method in methods:
    reduction_stats[method] = dict()
    for compiler in compilers:
        cur_path = f"out/Programs/{method}/{compiler}/reduction_stats.csv"
        try:
            df = pd.read_csv(cur_path)
        except:
            df = pd.DataFrame(data={"time":[0]})
        reduction_stats[method][compiler] = df

reduction_times = dict()

for method in methods:
    reduction_times[method] = dict()
    for compiler in compilers:
        cur_df = reduction_stats[method][compiler]
        reduction_times[method][compiler] = cur_df["time"].sum()

throughput_generation = dict()

print("--------------------------------------")
print("Throughput of programs:")
for method in methods:
    print(f"{method}:")
    throughput_generation[method] = dict()
    for compiler in compilers:
        if total_time[method][compiler]==0:
            print(f"    {compiler}: has not run")
        else:
            throughput_generation[method][compiler] = int(total_progs[method][compiler]/(total_time[method][compiler] - reduction_times[method][compiler]) * 60)
            print(f"    {compiler}: {throughput_generation[method][compiler]} programs/min")

print("--------------------------------------")
print("Bug triggering programs:")
for method in methods:
    print(f"{method}:")
    for compiler in compilers:
        num_bugs = 0
        if reduction_stats[method][compiler]["time"].sum() > 0:
            num_bugs = reduction_stats[method][compiler].shape[0]
        if num_bugs > 0:            
            print(f"    {compiler}: {num_bugs} programs")
        else:
            print(f"    {compiler}: nothing found")
            
print("--------------------------------------")
print("Time per bug (#programs):")
for method in methods:
    print(f"{method}:")
    for compiler in compilers:
        num_bugs = 0
        if reduction_stats[method][compiler]["time"].sum() > 0:
            num_bugs = reduction_stats[method][compiler].shape[0]
        if num_bugs > 0:
            programs_per_bug = int(total_progs[method][compiler]/num_bugs)
            time_per_bug = int((total_time[method][compiler]-reduction_times[method][compiler])/num_bugs / 60)
            print(f"    {compiler}: {time_per_bug} min ({programs_per_bug} #programs generated)")
        else:
            print(f"    {compiler}: nothing found")
print("--------------------------------------")
print("Reduction percentage:")
for method in methods:
    print(f"{method}:")
    for compiler in compilers:
        if reduction_stats[method][compiler]["time"].sum() == 0:
            print(f"    {compiler}: nothing found")
            continue
        original_size = reduction_stats[method][compiler]["original_total_changes"].mean()
        reduced_size = reduction_stats[method][compiler]["reduced_total_changes"].mean()
        p = 1 - (reduced_size/original_size)
        p = int(p*100)
        print(f"    {compiler}: {p}% smaller")
