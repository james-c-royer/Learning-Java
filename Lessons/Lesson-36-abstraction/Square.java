
public class Square extends Shape {

    double length;
    double height;

    Square(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    double area() {
        return this.length * this.height;
    }
;
}
