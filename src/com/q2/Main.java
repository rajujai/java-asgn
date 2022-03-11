package com.q2;

public class Main{
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        else{
            for(int i=2;i<n;i++){
                if(n%i==0)
                    return false;
            }
            return true;
        }
    }
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int count = 0;
        for(int i=0;i<inputArray.length;i++){
            if(!isPrime(inputArray[i])){
                inputArray[i] = 0;
            }else
                count++;
        }
        int[] outputArray = new int[count];
        int top = -1;
        for(int n:inputArray){
            if(n!=0)
                outputArray[++top] = n;
        }
        return outputArray;
    }
    public static void main(String[] args){
        Main obj = new Main();
        int[] arr = {10,12,5,50,11,14,15};
        int [] res = obj.findAndReturnPrimeNumbers(arr);
        if(res.length==0)
            System.out.println("Prime number not found in the supplied Array");
        else{
            for(int primeNo: res)
                System.out.print(primeNo+" ");
        }
    }
}
