public class ArraysPassByReference {
   
//Remeber array always pass by reference in java but other dataTypes are always act as pass by value
    static void updateMarks(int updateMark[],int random)
    {
        for (int i = 0; i < updateMark.length; i++) {
            updateMark[i] = updateMark[i] +1 ;
        }
        random =random+100;
    }
    public static void main(String[] args) {
         int marks[] = {99, 69, 89};
         int dumb = 2;
         updateMarks(marks,dumb);
         System.out.println("dumb==> "+dumb);

         for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
         }
    }
}
