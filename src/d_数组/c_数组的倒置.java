package d_数组;


import java.io.IOException;

public class c_数组的倒置 {
    public static void main(String[] args) throws IOException {
        int[] array_a={11,12,13,14,15};
        for (int i : array_a) {
            System.out.print(i+" ");
        }

/*        for(int min=0,max=array_a.length-1;min<max;min++,max--){
            int temp=array_a[min];
            array_a[min]=array_a[max];
            array_a[max]=temp;
        }*/
        for (int i = 0; i < array_a.length/2; i++) {
            int temp=array_a[i];
            array_a[i]=array_a[array_a.length-1-i];
            array_a[array_a.length-1-i]=temp;

        }

        System.out.println("\n倒序后:");
        for (int i : array_a) {
            System.out.print(i+" ");
        }

    }

}
