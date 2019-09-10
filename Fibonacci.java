
public class Fibonacci {

    public static void main(String[] Args) {

        int strat = 0, cont = 1, print;
        for (int i = 0; i < 10; i++) {
            print = strat + cont;
            System.out.println(print);
            strat = cont;
            cont = print;
        }} 
}

class PrimeExample {
    public static void main(String[] args){

  int frist=0;
  int check=3;
  int div,odal;
  div=check/2;
  if(check==0||check==1){
      System.out.println(check+"is not prime");
  }
  else{
      for(int i=2;i<div;i++){
          if(check%i==0){
              System.out.println(check+"is not prime");
              odal=1;
              break;
          }
          if(odal==0){
              System.out.println(check+"is prime");
          }
      }

  }
}  
}


/**
 * InnerFibonacci
 */
 class Fibonacci1 {
    public static void main(String[] args) {
        int che=505;
        int sum=0;
        int model;
        int temp;
        temp=che;
        while(che>0){
            model= che/10;
            sum=(sum*10)+10;
            che= che/10;

        }
        if(che== temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("no palindrome");
        }
        
    }

    
}