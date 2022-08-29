package creational.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String type) {
		if (type.equals("rounded")) {
			return new RoundedShapeFactory();
		} else if (type.equals("shape")){
			return new ShapeFactory();
		}
		else {
			return null;
		}
	}
}