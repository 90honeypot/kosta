package P0808;

class Point {
    int x;
    int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() { // 객체를 설명 메서드. 타입@참조값
        return "Point [x=" + x + ", y=" + y + "]";
    }
}

abstract class Shape {
    protected Point[] points;

    public abstract void draw();

}

class Circle extends Shape {
    private int r;

    public Circle() {
        r = 10;
        points = new Point[] { new Point(5, 5) };
    }

    @Override
    public void draw() {
        System.out.println("반지름: " + r);
        System.out.println("중심점: " + points[0]);
        System.out.println("의 원을 그림");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        points = new Point[] { new Point(0, 0), new Point(2, 5), new Point(2, 0), new Point(0, 5) };
    }

    @Override
    public void draw() {
        System.out.println("네 꼭지점의 좌표가");
        System.out.println(points[0]);
        System.out.println(points[1]);
        System.out.println(points[2]);
        System.out.println(points[3]);
        System.out.println("인 직사각형을 그림");
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] arr = new Shape[5];
        arr[0] = new Circle();
        arr[1] = new Rectangle();

        for (int i = 0; i < 2; i++) {
            arr[i].draw();
            System.out.println();
        }
    }
}
