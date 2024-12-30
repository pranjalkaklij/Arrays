import java.util.*;
public class ArrayUserInput {
    public static void main(String[] args) {
        int marks[] = new int[10];

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[5]=sc.nextInt();

        System.out.println("English "+marks[0]);
        
        System.out.println("Phy "+marks[2]);
        
        System.out.println("history "+marks[5]);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks "+marks[i]);
        }

        System.out.println("Your Arrays Length is "+marks.length);
    }
}
