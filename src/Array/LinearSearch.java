package Array;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array you want to input: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Input the Array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The entered array is: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the element you want to search for: ");
        int item=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<size;i++)
        {
            if(item==arr[i])
            {
                flag=true;
                break;
            }
            else {
                flag=false;
            }
        }
        if(flag==true)
        {
            System.out.println("Your searched item is present in the array !");

        }
        else
        {
            System.out.println("Your searched item is not present in the array !");
        }
    }
}
