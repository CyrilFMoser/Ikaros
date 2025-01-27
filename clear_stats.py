import os.path

methods = ["Construction","Mutation","Z3"]
compilers = ["scalac","ghc","javac"]

for method in methods:
    for compiler in compilers:
        path=f"out/Programs/{method}/{compiler}"

        stats=f"{path}/stats.txt"
        weeks=f"{path}/time.txt"
        reduction=f"{path}/reduction_stats.csv"

        files=[stats,weeks,reduction]

        for file in files:
            if os.path.isfile(file):
                open(file,"w").close()