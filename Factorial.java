/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        int todo=3,face=1;
        for(int i=1;i<=todo;i++){
            face=face*i;
            System.out.println("on loop"+face);
        }
        System.out.println( todo+" :Factorial is"+face);
    }
}