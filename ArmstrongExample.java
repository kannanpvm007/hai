
public class ArmstrongExample {
    public static void main(String[] args) {
        int am=153;
        int temp,sum=0,remind,dev;  
          temp=am;
        while(am>0){
            remind=am%10;
            am= am/10;
            sum=sum+(remind*remind*remind);

        }
        if(temp==sum){
        System.out.println("Armstrong");}
        else{
            System.out.println("not Armstrong");
        }
    }

    
}
