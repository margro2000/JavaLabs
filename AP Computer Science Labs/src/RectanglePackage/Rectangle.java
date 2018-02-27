/*■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
 ■ A no-arg constructor that creates a default rectangle.
 ■ A constructor that creates a rectangle with the specified width and height.
 ■ A method named getArea() that returns the area of this rectangle
 ■ A method named getPerimeter() that returns the perimeter.*/
package RectanglePackage;
//create class
class Rectangle {
	//create width and height
	double width =1;
	double height =1;
	//make constructors
	 Rectangle() {
	 }
	 Rectangle(double newWidth, double newHeight) {
		 width = newWidth;
		 height= newHeight;
		}
	 //create method to get area
	 double getArea() {
		 return width*height;
	 }
	//create method to get perimeter
	 double getPerimeter() {
		 return (2*height) + (2*width);
	 }

}
