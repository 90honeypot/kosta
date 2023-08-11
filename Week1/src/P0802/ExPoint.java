package P0802;

public class ExPoint {
    
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.printTest3();

        Point p = t.getPorint(0);
        p.printPoint();

    }
}

class Point {
    int x;
    int y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void printPoint() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

class Test3 {
    Point[] arr;

    Test3(){
        arr = new Point[] {new Point(1,2), new Point(4,5), new Point(7,8)};
    }
    
    void printTest3() {
        int i;
        for(i=0;i<arr.length;i++) {
            arr[i].printPoint();
            System.out.println();
        }
    }

    Point getPorint(int idx) {
        if (idx < arr.length) {
            return arr[idx];
        } else {
            System.out.println("제대로 입력해라");
            return null;
        }
    }

}