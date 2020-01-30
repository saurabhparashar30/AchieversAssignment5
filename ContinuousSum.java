package Assignment2;

import java.util.Scanner;


public class ContinuousSum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter testcases");
        int t=s1.nextInt();                         //Testcases input
        for(int i=0;i<t;i++){
            System.out.println("Enter array size");
            int arr[]=new int[s1.nextInt()];        
            System.out.println("Enter sum");
            int s=s1.nextInt();                     //Sum to be compared input
            System.out.println("Enter array");
            for(int j=0;j<arr.length;j++)           //Array input
                arr[j]=s1.nextInt();
            continuousSum(arr,s);                   //Calling function to print positions
        }
    }
    static void continuousSum(int[] arr,int s){
        int i=0,j,sum=0,e=0;
        /*Takeing two pointers at starting of array(i,j) moving j and adding array's
          jth index element to sum. If sum exceeds the given sum, subtracting ith index
          element from sum. If sum becomes equal print positions and break the loop.*/
        for(j=0;j<arr.length;j++){
            sum+=arr[j];
            if(sum>s){
                sum-=arr[i];
                i++;
            }
            if(sum==s){
                e=j;
                break;
            }
        }
        System.out.println((i+1)+" "+(e+1));
    }
}
