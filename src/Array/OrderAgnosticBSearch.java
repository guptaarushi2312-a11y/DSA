package Array;

import java.util.Scanner;
public class OrderAgnosticBSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Input the array in a sorted manner: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Your entered array is: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element you want to search for: ");
        int item=sc.nextInt();
        int start,mid,end;
        start=0;
        end=size-1;
        boolean flag1=false;
        boolean flag2=false;
        if(arr[start]<arr[end])
        {
            while(start<=end)
            {
                mid=(start+end)/2;
                if(item<arr[mid])
                {
                    end=mid-1;
                }
                else if(item>arr[mid])
                {
                    start=mid+1;
                }
                else if(item==arr[mid])
                {
                    System.out.println("The element is found at the index: "+mid);
                    flag1=true;
                    break;
                }
                else
                {
                    flag1=false;
                    break;
                }
            }
            if(!flag1)
            {
                System.out.println("Element is not found !");
            }
        }
        else
        {
            while(start<=end)
            {
                mid=(start+end)/2;
                if(item>arr[mid])
                {
                    end=mid-1;
                }
                else if(item<arr[mid])
                {
                    start=mid+1;
                }
                else if(item==arr[mid])
                {
                    System.out.println("The element is found at the index: "+mid);
                    flag2=true;
                    break;
                }
                else
                {
                    flag2=false;
                    break;
                }
            }
            if(!flag2)
            {
                System.out.println("Element is not found !");
            }
        }
    }
}
