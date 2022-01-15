package CodingNinjasCourse;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();

    }

    public static int binarySearch(int[] arr, int x) {
        int len=arr.length;
        int start=0;
        int end=len;
        int mid;


        while(start>end){
            mid=(start+end)/2;
            if(arr[mid]>x){
                end=mid-1;
            }else if(arr[mid]<x){
                start=mid+1;
            }else{
                return mid;
            }
        }

        return -1;






    }



}
