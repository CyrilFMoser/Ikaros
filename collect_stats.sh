export PATH=/home/cymoser/.sdkman/candidates/sbt/current/bin:/home/cymoser/.vscode-server/cli/servers/Stable-f1a4fb101478ce6ec82fe9627c43efbf9e98c813/server/bin/remote-cli:/home/cymoser/.sdkman/candidates/maven/current/bin:/home/cymoser/.sdkman/candidates/kotlin/current/bin:/home/cymoser/.sdkman/candidates/groovy/current/bin:/home/cymoser/.vscode-server/cli/servers/Stable-f1e16e1e6214d7c44d078b1f0607b2388f29d729/server/bin/remote-cli:/home/cymoser/.cabal/bin:/home/cymoser/.ghcup/bin:/home/cymoser/.sdkman/candidates/scala/current/bin:/home/cymoser/.sdkman/candidates/java/current/bin:/home/cymoser/.cargo/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin:/home/cymoser/bin:/local/home/cymoser/thalia-popl-eval/.local/bin
cd /local/home/cymoser/Ikaros



cargo run --release -- language java oracle z3
cargo run --release -- language java oracle construction
cargo run --release -- language java oracle mutation

cargo run --release -- language haskell oracle z3
cargo run --release -- language haskell oracle construction
cargo run --release -- language haskell oracle mutation

cargo run --release -- language scala oracle z3
cargo run --release -- language scala oracle construction
cargo run --release -- language scala oracle mutation

echo "finished"
