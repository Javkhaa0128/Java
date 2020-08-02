package day20_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {

        char ch = 'A';
        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
                continue;    // skips everything even the iterator
             // break;          exits the loop
            }
            System.out.println(ch);
            ch++;
        }


        boolean a = true;
        while(a) {
            System.out.println("Test started");

            System.exit(0);   // terminates entire program
        }

        System.out.println("Completed");








    }
}
