
import java.io.IOException;

public class Student {
    private int[] Scores=new int[3];
    private String Name;
    
    public Student(String n,int sc1,int sc2,int sc3) throws IOException{
        if(sc1>=0&&sc1<=100){Scores[0]=sc1;}else{throw new IOException("Invalid value for score 1");}
        if(sc2>=0&&sc2<=100){Scores[1]=sc2;}else{throw new IOException("Invalid value for score 2");}
        if(sc3>=0&&sc3<=100){Scores[2]=sc3;}else{throw new IOException("Invalid value for score 3");}
        if(!"".equals(n)){Name=n;}else{throw new IOException("Name is invalid");}
    }
    
    public Student(){
        Scores=new int[]{0,0,0};
        Name="";
    }
    
    public void setName(String n) throws IOException{
        if(n.equals("")){throw new IOException("Invalid name");}else{Name=n;};
    }
    
    public String getName(){
        return Name;
    }
    
    public void setScore(int i,int score) throws IOException{
        if(score<0 || score>100){throw new IOException("Invalid value");}else{Scores[i-1]=score;}
    }
    
    public int getScore(int i){
        return Scores[i-1];
    }
    
    public int getHighScore(){
        int high=0;
        high=Scores[0]>high?Scores[0]:high;
        high=Scores[1]>high?Scores[1]:high;
        high=Scores[2]>high?Scores[2]:high;
        return high;
    }
    
    public int getAverage(){
        int total=Scores[0]+Scores[1]+Scores[2];
        return (int)total/3;
    }
    
    @Override
    public String toString(){
        String data="";
        data+="Name:"+Name+"\n";
        for (int i = 0; i < 3; i++) {
            data+="Score "+(i+1)+":"+Scores[i]+"\n";
        }
        data+="Highest Mark:"+getHighScore()+"\n";
        data+="Average:"+getAverage()+"\n";
        return data;
    }
    
}
