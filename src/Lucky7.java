
import java.util.Scanner;

public class Lucky7 {
    public static void main(String[] args) {
        Dice[] Dices=new Dice[]{new Dice(),new Dice()};
        int topmoney=0,toproll=0,money=0,roll=1;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter how much money you wish to lose:");
        money=s.nextInt();
        int currentroll;
        while(true){
            currentroll=Dices[0].roll()+Dices[1].roll();
            if(currentroll==7){money+=4;}else{money--;};
            roll++;
            if(money>topmoney){topmoney=money;toproll=roll;}
            if(money==0){
                break;
            }
        }
        System.out.println("You are broke after "+roll+" rolls.");
        System.out.format("You should have quit after %d rolls when you had %d dollars",toproll,topmoney);
    }
}
