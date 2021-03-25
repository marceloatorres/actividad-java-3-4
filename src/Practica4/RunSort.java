package Practica4;

public class RunSort {

    public static void main(String args[]){
       Integer arr[] = new Integer[]{
          4,12,3,312,123,123,2
        };
        QuickSortSorterImple q = new QuickSortSorterImple();
        q.sort(arr, new IntegerComparator(),0,arr.length - 1);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }

        String str[] = new String[]{
                "marce","alejandro","torres","bb","casa","auto","a"
        };

        q.sort(str, new StringComparator(),0,str.length - 1);
        for(int i = 0; i < str.length;i++){
            System.out.println(str[i]);
        }
    }
}
