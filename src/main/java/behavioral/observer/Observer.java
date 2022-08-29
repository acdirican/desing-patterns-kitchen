package behavioral.observer;

/**
*Observer pattern is used when there is one-to-many relationship between objects such as if one object is
*modified, its depenedent objects are to be notified automatically. 
*Observer pattern falls under behavioral pattern category.
*
*/
public abstract class Observer {
	   protected Subject subject;
	   public abstract void update();
	}