package com.nighthawk.csa.algos.fibonacciModel;

public class FibFor extends _Fibonacci {
    public FibFor(int nth) {
        super(nth);
    }

    @Override
    protected void init() {
        long limit = super.size;
        for (long[] f = new long[]{0, 1}; limit-- > 0; f = new long[]{f[1], f[0] + f[1]})
            super.setData(f[0]);
    }

    public static void main(String[] args) {
        int num = 20;   //number of Fibs, 92 is max for long
        _Fibonacci fibonacci = new FibFor(num);
        fibonacci.print("For");
    }
}