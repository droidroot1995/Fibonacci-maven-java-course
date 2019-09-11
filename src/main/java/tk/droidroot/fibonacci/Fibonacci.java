package tk.droidroot.fibonacci;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fibonacci {

    private static long fibonacci(int n){
        if(n == 0 || n  == 1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Fibonacci.class);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long startTime = System.currentTimeMillis();
        logger.info("The calculation is starting");

        for(int i = 0; i <= n; i++){
            long fib = fibonacci(i);
            System.out.println(fib);
        }

        long timeSpent = System.currentTimeMillis() - startTime;

        logger.info("The program executed in " + timeSpent + " milliseconds");
    }
}
