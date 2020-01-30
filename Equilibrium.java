package Assignment2;

import java.util.Scanner;


public class Equilibrium {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter testcases");
        int n=s1.nextInt();                         //Input testcases
        for(int i=0;i<n;i++){
            System.out.println("Enter array size");
            int[] arr=new int[s1.nextInt()];        
            System.out.println("Enter elements");
            for(int j=0;j<arr.length;j++){
                arr[j]=s1.nextInt();                //Input array
            }
            System.out.println("Ans of "+(i+1)+" is: "+checkEquilibrium(arr));  //printing returend value from function
        }
    }
    static int checkEquilibrium(int[] arr){
        if(arr.length==1)   //If length of array is 1 then it is in equilibrim
            return 1;
        int sum=0,leftSum=0;
        for(int i=0;i<arr.length;i++)     //adding up all elements of array in sum variable
            sum+=arr[i];
        /*Subtract each element one by one from the array and keep on adding it to
          leftsum variable. If leftsum becomes equal to sum, print position*/
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(sum==leftSum)
                return i+1;
            leftSum+=arr[i];
        }
        return -1;
    }
}
