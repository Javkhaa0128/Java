package day20_WhileLoops;
/* Task3. write a program that remove the duplicate from any given String
ex:
input: abcabcaabb
output: abc

 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "aabb";
        //            0123

        String result = "";

        for(int i = 0; i <= str.length()-1; i++ ){
            String s = ""+str.charAt(i);     // a, a, b, b
            if( !result.contains(s) ){
                result += s;
            }

        }
        System.out.println(result);










    }
}
