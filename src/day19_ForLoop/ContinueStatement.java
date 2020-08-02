package day19_ForLoop;

// continue statement: skips the current iteration
//                     WE ONLY USE IT IN THE LOOP
public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){    //i: 1,2,3,4,5 iteration

         if(i ==3){
             continue; // jumps to the next iteration
         }

            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("===============================");

        for(char ch = 'A'; ch <='F'; ch++){

            if(ch == 'C'){
                continue;
            }
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("==================================");





    }
}
