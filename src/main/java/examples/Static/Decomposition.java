package main.java.examples.Static;

public class Decomposition {
    long start = System.currentTimeMillis();
11: List.of(1,2,3,4,5)
        12:
        .stream()
13:
        14:
        15:
        .map(w -­> doWork(w))
            .forEach(s -­> System.out.print(s + " "));
16: System.out.println();
17: var timeTaken = (System.currentTimeMillis()-­start)/1000;
18: System.out.println("Time: "+timeTaken+" seconds");
}
