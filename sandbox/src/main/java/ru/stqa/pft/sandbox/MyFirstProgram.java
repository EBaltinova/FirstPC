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
		System.out.println("Расстояние между точками (" + p1.x + "," + p1.y + ") и (" + p2.x + "," + p2.y +") = " + Point.distance(p1, p2));
	}

}
