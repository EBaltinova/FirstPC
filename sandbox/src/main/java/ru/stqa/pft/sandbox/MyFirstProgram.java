package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		/*hello("world");
		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(5,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b +" = " + r.area ());
		*/
		Point p1 = new Point(2,3);
		Point p2 = new Point(5,7);
		System.out.println("Расстояние между точками (" + p1.x + "," + p1.y + ") и (" + p2.x + "," + p2.y +") = " + distance(p1,p2));
	}
	/*public static void hello(String somebody){
	    System.out.println("Hi, " + somebody + "!");
	} */
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
	}
}
