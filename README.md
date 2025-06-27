# Ikaros
Validating soundness and completeness in pattern-match coverage analyzers.

## Building

```
cargo build --release
```

## Usage

The `ikaros` executable provides a rich CLI with many available options.

```
./target/release/ikaros --help
Usage: ikaros [OPTIONS] --pattern-gen <PATTERN_GEN> --language <LANGUAGE>

Options:
  -p, --pattern-gen <PATTERN_GEN>
          trategy used to generate pattern-matching expressions and establish the test oracle.
          
          * construction: Refers to refinement-based pattern generation.
          
          * z3: Refers to random pattern generation using Z3 as the test oracle.
          
          * mutation: Uses semantic mutations to derive new programs from existing ones.
          
          [possible values: z3, construction, mutation]

  -l, --language <LANGUAGE>
          Target programming language for the generated programs
          
          [possible values: haskell, scala, java]

  -i, --iterations <ITERATIONS>
          Total number of programs to generate.
          
          If not specified, Ikaros will continue generating programs indefinitely.

  -b, --batch-size <BATCH_SIZE>
          Number of programs per batch sent to the compiler under test
          
          [default: 10]

  -r, --redundancy
          If provided, Ikaros also checks for false positives in redundancy diagnostics

      --reduce
          If provided, Ikaros attempts to minimize bug-triggering programs via reduction

  -h, --help
          Print help (see a summary with '-h')

  -V, --version
          Print version
```

## Example: Validating the Pattern-Match Coverage Analyzer of Scala

### Example 1

In this example,
we use `ikaros` to generate 50 programs
(as specified by `--iterations 50`) to validate
the soundness and completeness of the pattern-match coverage analyzer in Scala.
The patterns within the generated programs are produced
using the refinement-based pattern generation strategy (RefPG)
described in the paper.
This is enabled via the `--pattern-gen construction` option.

```
./target/release/ikaros --language scala \
  --pattern-gen construction \
  --iterations 50
```

When the above command is executed,
`ikaros` prints messages like the following to the standard output:

```
Compiling...
Finished Compiling
Compiling...
Finished Compiling
...
```

In addition, after each run,
`ikaros` creates an `out/` directory in the current working directory.
This directory contains all bug-triggering programs and results,
organized as follows:

```
out/
└── Programs/
    └── Construction/
        └── scalac/
            ├── batches/
            ├── redundancy/
            │   └── false_positive/
            ├── exhaustiveness/
            │   ├── false_positive/
            │   └── false_negative/
            └── more_stats.csv
```



Here's a breakdown of the key components:

* `out/Programs/Construction/scalac/batches/`:
Stores temporary files created during the program generation
 and compilation process.

* `out/Programs/Construction/scalac/exhaustiveness/false_negative/`:
Contains programs that expose _soundness_ bugs in the exhaustiveness checker
of the pattern-match coverage analyzer.
If this directory is empty,
no such bugs were found during the run.

* `out/Programs/Construction/scalac/exhaustiveness/false_positive/`:
Contains programs that expose _completeness_ bugs in the exhaustiveness checker
of the pattern-match coverage analyzer.
If this directory is empty,
no such bugs were found during the run.

* `out/Programs/Construction/scalac/redundancy/false_positive/`:
Contains programs that expose _completeness_ bugs in the redundancy checker
of the pattern-match coverage analyzer.
If this directory is empty,
no such bugs were found during the run.

* `out/Programs/Construction/scalac/more_stats.csv`:
A CSV file summarizing various statistics from the run,
including program characteristics,
generation and compilation times,
and more.


### Example 2


In our second example, we repeat the experiment.
This time using the random pattern generation strategy (RPG),
as described in Section 3.3.3 of our paper.
This strategy leverages Z3 to establish the correctness oracle.

```
./target/release/ikaros --language scala \
  --pattern-gen z3 \
  --iterations 50
```


This now generates files like so:

```
out/
└── Programs/
    └── Z3/
        └── scalac/
            ├── batches/
            ├── redundancy/
            │   └── false_positive/
            ├── exhaustiveness/
            │   ├── false_positive/
            │   └── false_negative/
            │       ├── program_0.scala
            │       ├── program_1.scala
            │       ├── program_2.scala
            │       ├── program_3.scala
            │       └── program_4.scala
            └── more_stats.csv
```

Notably,
`ikaros` successfully identified five soundness bugs (false negatives)
in the exhaustiveness checks of the pattern-match coverage analyzer.
The bug-triggering programs can be found in:
`out/Programs/Z3/scalac/exhaustiveness/false_negative/`.
