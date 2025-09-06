package Array;

import java.util.Scanner;
public class CeilingOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Input the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your input array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the element you want to have the ceiling of: ");
        int num=sc.nextInt();
        int result=findCeiling(arr,num);
        if(result!=-1)
        {
            System.out.println("The ceiling of the entered number is: "+result);
        }
        else
        {
            System.out.println("The ceiling does not exist !!");
        }
    }
    public static int findCeiling(int arr[],int num)
    {
        int start,mid,end;
        int result=-1;
        start=0;
        end=arr.length-1;
        boolean A_order=arr[start]<arr[end];

        while(start<=end)
        {
            mid=(start+end)/2;
            if(num==arr[mid])
            {
                return arr[mid];
            }
            if(A_order)
            {
                if(num<arr[mid])
                {
                    result=arr[mid];
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(num>arr[mid])
                {
                    result=arr[mid];
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return result;
    }
}