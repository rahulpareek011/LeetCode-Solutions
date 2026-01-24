class Solution {
    public int countPrimes(int n) {
        //sieve algo -> eg. go with numbers in array (1,2,3,4)
        //like 2 is prime then all number that are divsible by 2 mark as false 
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];

        // Step 1: assume all numbers from 2 to n-1 are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Step 2: Sieve
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3: count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}