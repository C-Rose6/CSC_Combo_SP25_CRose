import java.awt.Point;
import java.awt.Rectangle;
import java.util.Scanner;

public class MutableObjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point blank;
		blank = new Point(3, 4);
		int x = blank.x;
		
		int sum = blank.x * blank.x + blank.y * blank.y;
//		System.out.println(sum);
		
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);
		double dist = p1.distance(p2);
		
//		System.out.println(blank);
//		System.out.println(dist);
		
//		printPoint(blank);
		
		Rectangle box1 = new Rectangle(0, 0, 100, 200);
		Rectangle box2 = box1;
		System.out.println(box1);
		box1.grow(50,  50);
		System.out.println(box2);
		//moveRect(box, 50, 100);
		//box.translate(50,  100);
		//System.out.println(box);
		
		//System.out.println(findCenter(box));
		System.out.println("Enter some text:");
		String text = "";
			for(int i = 0; i < 10; i++) {
				String line = sc.nextLine();
				text = text + line + '\n';
				}
			System.out.println("you entered:\n" + text);
	}

	public static void printPoint(Point p) {
		System.out.println("(" + p.x + ", " + p.y + ")");
	}

	public static double distance(Point p1, Point p2) {
		int dx = p2.x - p1.y;
		int dy = p2.y - p1.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public static Point findCenter(Rectangle box) {
		int x = box.x + box.width / 2;
		int y = box.y + box.height / 2;
		return new Point(x, y);
	}
	
	public static void moveRect(Rectangle box, int dx, int dy) {
		box.x = box.x + dx;
		box.y = box.y + dy;
	}
}
