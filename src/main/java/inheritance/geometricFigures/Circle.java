package inheritance.geometricFigures;

import static java.lang.Math.PI;

public class Circle {

    private double radius;

        public Circle(double radius) {
            this.radius = radius;
            if (this.radius < 0) {
                this.radius = 0;
            }else {
                this.radius = radius;
            }

        }

        public double getRadius() {
            return radius;

        }
        public double getArea() {
            return this.radius * radius * PI;
        }

    }
