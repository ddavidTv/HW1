public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        /////////////////////////////////////////////
        // TODO: Fill in the Pi approxiamtion here
        /////////////////////////////////////////////
        final int NUM = Integer.parseInt(args[0]);
        for (int n=1, pos=0 ; n<2*NUM ; n=n+2, pos++){
            approxPi += ((double)1/n)*Math.pow(-1, pos); 
        }
        approxPi *=4 ;
        
        /////////////////////////////////////////////
        
        System.out.println(approxPi + " " + actualPi);
    }
}
