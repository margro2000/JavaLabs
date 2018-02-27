/*Write a test
program that creates two Rectangle objects—one with width 4 and height 40
and the other with width 3.5 and height 35.9. Display the width, height, area,
and perimeter of each rectangle in this order*/
package RectanglePackage;

public class RectangleTest {
	public static void main(String[] args) {
		//create Rectangle 1
		Rectangle rectangle1= new Rectangle(4, 40);
		//display aspects of Rectangle 1
		System.out.println("Rectangle 1 has a width of " + rectangle1.width + ", a height of " + rectangle1.height + ", an area of " +rectangle1.getArea()+ ", and a perimeter of " +rectangle1.getPerimeter());
		
System.out.println();
		//create Rectangle 1
		Rectangle rectangle2= new Rectangle(3.5, 35.9);
		//display aspects of Rectangle 1
		System.out.println("Rectangle 2 has a width of " + rectangle2.width + ", a height of " + rectangle2.height + ", an area of " +rectangle2.getArea()+ ", and a perimeter of " +rectangle2.getPerimeter());
	}

}
