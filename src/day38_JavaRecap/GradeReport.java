package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,55,95,73,73,35,47,60,87,77,67,57,99,93,83,73,63,53,43));

        ArrayList<Integer> gradeA = new ArrayList<>();
        gradeA.addAll(list);
        gradeA.removeIf( each -> each < 90 );

        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf( each -> each < 80 || each > 89 );

        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf( each -> each < 70 || each > 79 );

        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf( each -> each < 60 || each > 69 );

        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf( each -> each > 59  );

        System.out.println(gradeA);
        System.out.println(gradeB);
        System.out.println(gradeC);
        System.out.println(gradeD);
        System.out.println(gradeF);

        System.out.println("=====================================");
        System.out.println(gradeA.size()+" students made A");
        System.out.println(gradeB.size()+" students made B");
        System.out.println(gradeC.size()+" students made C");
        System.out.println(gradeD.size()+" students made D");
        System.out.println(gradeF.size()+" students failed");






    }
}
