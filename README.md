# Basic-Calculations-vs-Bot 🤖
Can you solve simple calculations faster than a bot? Find it out in this little CLI game!

## Features
- Simultaneously running bot that takes 1-5s per question
- Generate simple questions involving addition, subtraction, multiplication or division
- Support negative numbers
- Prompt user to answer them
## How to run

Windows (Powershell):
```powershell
# compile
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
# run
java -cp out com.pierre.basic.calculations.vs.bot.Main
```

Linux (Bash):
```bash
# compile
find -name "*.java" > sources.txt
javac -d out @sources.txt
# run
java -cp out com.pierre.basic.calculations.vs.bot.Main
```

## Tech Stack
- Java

## Roadmap
- Implementing User class
- Punishment for User failure

