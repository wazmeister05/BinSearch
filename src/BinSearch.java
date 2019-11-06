public class BinSearch {        //searching through a sorted list by cutting it in half each time

    public int binSearch(int[] arr, int target){
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                left = mid + 1;
            }

            else{
                right = mid - 1;
            }
        }
        return -1;
    }


    public int binSearchRecursive(int arr[], int left, int right, int target){
        if (right >= left){
            int mid = left + (right - left) / 2;

            if( arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                return binSearchRecursive(arr, left, mid-1, target);
            }
            return binSearchRecursive(arr, mid+1, right, target);
        }
        return -1;
    }

}
