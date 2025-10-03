package Array1;

public class myArr {
    public static void main(String[] args) {

        // ****** MULTIPLE WAYS OF Creating Array ******
        
        int arr[]={1,2,3,4,5};
        int arr1[]=new int[5];
        int arr2[][]=new int[5][2];
        int arr3[][]={{1,2,3},{3,2,1}};

        // *** ACCESSING ARRAY ELEMENTS ******
        System.out.println(arr[1]);
        System.out.println(arr3[1][2]);
        
        // ***** HOVERING THORUGH ARRAY ELEMENTS *******
        for(int x[]:arr3){
            System.out.println(x);
        }
        
        
    }
}
