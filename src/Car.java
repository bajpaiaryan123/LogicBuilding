public class Car {
    String name;
    int modelYear;
    int price;

    Car(String name, int modelYear,  int price)
    {
       this.name=name;
       this.modelYear=modelYear;
       this.price=price;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Audi",1992,3000);

        Car c2 = new Car("BMW",1995,6000);

        System.out.println("car name"+" "+ c1.name+ " "+"car model year"+ " "+c1.modelYear+ " "+ "car price"+ " "+c1.price);
        System.out.println("car name"+" "+ c2.name+ " "+"car model year"+ " "+c2.modelYear+ " "+ "car price"+ " "+c2.price);
    }
}
