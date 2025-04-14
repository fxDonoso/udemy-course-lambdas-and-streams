package com.debuggeando_ideas.real_appplications;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrenceLambdas {

    //Con la interfaz Runnable se ejecuta el lambda sin retornar
    static Runnable printerSum = () -> {
        long sum = 0;
        System.out.println(Thread.currentThread().getName());
        for (long i = 1; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("sum= " + sum);
    };

    //Con la interfaz Callable se retorna
    static Callable<Long> callableSum = () -> {
        long sum = 0;
        System.out.println(Thread.currentThread().getName());
        for (long i = 1; i < 1000000; i++) {
            sum += i;
        }
        return sum;
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        var exec = Executors.newSingleThreadExecutor();

        exec.submit(printerSum);

        var result = exec.submit(callableSum);
        System.out.println("result= " + result.get());

        exec.shutdown();
    }
}
