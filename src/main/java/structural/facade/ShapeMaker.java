package structural.facade;


/**
 * Facade pattern hides the complexities of the system and provides an interface to the client 
 * using which the client can access the system. This type of design pattern comes under structural 
 * pattern as this pattern adds an interface to existing system to hide its complexities.
 * 
 * This pattern involves a single class which provides simplified methods required by client and 
 * delegates calls to methods of existing system classes.
 * 
 * @author cengo
 *
 */
public class ShapeMaker {
	   private Shape circle;
	   private Shape rectangle;
	   private Shape square;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }
	}