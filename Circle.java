class Circle {
        private float radius;
    Circle() {
        radius = 0.0f;
    }
     Circle(float radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Radius of Circle = " + radius;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.radius == c.radius;
        }
        return false;
    }
        public double area() {
        return Math.PI * radius * radius;
    }
       public double area(Circle c) {
        return Math.PI * c.radius * c.radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0f);
        Circle c2 = new Circle(5.0f);
        Circle c3 = new Circle(3.0f);
        System.out.println(c1);               
        System.out.println("Area = " + c1.area());
        System.out.println("Area of c3 = " + c1.area(c3));
        System.out.println("c1 equals c2 " + c1.equals(c2));
        System.out.println("c1 equals c3 " + c1.equals(c3));
    }
}
