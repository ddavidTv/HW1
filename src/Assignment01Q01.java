public class Assignment01Q01 {
    public static void main(String[] args) {
        for(String arg : args){
            int charToInt = arg.charAt(0);
            if ( charToInt % 5 == 0 ){
                  System.out.println(arg.charAt(0));
             }
        }
    }
}
