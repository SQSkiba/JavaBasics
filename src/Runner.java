public class Runner {
    public static void main(String[]args){
    Car simoneCar = new Car(2019,"Chevrolet", 0, "bolt");
    simoneCar.setMiles(1375);
    simoneCar.toString();

    Rectangle newRect = new Rectangle(20,5);

    System.out.println(newRect.getArea());
    System.out.println( newRect.getDiagonal());
    System.out.println(newRect.isSquare());
    }




}
