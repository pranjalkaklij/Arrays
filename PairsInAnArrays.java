public class PairsInAnArrays {
    
    static void printPair(int num[])
    {
        for (int i = 0; i < num.length; i++) {
            int currNum = num[i];
            for (int j = i+1; j < num.length; j++) {
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int pairArray[] = {2, 4, 5, 6, 7};
        printPair(pairArray);
    }
}
