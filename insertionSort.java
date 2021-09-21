import java.util.*;

class insertionSort{
    public static void main(String[] args){
        System.out.println("    Welcome to Insertion Sort!      ");
        System.out.println("=====================================");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array!");
        int n=sc.nextInt();

        System.out.println("Enter the values of array!");
        int arr[] = new int[50];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        //Main logic behing insetion sort 
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("After Sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
           
        }
         System.out.println("");
    }
}