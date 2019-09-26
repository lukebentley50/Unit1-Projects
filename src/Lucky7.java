public class Lucky7 {
    public static void main(String[] args) {
        Dice[] Dices=new Dice[]{new Dice(),new Dice()};
        int Total=Dices[0].roll()+Dices[1].roll();
    }
}
