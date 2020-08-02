package Office_Hours.Practice_07_14_2020;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"C#","C#","Python","Python","Java"};

        for(String a : words) {
          //  String s = a;
            int count = 0;

            for (String each : words) {
                if (each.equals(a)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(a);
            }
        }













    }
}
