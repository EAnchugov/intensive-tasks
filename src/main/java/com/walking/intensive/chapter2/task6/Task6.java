package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {

    }

    static int getNoc(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        // Ваш код
        int noc;
        if (m > n ){
            noc = n;
        } else {
            noc = m;
        }

        while (true){
            if (noc % m == 0 && noc %  n == 0) {
                return noc;
            } else {
                noc++;
            }
        }
    }

    static int getNod(int m, int n) {
        // Ваш код
        int nod;

        if (n ==0 || m == 0){
            return 0;
        }


        if (m > n) {
            nod = n;
        } else nod = m;

        while (true){
            if (m % nod == 0 && n % nod == 0){
                return nod;
            }
            nod --;
        }
    }

    static int getNodByEuclideanAlgorithm(int m, int n){
        // Ваш код
        return 0;
    }

}