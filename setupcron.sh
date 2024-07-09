0 0 * * 3 timeout 12'h' cargo run -- language scala oracle construction
0 12 * * 3 timeout 12'h' cargo run -- language scala oracle z3
0 0 * * 4 timeout 12'h' cargo run -- language haskell oracle construction
0 12 * * 4 timeout 12'h' cargo run -- language haskell oracle z3
0 0 * * 5 timeout 12'h' cargo run -- language java oracle construction
0 12 * * 5 timeout 12'h' cargo run -- language java oracle z3