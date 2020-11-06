package day57_Polymorphism.PhoneTasks;

public class Samsung extends Phone implements AndroidApp{

    public Samsung(String model, String size, double price) {
        super("Samsung", model, size, price);
        if(price > 1200){
            throw new RuntimeException("Samsung price cannot be greater that $1200");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void dowmnload() {
        System.out.println("Samsung is downloading App from "+AppStoreName);
    }

    public void  freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
