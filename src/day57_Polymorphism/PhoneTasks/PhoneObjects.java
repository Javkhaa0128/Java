package day57_Polymorphism.PhoneTasks;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("12","pro",1000);
        Samsung samsung = new Samsung("Note","12",1000);
        Huawei huawei = new Huawei("robery","3",66);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        Phone phone1 = new Iphone("12","pro",1000);
        Phone phone2 = new Samsung("Galaxy", "9",1000);
        Phone phone3 = new Huawei("china", "0.66",66);

        // Iphone[] phones = { iphone, samsung, huawei };
        // Samsung[] phones = { iphone, samsung, huawei };
        // Huawei[] phones = { iphone, samsung, huawei };

        Phone[] phones = { iphone, samsung, huawei, phone1, phone2, phone3 };


    }
}
