package Array;

import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Input the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Your input array is: ");
        for(int  i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element you want to search for: ");
        int item=sc.nextInt();
        int start,mid,end;
        start=0;
        end=size-1;

        boolean flag=false;

        while(start<=end)
        {
            mid=(start+end)/2;
            if(item<arr[mid])
            {
                end=mid-1;
            } else if (item>arr[mid])
            {
                start=mid+1;
            } else if (item==arr[mid])
            {
                System.out.println("Element found at the index: "+mid);
                flag=true;
                break;
            }
            else {
                flag=false;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("The element is not present in the array !");
        }
    }

}
