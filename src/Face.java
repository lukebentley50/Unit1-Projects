import java.awt.Color;
import java.awt.Graphics;

public class Face {
    private Color fc,ec;
    private int x,y,diameter;
    private Graphics g;
    private boolean isHappy;
    
    public Face(Graphics graph,int xPos,int yPos){
        fc=Color.red;
        ec=Color.yellow;
        x=xPos;
        y=yPos;
        g=graph;
        diameter=100;    
        isHappy=Math.random()<=0.5;
    }
    
    public void move(int xPos,int yPos){
        x=xPos;
        y=yPos;
        draw();
    }
    
    public void toggleMood(){
        isHappy=!isHappy;
    }
    
    public void setColors(Color f,Color e){
        fc=f;
        ec=e;
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        drawMouth();
    }
    
    public void resize(int size){
        diameter=size;
        move(x,y);
    }
    
    private void drawHead(){
        g.setColor(fc);
        g.fillOval(x, y,diameter ,diameter);
        g.setColor(Color.black);
        g.drawOval(x, y, diameter, diameter);
    }
    
    private void drawEyes(){
        g.setColor(ec);
        g.fillOval(x+diameter/5, y+diameter/5, diameter/4, diameter/4);
        g.fillOval(x+(int)(2.75*diameter/5), y+diameter/5, diameter/4, diameter/4);
        
        g.setColor(Color.black);
        g.drawOval(x+diameter/5, y+diameter/5, diameter/4, diameter/4);
        g.drawOval(x+(int)(2.75*diameter/5), y+diameter/5, diameter/4, diameter/4);
    }
    
    private void drawMouth(){
        g.setColor(Color.black);
        g.drawLine(x+(int)(.3*diameter), y+(int)(.75*diameter), x+(int)(.7*diameter), y+(int)(.75*diameter));
        if(isHappy){
            g.drawLine(x+(int)(.3*diameter), y+(int)(.75*diameter), x+(int)(.25*diameter), y+(int)(.65*diameter));
            g.drawLine(x+(int)(.7*diameter), y+(int)(.75*diameter), x+(int)(.75*diameter), y+(int)(.65*diameter));
        }else{
            g.drawLine(x+(int)(.3*diameter), y+(int)(.75*diameter), x+(int)(.25*diameter), y+(int)(0.85*diameter));
            g.drawLine(x+(int)(.7*diameter), y+(int)(.75*diameter), x+(int)(.75*diameter), y+(int)(0.85*diameter)); 
        }
    }
    
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(x-10, y-10, diameter+20, diameter+20);
    }
}
