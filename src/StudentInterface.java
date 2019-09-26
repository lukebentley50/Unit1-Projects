
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentInterface {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Student[] students = new Student[]{new Student(),new Student()};
        String name;
        for (int x = 0; x < 2; x++) {
            System.out.print("Enter name for student "+(x+1)+"(at least 1 letter):");
            while (true){
                try{
                    students[x].setName(s.next());
                    break;
                } catch (IOException ex) {
                    System.out.println(ex.toString()+". Please try again");
                }
            }
            for (int i = 1; i < 4; i++) {
                while(true){
                    System.out.format("Enter test score %d for %s:", i,students[x].getName());
                    try {
                        students[x].setScore(i, s.nextInt());
                        break;
                    } catch (IOException ex) {
                        System.out.println("Invalid number. Please try again");
                    }
                }
            }
            s.nextLine();
            System.out.println("\n----------------------\n");
        }
        System.out.println(students[0]);
        System.out.println("\n----------------------\n");
        System.out.println(students[1]);
    }
}
