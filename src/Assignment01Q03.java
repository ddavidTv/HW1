public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // Read the first string argument
        System.out.println("The first " + x + " Fibonacci numbers are:");
 
        // Build Fibonacci sequence 
        
        int pos_0 = 1, pos_1 = 1;
        int numOdd = 2;
        System.out.print(pos_0 + " " + pos_1 + " ");
        
        for (int i = 2; i < x; i++) {
            int pos_i = pos_0 + pos_1;
            if(pos_i % 2 != 0){numOdd++;}
            System.out.print(pos_i);
            pos_0 = pos_1; pos_1 = pos_i;

            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
                
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
