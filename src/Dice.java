public class Dice {
    private int value;
    
    public Dice(){
        value=(int)(Math.random()*6+1);
    }
    
    public int roll(){
        value=(int)(Math.random()*6+1);
        return value;
    }
    
    public int getValue(){
        value=(int)(Math.random()*6+1);
        return value;
    }
}
