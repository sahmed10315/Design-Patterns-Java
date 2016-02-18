package visitor.ex1;

public class TestVisitor {
    public static void main(String[] args) {
        ICarElement car = new Car();
        car.accept(new CarElementPrintVisitor());
        //car.accept(new CarElementDoVisitor());
    }
}