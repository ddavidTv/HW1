import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        // TODO: implement

        if (array.length == 0){ return array; }
        
        if (Math.abs(move) == array.length) { return array; } 

        if (direction == 'R' || direction == 'L') {
            if (direction == 'L') { move = -move; }
            move = move % array.length;
            int[] tempArray = new int[array.length];
            System.arraycopy(array, 0, tempArray, 0, array.length);
        
            for(int i = 0 ;i < array.length ; i++){
                array[(i + move + array.length) % array.length] = tempArray[i];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
        shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1] 
        System.out.println(Arrays.toString(
        shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, 1, 'R'))); // [5, 1, 2, 3, 4] 
        System.out.println(Arrays.toString(
        shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
        shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
        shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
        shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
        shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
        shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}