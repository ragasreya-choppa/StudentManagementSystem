
//This is the class for Practicing Classes and Onjects!
class CarClass
{
    String Color;
    String Brand;
    int Speed;

    void drive()
    {
        System.out.println("Car is Driving");
    }
}
public class Car
{
    public static void main(String[]args)
    {
        CarClass CC = new CarClass();
        CC.Brand = "Audi";
        CC.Color = "Red";
        CC.Speed = 75;
        System.out.println(CC.Brand);
        System.out.println(CC.Color);
        System.out.println(CC.Speed);


        CC.drive();

    }
}