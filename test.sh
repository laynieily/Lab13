# Compile your code and tests
javac -cp "./lib/hamcrest-core-1.3.jar:./lib/junit-4.13.2.jar:" -d ./bin ./src/*.java
# Run tests
java -cp "./bin:./lib/hamcrest-core-1.3.jar:./lib/junit-4.13.2.jar:" org.junit.runner.JUnitCore SimpleFunctionsTest 