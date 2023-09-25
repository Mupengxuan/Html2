package HouDuan;

import java.util.Scanner;

public class Fei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        System.out.println(fibonacci2(n));
        System.out.println(fibonacci3(n));

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else  {
            int a = 0; //第一位
            int b = 1; //第二位
            for (int i = 2; i <= n; i++) {
                int c = b;
                b = a + b;
                a = c;
            }
            return b;
        }
    }
    //递归
    public static int fibonacci2(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci2(n-1)+fibonacci2(n-2);
    }
    //动态规划
    public static int fibonacci3(int n) {
        if (n <= 1) {
            return n;
        } else  {
           int []dp= new int[n+1];
           dp[0]=0;
           dp[1]=1;
            for (int i = 2; i <= n; i++) {
        dp[i]=dp[i-1]+dp[i-2];
            }
            return dp[n];
        }
    }
}

