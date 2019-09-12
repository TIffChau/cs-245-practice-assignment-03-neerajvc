public class BinaryIterativeSearch implements Practice03Search{

    public int search(int [] array, int target){
        int min = 0;
        int max = array.length - 1;

        while (min <= max){
            int mid = (min + max)/2;
            if (array[mid] > target)
                max = min - 1;
            else if (array[mid] < target)
                min = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public String searchName(){
        return "Binary Iterative Search";
    }

}
