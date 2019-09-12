public class LinearSearch implements Practice03Search {
    public String searchName(){
        return "Linear Search";
    }
    public int search(int [] array, int target){
        for (int i = 0; i < array.length; i++){
            if (array[i] == target);
            return i;
        }
        return -1;
    }
}
