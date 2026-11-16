import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {

        if (array.length == 0 || (Math.abs(move) % array.length) == 0) { return array; } 

        if (direction == 'R' || direction == 'L') {

            move %= array.length; // Now move is smaller than array.length
            // We update move to correspond direction='R' with move > 0:  
            if (direction == 'L' && move < 0) move = -move;
            else if (direction == 'R' && move < 0) move = array.length + move; 
            else if (direction == 'L' && move > 0) move = array.length - move;  
            
            int[] tempArray = new int[array.length];
            System.arraycopy(array, 0, tempArray, 0, array.length);
            
            // We move the items cyclically with direction='R' && move>0 
            for(int i = 0 ;i < array.length ; i++){
                array[(i + move) % array.length] = tempArray[i];
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