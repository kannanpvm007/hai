class PalindromeExample{  
    public static void main(String args[]){ 


        // int chech =4356,sum=0,remin,temp;
        // temp=chech;
        // while(chech>0){

        //     remin= chech %10;
        //     sum=(sum*10)+remin;
        //     chech=chech/10;
        // }
        // if(temp== chech){
        // System.out.println("palidroin number");}
        // else
        // {
        //     System.out.println(temp+":not palitrion");
        // }
        StringPalindrome sp= new StringPalindrome();
   }  
   } /**
    * InnerPalindromeExample
    */
    class StringPalindrome {

   StringPalindrome(){
       String re="", che= "mome";
        int lemth = che.length();
        //char[] temp = che.toCharArray();
        for(int i=lemth-1;i>=0;i--){
            re=re+che.charAt(i);
        }
        if(che.equals(re)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("no palidromr");
      }  }}

