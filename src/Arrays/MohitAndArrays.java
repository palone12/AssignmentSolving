package Arrays;

import java.util.Scanner;

public class MohitAndArrays {
    // Find Missing Niumber from an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i =0 ;i< n ;i++){
            arr[i] =sc.nextInt();
       }
        System.out.println(missingNum(arr, n));
    }
    public static int missingNum(int [] arr ,int n ){
        int sum = n*(n+1)/2;
        for(int i =0 ;i<n ;i++){
            sum = sum- arr[i];

        }
        return sum;
    }
}
