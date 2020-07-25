public class Array {
    public int search (int[] array, int value) {
        //012345
        //152873
        int loc = -1;
        for (int i = 0; i < array.length; i++) 
            if (array[i] == value) 
            loc = i;
            break;
        return loc;
    }
}