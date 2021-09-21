import java.util.*;

class bubbleSort{
    public static void main(String[] args)
    {
        System.out.println("    Welcome to Bubble Sort!     ");
        System.out.println("=================================");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array!");
        int n=sc.nextInt();

        System.out.println("Enter the value of array!");
        int arr[]= new int[40];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Before Sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        
        for(int i=0;i<n-1;i++){
            int flag=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
                break;
        
        }
        System.out.println("After Sorting :" );
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}