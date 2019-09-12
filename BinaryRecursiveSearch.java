public class BinaryRecursiveSearch implements Practice03Search{

    public int search(int [] array, int target){
        return search(array, target, 0, array.length - 1);
    }

    public int search(int [] array, int target, int low, int high){
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (array[mid] > target)
            return search(array, target, low, mid -1);
        if (array[mid] < target)
            return search(array, target, mid + 1, high);
        return mid;
    }
    public String searchName(){
        return "Binary Recursive Search";
    }
}
