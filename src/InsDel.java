import java.sql.SQLOutput;
import java.util.*;
public class InsDel {
    public static int[] insertAtIndex(int arr[], int sizeOfArray, int index, int element)
    {
        for (int i = sizeOfArray - 2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        return arr;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];

        //input elements in the Array
        System.out.println("enter array elements");
        for(int i = 0; i < sizeOfArray-1; i++)
        {
            int x;
            x = sc.nextInt();
            arr[i] = x;
        }

        //input index
        System.out.println("enter index");
        int index = sc.nextInt();
        //input element
        System.out.println("enter element");
        int element = sc.nextInt();

        int newArr[] =insertAtIndex(arr,sizeOfArray,index,element);

        System.out.println("Printing the array");
        for(int i = 0; i < sizeOfArray;i++)
        {
            System.out.print(newArr[i] + " ");

        }
        System.out.println();
    }
}
