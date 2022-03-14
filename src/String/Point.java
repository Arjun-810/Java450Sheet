import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int findarea(List<Point> l, int n) {
        int area = 0;

        int j = n - 1;
        for (int i = 0; i < n; i++) {
            area += (l.get(j).x + l.get(i).x) * (l.get(j).y - l.get(i).y);

            j = i;
        }

        return Math.abs(area / 2);
    }

    public static int orient(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);

        if (val == 0)
            return 0;
        return (val > 0) ? 1 : 2;
    }

    public static void hull(Point points[], int n) {

        if (n < 3)
            return;

        Vector<Point> hull = new Vector<Point>();

        int l = 0;
        for (int i = 1; i < n; i++)
            if (points[i].x < points[l].x)
                l = i;

        int p = l, q;
        do {

            hull.add(points[p]);

            q = (p + 1) % n;

            for (int i = 0; i < n; i++) {

                if (orient(points[p], points[i], points[q]) == 2)
                    q = i;
            }

            p = q;

        } while (p != l);

        System.out.print(findarea(hull, hull.size()));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Point points[] = new Point[n];
        for (int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(" ");
            points[i] = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }
        hull(points, n);
    }
}