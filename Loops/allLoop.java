package Loops;

public class allLoop {
    public static void main(String[] args) {
        int a=10,i=1;

        // ******** WHILE LOOP ******
        while(i<=10){
            System.out.println(a*i);
            i++;
        }

        // ******** FOR LOOP ********
        for(i=0;i<5;i++){
            for(int j=0;j<=i;j++){
            System.out.print('*');
        }
    System.err.println();}

        // ***** EXTENDED FOR OR FOR_EACH LOOP
        int arr[]={1,2,3,4,5};
        for(int x:arr){
            System.out.println(x);
        }
    }
}
