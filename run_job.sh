export PATH=$PATH:/home/cymoser/.sdkman/candidates/scala/current/bin:/home/cymoser/.sdkman/candidates/java/current/bin:/home/cymoser/.vscode-server/cli/servers/Stable-ea1445cc7016315d0f5728f8e8b12a45dc0a7286/server/bin/remote-cli:/home/cymoser/.cabal/bin:/home/cymoser/.ghcup/bin:/home/cymoser/.cargo/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin:/home/cymoser/bin
cd /local/home/cymoser/Ikaros
rm temp.txt
touch temp.txt
timeout 12'h' cargo run --release -- language $1 oracle $2
