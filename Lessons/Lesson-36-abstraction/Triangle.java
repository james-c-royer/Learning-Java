
public class Triangle extends Shape {

    double base;
    double height;

    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        return this.base * this.height;
    }
;

}
