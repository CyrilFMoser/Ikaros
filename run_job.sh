rm temp.txt
touch temp.txt
cargo run --release -- language $1 oracle $2
