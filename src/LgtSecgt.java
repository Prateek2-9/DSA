import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LgtSecgt {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(arr[0]);
        a.add(-1);

        int secondLargest = -1, largest = 0;

        for(int i = 1; i < sizeOfArray; i++) {
            if(arr[i] > arr[largest]){
                secondLargest = largest;
                largest = i;
            } else if(arr[i] != arr[largest]) {
                if(secondLargest == -1 || arr[i] > arr[secondLargest]){
                    secondLargest = i;
                }
            }

        }
        a.set(0,arr[largest]);
        if(secondLargest != -1){
            a.set(1,arr[secondLargest]);
        }
        return a;
    }
    public static void main (String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array");
            int sizeOfArray = sc.nextInt();
            int arr[] = new int[sizeOfArray];
            System.out.println("enter array elements");
            for(int i = 0; i < sizeOfArray; i++)
            {
                int x;
                x = sc.nextInt();
                arr[i] = x;
            }

            ArrayList<Integer> res;
            res = largestAndSecondLargest(sizeOfArray, arr);
            System.out.println(res.get(0) + " " + res.get(1) );
        }
    }

