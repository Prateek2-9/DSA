import java.util.Scanner;

public class adjacent {
    public static void bigAdjacent(int a[]){
        int b[] = new int[a.length-1];
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                b[i]=a[i];
            }
            else{
                b[i]=a[i+1];
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];

        //input elements in the Array
        System.out.println("enter array elements");
        for (int i = 0; i < sizeOfArray; i++) {
            int x;
            x = sc.nextInt();
            arr[i] = x;
        }
        bigAdjacent(arr);
    }
}
